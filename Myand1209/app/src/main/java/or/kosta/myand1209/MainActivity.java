package or.kosta.myand1209;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("내가 만든 어플리케이션");

        // 버튼 객체 주소 등록
        Button  b1 = (Button) findViewById(R.id.checkBox);

        // 이벤트 리스너 등록
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("MYLOG", "안드로이드 이벤트 리스너 등록 테스트 !!!!!!!");
                System.err.println(v.getId());
                Log.e("MYLOG", "안드로이드 이벤트 리스너 등록 테스트 !!!!!!!");
                Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

                vibrator.vibrate(2000);
            }
        });


    }
}
