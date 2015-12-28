package or.kosta.myand1210;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by kosta on 2015-12-10.
 */
public class Ex1_Edit extends AppCompatActivity implements View.OnClickListener{

    private EditText edit1;
    private Button btn1;
    private TextView txt1;
    private int col;
    private LinearLayout ly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex1_edit); // 레이아웃 객체

        edit1= (EditText) findViewById(R.id.ex1_edit);
        btn1 = (Button) findViewById(R.id.ex1_btn);
        txt1 = (TextView) findViewById(R.id.ex_text1);
        ly= (LinearLayout) findViewById(R.id.ex1_layout);
        col = Color.MAGENTA;
        btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String val = edit1.getText().toString();

        if("hi".equals(val)) val ="hi";
        if("good".equals(val)) val ="good";
        if("hello".equals(val)) val ="hello";
        int[] colors = {Color.BLUE,Color.GREEN,Color.RED,0xFFFF1493};
        int random  = new Random().nextInt(4);
        txt1.setText(val);
        ly.setBackgroundColor(colors[random]);
    }
}
