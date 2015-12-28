package or.kosta.myand1212;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kosta on 2015-12-12.
 */
public class Ex3_ListView extends AppCompatActivity {
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2_listview);
        list = (ListView) findViewById(R.id.ex2_listView);

        ArrayList<HashMap<String,Object>> myList= new ArrayList<>();
        int[] imgs= {R.drawable.w1,R.drawable.w2,R.drawable.w3,R.drawable.w4 ,
                     R.drawable.w5,R.drawable.w6,R.drawable.w7,R.drawable.w8};
        HashMap<String,Object> map;
        for (int i = 0; i<7 ; ++i){
            map = new HashMap<>();
            map.put("img",imgs[i]);
            map.put("MemberID", (i + 1) + "go");
            map. put("Name","kim"+(i+1)+"go");
            map. put("Tel","123"+(i+1)+"go");
            myList.add(map);
        }

        // ListView 에 배치하기
        // Context, ArrayList , UI, Key , 배치될 ID
        SimpleAdapter adapter = new SimpleAdapter(Ex3_ListView.this,
                myList,R.layout.exam1_listview,
                new String[]{"img","MemberID","Name","Tel"},
                new int[]{R.id.img,R.id.col_1,R.id.col_2,R.id.col_3});

        list.setAdapter(adapter);
    }



}

/*
class ListAdpter  extends BaseAdapter {

    public ListAdpter(Context context, int layout, ArrayList<HashMap<String,String> list) {
        this.
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
*/
