package or.kosta.andro1215;

import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Handler;

public class Ex1_Thread extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private Button btn, btn2, btn3;
    private int fnum;
    private int bnum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex1_thread);

        tv1 = (TextView) findViewById(R.id.ex1_for);
        tv2 = (TextView) findViewById(R.id.ex1_back);
        btn= (Button) findViewById(R.id.ex1_btn);
        btn2= (Button) findViewById(R.id.ex1_btn2);
        btn3= (Button) findViewById(R.id.ex1_btn3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("For  :" + fnum++);
                // tv2.setText("Back : " + bnum);
            }
        });
        // Stop을 누루면 Handler를 삭제
        // 현재 버튼은 감추어져야한다.
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.sendEmptyMessage(1);

            }
        });
        // 그 후 Start 버튼이 활성화 되어야 한다.
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.sendEmptyMessage(2);

            }
        });


        handler.sendEmptyMessageDelayed(0, 1000);
        // MyThread thread = new MyThread();
        // thread.setDaemon(true);
        // thread.start();
    }
    // Thread 정의
    public class MyThread extends Thread{

        @Override
        public void run() {
            while (true){
                bnum ++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 2. Handler 를 멤버 내부 클래스로 추가
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            // msg.what : Handler의 Index
                if(msg.what == 0){
                    bnum++;
                    tv2.setText("Back : " + bnum);

                    handler.sendEmptyMessageDelayed(0, 1000);
                } else if(msg.what == 1 ){

                    handler.removeMessages(0);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.VISIBLE);

                } else if(msg.what == 2){
                    handler.sendEmptyMessageDelayed(0, 1000);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                }

        }
    };
}
