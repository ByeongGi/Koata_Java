package or.kosta.andro1214;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import or.kosta.model.Member_Vo;

public class Ex1_Sub extends AppCompatActivity {


    private Button btn;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex1_sub);

        // intent 객체를 가져온다.
        Intent intent=getIntent();
        // 번들로 가져온다
        Bundle mydata=intent.getBundleExtra("mydata");
        // 값을 가져온다.
        Member_Vo vo= (Member_Vo) mydata.getSerializable("vo");

        String id=vo.getId();
        String password = vo.getPassword();
        String name = vo.getName();
        Log.d("MYLOG",id);
        Log.d("MYLOG",password);
        Log.d("MYLOG",name);


        btn = (Button) findViewById(R.id.ex1_sub_btn_back);
        txt = (TextView) findViewById(R.id.ex1_sub_textview);


        StringBuffer sb = new StringBuffer();
        sb.append(name+" 회원님 안녕하세요 ! \n"+ id+"계정의 가입을 축하합니다!");
        txt.setText(sb.toString());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
