package domdomdom.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class NewBeer extends ActionBarActivity {

    HashMap<String, List<String>> Description_Category;
    List<String> Description_List;
    ExpandableListView Exp_list;
    BeerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_beer);
        Exp_list = (ExpandableListView) findViewById(R.id.exp_list);
        Description_Category = DescriptionStuff.getInfo();
        Description_List = new ArrayList<String>(Description_Category.keySet());
        adapter = new BeerAdapter(this, Description_Category, Description_List);
        Exp_list.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_beer, menu);
        return true;
    }
    public void sendFlavor(View view) {
        Intent intent = new Intent(this, Beer_Flavor.class);
        startActivity(intent);
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
