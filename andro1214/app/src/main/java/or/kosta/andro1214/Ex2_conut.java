package or.kosta.andro1214;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Ex2_conut extends AppCompatActivity {


    private Button stBtn;
    private TextView textView;
    private ImageView iv;
    private CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2_conut);


        stBtn = (Button) findViewById(R.id.ex2_start_btn);
        textView = (TextView) findViewById(R.id.ex2_conut_res);
        iv = (ImageView) findViewById(R.id.ex2_cnt_img);

        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();
        int num = bundle.getInt("num");

        timer = new CountDownTimer(num*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Count: "+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                textView.setText("Finish");
                iv.setVisibility(View.VISIBLE);
            }
        }.start();

        stBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setVisibility(View.GONE);
                timer.start();
            }
        });

    }
}
