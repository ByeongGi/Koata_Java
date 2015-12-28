package or.kosta.andro1215;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;

import android.os.Handler;
/**
 * Created by kosta on 2015-12-15.
 */
public class InnerCanvas extends View{

    private Path path;
    private Paint paint;
    private ArrayList<Path> pathList;
    private ArrayList<Paint> paintList;
    private int color, weight;
    private String motion;
    private int color_s, size_s;
    private BufferedReader in;
    private PrintWriter out;
    private Socket s;
    private float x, y;
    private Handler network_handler = new Handler();

    private String proto1,proto2,proto3,proto4,proto5,proto6,proto7,proto8;



    // 커스텀 View 가 생성이 될때 서버로 연결된 소켓의 주소를
    // 가지고 스레그가 그 좌표로 그림을 받기 위해서 소켓을 생성시 주입
    public InnerCanvas(Context context,Socket s) {
        super(context);
        this.s= s;
        this.path = new Path();
        this.paint = new Paint();

        try {
            out = new PrintWriter(new BufferedOutputStream(s.getOutputStream()),true);
            in  = new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        t.start();

    }

    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                while (true){
                    String protocol = in.readLine();
                    Log.d("MYLOG",protocol);
                    StringTokenizer st =
                            new StringTokenizer(protocol,"/");
                    // Protocol 가져오기
                    proto1 = st.nextToken();
                    proto2 = st.nextToken();
                    proto3 = st.nextToken();
                    proto4 = st.nextToken();
                    proto5 = st.nextToken();
                    proto6 = st.nextToken();
                    proto7 = st.nextToken();
                    proto8 = st.nextToken();

                    // 프로토콜 판별
                    if (proto1.equals("room") && proto2.equals("draw")){
                        Log.d("MYLOG",proto1);

                        x = Float.parseFloat(proto4);
                        y = Float.parseFloat(proto5);
                        if(proto6.equals("start")){
                            path.moveTo(x,y); // 선을 그을 시작점
                        }else if(proto6.equals("drag")){
                            path.lineTo(x,y); // 선을 그을 지점
                        }
                        invalidate();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    });

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundColor(Color.WHITE);
        paint.setAntiAlias(true);
        // 선 굵기 , 스타일 지정 (Sprinner로부터 지정한 값으로 변경 )
        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        paint.setStyle(Paint.Style.STROKE);
        color_s = Color.BLACK;
        size_s = 10;
        // 저장된 선을 그려주는 영역
        canvas.drawPath(path,paint);
    }

    // 화면에 터치할때 시작점을호출하고 Move 일 때 그리기를 구현
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        StringBuffer sb = new StringBuffer();
        // 터치 시에 X, Y 값을 얻어와서 저장한다.
        float x = event.getX();
        float y = event.getY();
        // Action 이 있을때
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            motion = "start";
        } else if (event.getAction() == MotionEvent.ACTION_MOVE){
            motion = "drag";
        }

        sb.append("room/draw/").append(color_s).append("/");
        sb.append(x).append("/").append(y).append("/");
        sb.append(motion).append("/").append(size_s).append("/").append("writer");

        out.println(sb.toString());
        // 현재 뷰에서 터치 이벤트를 사용하는 거승로 판단해서
        // 더이상 다른 곳으로 이벤트를 전달 할 필요가 없을때 true
        return true;
    }
}
