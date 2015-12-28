package or.kosta.andro1218;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class Notidication extends AppCompatActivity {

    private Button nofication_Start_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notidication);
        nofication_Start_Btn = (Button) findViewById(R.id.btn1);

        nofication_Start_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Notification 알람은 반드시 알람창에 아이콘을 등록해야함
                int n_icon = R.drawable.macclient;
                // tickText 를 등록 : 알림창에 보여지는 메세지
                CharSequence tikerText ="새로운 세일이 진행되었습니다";

                // 알림창의 본문 내용
                Context context = getApplicationContext();
                CharSequence contentTitle = "빅세일 이벤트";
                CharSequence contentText = "세일 이벤트가 있습니다. 연결해주세요";

                // 인텐트 객체 생성
                Intent intent = new Intent(context,Next_Page.class);

                // 어떤 이벤트가 부여 되기 까지 기다려 주는 이벤트
                // (백그라운드에서 대기)
                // Notification이 실행이되고 내용을 사용자가
                // Click했을 때 그때 실행 되는 인텐트 ******
                //PendingIntent contentIntent =
                // PendingIntent.getActivity(context, 0, intent, 0);

                /*
                * NotificationCompat.Builder
                * Notification.Builder 는 안드로이드 3.0(API Level 11) 부터 추가가 되었다.
                *이전 버전의 호환성을 제공하기 위해 support v4 내 NotificationCompat.Builder 를 사용한다.
                * Notification 객체를 생성하기 위한 클래스.
                * Notification 의 Layout 설정을 돕고 모든 flags 를 쉽게 제어할 수 있도록 한다.
                * */
                android.support.v4.app.NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(Notidication.this)
                        .setSmallIcon(R.drawable.macclient)
                        .setContentTitle("My Notification")
                        .setContentText("Hello World!");

                /*
                 * TaskStackBuilder
                 * Cross-task navigation 을 위한 합성 back stack 을 생성하기 위한 유틸리티 클래스이다.
                 * 안드로이드 버전 3.0(허니콤, API Level 11) 부터 Back Key를 통한 App navigation 정책 변경 되었다.
                 * Back Key 동작은 현재 타스크 내에서만 동작하고, 다른 Task 를 가로지를 수 없다. task 들을 가로지르고
                 * 이전 타스크로 가기 위해서는 "Recents"를 통해야 한다.
                 * cross-task navigation 을 사용하기 위해서는 startActivities() 혹은 TaskStackBuilder.getPendingIntent() 를 통해 구현할 수 있다.
                 * Intent 를 생성한 뒤 TaskStackBuilder 객체에 추가한 후 이를 바탕으로 TaskStackPendingIntent 객체를 완성한다.
                 * Methods
                   - addNextIntent() : Add a new intent to the task stack (backstack 에 activity 들이 쌓임)
                   - addParentStack() : Add the activity parent chain as specified by manifest <meta-data> element to the task stack builder
                    (xml 에 명시된 parent activity 들이 찾아가면 chain 형식처럼 parent activity 가 없는 activity 를 만날때까지 추가 된다)
                * Notification 을 클릭하여 특정 Activity 로 진입 한 후 Back Key 를 누를 경우 Home 화면으로 전환이 된다.
                * 이때, Home 화면이 아닌 back stack 이 존재 하였던 것과 같이 동작을 원할 때 사용된다.
                * Example : NotiResultActivity, NotiResultActivity1, NotiResultActivity2 가 존재하고 Noti 선택 시 NotiResultActivity2가 보여지고,
                * Back Key 를 누를 때마다 NotiResultActivity1 -> NotiResultActivity -> Home 순으로 표현이 되길 원할 경우.
                 * 즉, Noti 를 클릭 하였을 때 NotiResultActivity -> NotiResultActivity1 -> NotiResultActivity2 순으로 backstack 이 구성되어진 경우.
                * */

                TaskStackBuilder stackBuilder = TaskStackBuilder.create(Notidication.this);
                stackBuilder.addParentStack(Next_Page.class);
                stackBuilder.addNextIntent(intent);

                //Notification notification = new Notification(n_icon, tickerText, System.currentTimeMillis());
                PendingIntent resultPendingIntent =
                        stackBuilder.getPendingIntent(
                                0,
                                PendingIntent.FLAG_UPDATE_CURRENT
                        );
                mBuilder.setContentIntent(resultPendingIntent);
                mBuilder.setAutoCancel(true);
                NotificationManager mNotificationManager =
                        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                // mId allows you to update the notification later on.
                mNotificationManager.notify(1, mBuilder.build());

            }
        });
    }
}
