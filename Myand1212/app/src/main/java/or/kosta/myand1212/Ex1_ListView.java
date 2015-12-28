package or.kosta.myand1212;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by kosta on 2015-12-12.
 */
public class Ex1_ListView extends AppCompatActivity {
    private String[] conntries={"korea","Italy","spain","france","Belgium"};
    private ListView ex1_listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ex1_listView = (ListView) findViewById(R.id.ex1_listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,conntries);
        ex1_listView.setAdapter(adapter);
        ex1_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("MYLOG",position+"");
                Toast.makeText( getApplicationContext() , conntries[position] , Toast.LENGTH_SHORT ).show();
            }
        });

    }
}
