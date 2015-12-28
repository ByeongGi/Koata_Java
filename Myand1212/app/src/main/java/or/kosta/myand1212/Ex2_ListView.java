package or.kosta.myand1212;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kosta on 2015-12-12.
 */
public class Ex2_ListView extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2_listview);
        list = (ListView) findViewById(R.id.ex2_listView);

        ArrayList<HashMap<String,String>> myList= new ArrayList<>();
        HashMap<String,String> map;
        for (int i = 0; i<7 ; ++i){
            map = new HashMap<>();
            map. put("MemberID",(i+1)+"go");
            map. put("Name","kim"+(i+1)+"go");
            map. put("Tel","123"+(i+1)+"go");
            myList.add(map);
        }

        // ListView 에 배치하기
        // Context, ArrayList , UI, Key , 배치될 ID
        SimpleAdapter adapter = new SimpleAdapter(
                Ex2_ListView.this,
                myList,R.layout.activity_column,
                new String[]{"MemberID","Name","Tel"},
                new int[]{R.id.colMemberID,R.id.colName,R.id.colTel});

        list.setAdapter(adapter);

    }
}
