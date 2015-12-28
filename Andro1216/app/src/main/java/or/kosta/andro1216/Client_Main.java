package or.kosta.andro1216;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client_Main extends AppCompatActivity {

    private Socket client_Socket;
    private Handler Message_Handler = new Handler();
    private BufferedReader in;
    private PrintWriter out;

    private TextView tv;
    private EditText editText;
    private Button btn;
    private String msg ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client__main);
        tv  = (TextView) findViewById(R.id.server_msg);
        editText = (EditText) findViewById(R.id.edit_send);
        btn = (Button) findViewById(R.id.button);
        // Thread Policy
        if (Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy =
                    new StrictMode.ThreadPolicy.Builder()
                            .permitAll().build();
        }

        init_Socket("221.141.152.29",9999);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Send(editText.getText().toString());
            }
        });
    }

    private void Send(String m){
        try {
            out = new PrintWriter(new BufferedOutputStream(client_Socket.getOutputStream()),true);
            StringBuffer sb = new StringBuffer();
            sb.append("chat").append("/");
            sb.append(m);
            out.println(m);
        } catch (IOException e) {
            e.printStackTrace();
        }

    };

    private void onMessage(){
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true){
                    try {
                        in = new BufferedReader(new InputStreamReader(client_Socket.getInputStream(),"UTF-8"));
                        msg = in.readLine();
                            Message_Handler.post(new Runnable() {
                            @Override
                            public void run() {
                                tv.setText(msg);
                            }
                        });

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }
        }).start();
    }

    private void init_Socket(String ip,int port){
        try {
            this.client_Socket = new Socket(ip ,port);
            // 서버로 보낼 데이터 전송하는  OutputStream 가져옴

            // 서버에 보낸 데이터 전송 받는 InputStream을 가져옴


        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
