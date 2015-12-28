package or.kosta.andro1217;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Login_res extends AppCompatActivity {


    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_res);
        Intent intent=getIntent();
        String msg =intent.getStringExtra("msg");

        tv = (TextView) findViewById(R.id.login_res_tv);
        tv.setText(msg);
    }
}
