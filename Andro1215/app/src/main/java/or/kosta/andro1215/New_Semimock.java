package or.kosta.andro1215;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

/**
 * Created by kosta on 2015-12-16.
 */
public class New_Semimock extends AppCompatActivity {
    private TextView tex1;
    private EditText edit;
    private Button btn;


    private int x, y;
    private int colors[] = {Color.RED, Color.GREEN, Color.BLUE};
    private int[] sizeList = {10, 15, 20, 25, 30};
    private Spinner col, size, stroke, write;
    private int color_s, size_s;
    private Paint.Style style_s, style;
    private String ip, port, nick;
    private int color, weight;
    // 네트워크
    private String proto1, proto2, proto3, proto4, proto5, proto6, proto7, proto8;
    private StringTokenizer st;
    private Socket s;
    private BufferedReader in;
    private PrintWriter out;
    private Handler networkHandler;
    private InnerCanvas view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mock);
        // newworkHandler 생성
        networkHandler = new Handler();
        // Thread Policy
        if (Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy =
                    new StrictMode.ThreadPolicy.Builder()
                            .permitAll().build();
        }

        // UI 객체 생성

        tex1 = (TextView) findViewById(R.id.textView1);
        edit = (EditText) findViewById(R.id.editText1);
        edit.setSingleLine();
        btn = (Button) findViewById(R.id.button1);

        // InnerCanvas 가 Add 될 레이아웃
        LinearLayout ly = (LinearLayout) findViewById(R.id.layout_canvas);
        col = (Spinner) findViewById(R.id.spinner1);
        size = (Spinner) findViewById(R.id.spinner2);
        stroke = (Spinner) findViewById(R.id.spinner3);
        write = (Spinner) findViewById(R.id.spinner4);

        // Array

        // Socket 생성

        try {
            s = new Socket("localhost", 9999);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // View 생성
        view = new InnerCanvas(this, s);
        ly.addView(view);

        // readLine Thread로 돌리기
        play();

        // 게임방에서 단어를 보낼때 리스너

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    out = new PrintWriter(new BufferedOutputStream(s.getOutputStream()),true);
                    StringBuilder sb = new StringBuilder();
                    sb.append("room/chat/all/miso/");
                    sb.append(edit.getText()).append("/1/none/none");
                    out.println(sb.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void play() {
        new Thread(new Runnable() {
            // 스트림을 통해서 받아온 프로토콜을 받아냄
            @Override
            public void run() {
                try {
                    in = new BufferedReader(new InputStreamReader(
                            s.getInputStream(), "UTF-8"));
                    while (true) {

                        String protocol = in.readLine();

                        Log.d("Msg", protocol);


                        st = new StringTokenizer(protocol, "/");

                        // 프로토콜 가져오기
                        proto1 = st.nextToken();
                        proto2 = st.nextToken();
                        proto3 = st.nextToken();
                        proto4 = st.nextToken();
                        proto5 = st.nextToken();
                        proto6 = st.nextToken();
                        proto7 = st.nextToken();
                        proto8 = st.nextToken();

                        // 프로토콜 판별


                        networkHandler.post(new Runnable() {

                            @Override
                            public void run() {
                                if (proto1.equals("room") && proto2.equals("chat")) {
                                    // 자리선정
                                    if (proto6.equals("1")) {
                                        tex1.setText(proto5);
                                    }
                                }
                            }
                        });

                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
