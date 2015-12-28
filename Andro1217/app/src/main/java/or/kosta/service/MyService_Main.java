package or.kosta.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import or.kosta.andro1217.R;

public class MyService_Main extends AppCompatActivity {


    private Button start_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_service_main);
        start_btn = (Button) findViewById(R.id.start_btn);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyService_Main.this, MyServiceTask.class);
                // Intent를 사용해서 StartService()란 메서드를 호출하면
                // MyServiceTask 객체는 서비스로 등록되면서 프로세스가 실행
                startService(intent);
            }
        });


    }
}
