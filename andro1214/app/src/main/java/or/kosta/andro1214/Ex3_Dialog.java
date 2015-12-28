package or.kosta.andro1214;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.Random;

public class Ex3_Dialog extends AppCompatActivity implements View.OnClickListener {

    private ImageButton ibtn;
    private AlertDialog.Builder builder;
    private LinearLayout ex3_ly;
    private int selectNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex3_dialog);
        ibtn = (ImageButton) findViewById(R.id.imageButton);
        ex3_ly = (LinearLayout) findViewById(R.id.ex3_ly);

        // 다이얼로그를 사용하기 위해서는 Builder로 생성

        builder = new AlertDialog.Builder(this);
        ibtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        builder.setTitle("This is My Dialog Window");
        // builder.setMessage("Hi");
        builder.setIcon(R.drawable.wifi);

        builder.setSingleChoiceItems(R.array.pic, selectNum, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selectNum = which;// 선택한 항목
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                int random = new Random().nextInt(3);
                int[] Colors = new int[]{Color.GREEN, Color.BLUE, Color.GRAY};

                ex3_ly.setBackgroundColor(Colors[random]);
            }
        });
        // 버튼의 종류

        builder.setNeutralButton("Choice", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int[] imgs ={R.drawable.w1 , R.drawable.w2,
                             R.drawable.w3 , R.drawable.w4,
                             R.drawable.w5 , R.drawable.w6};
                Log.d("MYLOG", selectNum + "");
                ex3_ly.setBackgroundResource(imgs[selectNum]);

            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.show();
    }
}
