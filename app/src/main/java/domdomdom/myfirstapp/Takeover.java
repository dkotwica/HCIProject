package domdomdom.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Takeover extends ActionBarActivity {

    HashMap<String, List<String>> Takeover_Week;
    List<String> Takeover_List;
    ExpandableListView Exp_list;
    BeerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeover);
        Exp_list = (ExpandableListView) findViewById(R.id.exp_list);
        Takeover_Week = TakeoverList.getInfo();
        Takeover_List = new ArrayList<String>(Takeover_Week.keySet());
        adapter = new BeerAdapter(this, Takeover_Week, Takeover_List);
        Exp_list.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_takeover, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
