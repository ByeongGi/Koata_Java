package or.kosta.andro1214;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import or.kosta.model.Member_Vo;

/**
 * Created by kosta on 2015-12-14.
 */
public class Ex1_Home extends AppCompatActivity {


    private Button btn1;
    private EditText edit_Id;
    private EditText edit_Password;
    private EditText edit_Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex1_home);

        btn1 = (Button) findViewById(R.id.ex1_home_btn);
        edit_Id = (EditText) findViewById(R.id.ex1_home_edit_id);
        edit_Password = (EditText) findViewById(R.id.ex1_home_edit_password);
        edit_Name = (EditText) findViewById(R.id.ex1_home_edit_name);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Ex1_Sub.class);

                String id=edit_Id.getText().toString();
                String password=edit_Password.getText().toString();
                String name=edit_Name.getText().toString();

                Member_Vo vo = new Member_Vo();
                vo.setId(id);
                vo.setPassword(password);
                vo.setName(name);


                Bundle mydata = new Bundle();
                mydata.putSerializable("vo",vo);
                intent.putExtra("mydata", mydata);
                startActivity(intent);
            }
        });
    }
}
