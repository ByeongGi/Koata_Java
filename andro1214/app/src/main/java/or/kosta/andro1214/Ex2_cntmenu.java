package or.kosta.andro1214;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ex2_cntmenu extends AppCompatActivity implements View.OnClickListener{


    private Button btn1;
    private Button btn2;
    private Button btn3;
    private EditText editText1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2_cntmenu);

        editText1 = (EditText) findViewById(R.id.ex2_cnt_edit);
        btn1 = (Button) findViewById(R.id.ex2_cnt_btn_send);
        btn2 = (Button) findViewById(R.id.ex2_cnt_plus);
        btn3 = (Button) findViewById(R.id.ex2_cnt_minus);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == btn2){
            num++;
            editText1.setText(String.valueOf(num));
        } else if(v == btn3){
            if(num>0){
                num--;
            }
            editText1.setText(String.valueOf(num));
        } else if(v == btn1){
            // intent
            Intent intent = new Intent(Ex2_cntmenu.this, Ex2_conut.class);
            Bundle bundle = new Bundle();
            bundle.putInt("num",num);

            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
