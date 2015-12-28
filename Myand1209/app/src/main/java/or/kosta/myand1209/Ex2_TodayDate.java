package or.kosta.myand1209;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by kosta on 2015-12-09.
 */
public class Ex2_TodayDate extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2);
        Button btn_Today= (Button) findViewById(R.id.btn_Today);
        final TextView txt= (TextView) findViewById(R.id.textView_Today);
        // java JDK 8 버전 이하에서는 로컬 내부 클래스 영역 안에
        // 외부 클래스의 지역 변수를 직접 사용할수 없고 상수로 변경해야 한다 .
        // 람다식도 사용 불가
        // 익명내부클래스 - > 한번 쓰고 버릴 자원들 예) 이벤트 리스너
        btn_Today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal= Calendar.getInstance();
                txt.setText( cal.getTime().toString());
            }
        });
    }
}
