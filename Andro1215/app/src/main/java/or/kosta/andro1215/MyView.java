package or.kosta.andro1215;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Message;
import android.view.View;
import android.os.Handler;
/**
 * Created by kosta on 2015-12-15.
 */
public class MyView extends View {

    private Paint textP;// 화면에 글자 표시
    private float sec; // 화면에 초를 표시
    private float msec; // 화면에 초를 표시
    private float min; // 화면에 초를 표시
    private Paint textP2;


    public MyView(Context context) {
        super(context);
        textP = new Paint();
        textP.setTextSize(30);
        textP.setColor(Color.BLUE);
        textP.setAntiAlias(true); // 부드러운 처리
        hander.sendEmptyMessageDelayed(0, 100);


        textP2 = new Paint();
        textP2.setTextSize(60);
        textP2.setColor(Color.GREEN);
        textP2.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawText("Time"+min+"분 / "+sec+"초 / "+ msec + " sec"+"밀리세컨드" ,0,80,textP);

    }

    private Handler hander = new Handler(){
        @Override
        public void handleMessage(Message msg) {

            msec +=100;
            if ((msec*10)%1000 == 0) sec+=1;

            invalidate(); // repaint() 와 동일함
             hander.sendEmptyMessageDelayed(0,100);

        }
    };
}
