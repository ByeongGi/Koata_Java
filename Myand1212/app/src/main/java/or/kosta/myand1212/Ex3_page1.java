package or.kosta.myand1212;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by kosta on 2015-12-12.
 */
public class Ex3_page1 extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex3_page1);
        btn= (Button) findViewById(R.id.ex3_btn_move);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "Click OK");    // 현재 객체의 주소 , 다음 객체의 인스턴스들의 주소를 통해서
                                             // 다음 객체의 class 정보를 통해서 Activity 생성 !
                Intent  intent =  new Intent(Ex3_page1.this,Ex3_page2.class);
                startActivity(intent);
            }
        });
    }
}



