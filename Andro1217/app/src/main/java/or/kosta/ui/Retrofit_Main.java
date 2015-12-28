package or.kosta.ui;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import or.kosta.andro1217.Login_res;
import or.kosta.andro1217.R;
import or.kosta.model.Model;
import retrofit.Callback;
import retrofit.GitApi;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class Retrofit_Main extends AppCompatActivity {

    private Button click;
    private TextView tv;
    private EditText id_tv;
    private EditText pwd_tv;
    String API = "http://221.141.152.29:8090";
    private ProgressBar pbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redrofit);
        click = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id .tv);

        id_tv  = (EditText) findViewById(R.id.id_tv);
        pwd_tv  = (EditText) findViewById(R.id.pwd_tv);

        pbar = (ProgressBar) findViewById(R.id.pb);
        pbar.setVisibility(TextView.INVISIBLE);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(API).build();
                GitApi git = restAdapter.create(GitApi.class);
                String pathv = "LogIn_Controller";
                String id = id_tv.getText().toString();
                String password = pwd_tv.getText().toString();

                git.getFeed(pathv, id, password, new Callback<Model>() {
                    @Override
                    public void success(Model model, Response response) {
                        Log.d("MYLOG", model.getRes());
                        Log.d("MYLOG", model.getId());
                        Log.d("MYLOG", model.getPassword());

                        String res =model.getRes();
                        String msg = "";
                        if (res.equals("1")) msg ="Login Success";
                        else if (res.equals("0")) msg ="login Fail";
                        // Intent intent = new Intent(getApplicationContext(), Login_res.class);
                        // intent.putExtra("msg",msg);
                        // startActivity(intent);



                        // Notification 알람은 반드시 알람창에 아이콘을 등록해야함
                        int n_icon = R.drawable.macclient;
                        // tickText 를 등록 : 알림창에 보여지는 메세지

                        // 알림창의 본문 내용
                        Context context = getApplicationContext();

                        // 인텐트 객체 생성
                        Intent intent = new Intent(context,Login_res.class);
                        intent.putExtra("msg",msg);
                        android.support.v4.app.NotificationCompat.Builder mBuilder =
                                new NotificationCompat.Builder(Retrofit_Main.this)
                                        .setSmallIcon(R.drawable.macclient)
                                        .setContentTitle("LOGIN MESSAGE")
                                        .setContentText(msg);



                        TaskStackBuilder stackBuilder = TaskStackBuilder.create(Retrofit_Main.this);
                        stackBuilder.addParentStack(Login_res.class);
                        stackBuilder.addNextIntent(intent);

                        //Notification notification = new Notification(n_icon, tickerText, System.currentTimeMillis());
                        PendingIntent resultPendingIntent =
                                stackBuilder.getPendingIntent(
                                        0,
                                        PendingIntent.FLAG_UPDATE_CURRENT
                                );
                        mBuilder.setContentIntent(resultPendingIntent);
                        mBuilder.setAutoCancel(true);
                        mBuilder.setPriority(0);
                        NotificationManager mNotificationManager =
                                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                        // mId allows you to update the notification later on.
                        mNotificationManager.notify(1, mBuilder.build());

                    }

                    @Override
                    public void failure(RetrofitError error) {

                    }
                });
            }
        });


    }
}
