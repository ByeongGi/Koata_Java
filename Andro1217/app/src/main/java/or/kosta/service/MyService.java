package or.kosta.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import or.kosta.andro1217.R;

/**
 * Created by kosta on 2015-12-18.
 */
public class MyService extends AppCompatActivity {

    private Button stop_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myservice);
        stop_btn = (Button) findViewById(R.id.stop_btn);
        stop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyService.this,MyServiceTask.class);
                stopService(intent);
            }
        });

    }
}
