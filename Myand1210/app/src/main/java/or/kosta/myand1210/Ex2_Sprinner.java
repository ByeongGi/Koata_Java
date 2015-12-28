package or.kosta.myand1210;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

/**
 * Created by kosta on 2015-12-10.
 */
public class Ex2_Sprinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private String[] items={"aaa","bbb","ccc","ddd","ee","fff"};
    private Spinner sp;
    private Button b1;
    private LinearLayout ly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2_spinner);
        ly= (LinearLayout) findViewById(R.id.ex2_ly);
        b1= (Button) findViewById(R.id.btn2);
        sp= (Spinner) findViewById(R.id.spin2);
        // String 배열 데이터를 Spinner UI 에 배치하기 위하여
        // 반드시 Adapter가 필요하다.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ly.setBackgroundResource(R.drawable.a1);
            }
        });


       sp.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int[] imgs= {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6};
        Log.e("MYLOG","위치"+position+"");
        ly.setBackgroundResource(imgs[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
