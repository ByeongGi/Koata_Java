package or.kosta.service;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.NotificationCompat;

import or.kosta.andro1217.Login_res;
import or.kosta.andro1217.R;

/**
 * Created by kosta on 2015-12-18.
 */
// Service는 백그라운드에서 활동되는 프로세스에 등록되는 객체
// 안드로이드 환경에서 어플리케이션에서 실행되는 앱을 폰에서 조사
public class MyServiceTask extends Service implements Runnable{

    private Boolean flag;
    private NotificationManager mNotificationManager;

    private int count;
    // 서비스가 의해서 호출이 실행해야 하는 동작을 Thread 에서 정의
    @Override
    public void run() {
        while (flag){
            count++;
            System.out.println("Count : "+count);
            if(count == 10){
                // 외부의 특정 이벤트라던지 , 장치로부터의
                // 특정 이벤트로 대체될수 있음 ...
                // 이럴때 특정 액티비티로 이동하기 ...
                Intent intent = new Intent(MyServiceTask.this,MyService.class);
                // 서비스에서 이동해야 할 액티비티의 TASK를 활성화 해주어야함.
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // TASK 활성화 상수 지정
                startActivity(intent);

                android.support.v4.app.NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(MyServiceTask.this)
                                .setSmallIcon(R.drawable.macclient)
                                .setContentTitle("MESSAGE")
                                .setContentText("10 초가 지났습니다");



                TaskStackBuilder stackBuilder = TaskStackBuilder.create(MyServiceTask.this);
                stackBuilder.addParentStack(MyService.class);
                stackBuilder.addNextIntent(intent);

                //Notification notification = new Notification(n_icon, tickerText, System.currentTimeMillis());
                PendingIntent resultPendingIntent =
                        stackBuilder.getPendingIntent(
                                0,
                                PendingIntent.FLAG_UPDATE_CURRENT
                        );
                mBuilder.setContentIntent(resultPendingIntent);
                mBuilder.setAutoCancel(true);
                // mId allows you to update the notification later on.
                mNotificationManager.notify(1, mBuilder.build());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    // 서비스가 실행하는 메서드
    // OnCreate() -> onBInd() -> onDestory();
    @Override
    public void onCreate() {
        super.onCreate();
        Thread myT = new Thread(this);
        flag =true;
        myT.setDaemon(true);
        myT.start();
        mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        flag = false;
        count =0;

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }
}
