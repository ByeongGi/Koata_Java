package or.kosta.myand1209;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by kosta on 2015-12-09.
 */
public class Ex1_Hello extends AppCompatActivity implements View.OnClickListener{

    // (실습목적) : 등록한 버튼 객체를 R.java 에서 불러온후
    // 멤버필드에 등록한다.
    private Button btn1;
    private TextView tex;

    // 메니페스트에서 현재 액비티비를 호출할때
    // 번들 객체를 인자로 주입 !..
    // 부모 클래스의 onCreate를 완성 View 객체를 생성

    // 번들이란 액티비티간의 통신을 하기 위해 전달되는 객체
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 레이아웃을
        // xml 레이아웃을 현재 액티비티에 주입한다.
        // R.java 내가 설정한 객체를 Resourec 객체 // static 자원으로 등록
        setContentView(R.layout.ex1); // 레이아웃 객체를 주입

        // 레이아웃에서 R.java 생성된 자원을  찾아오는 메서드를 사용
        btn1 = (Button) findViewById(R.id.ex1_btn);
        tex = (TextView) findViewById(R.id.ex1_text);

        // 이벤트를 감지
        btn1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        tex.setText("MY NAME IS BYEONG GI ! ");
    }
}
