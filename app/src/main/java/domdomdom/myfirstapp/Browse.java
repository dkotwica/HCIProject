package domdomdom.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Browse extends ActionBarActivity {

    HashMap<String, List<String>> Movies_category;
    List<String> Movies_list;
    ExpandableListView Exp_list;
    BeerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
        Exp_list = (ExpandableListView) findViewById(R.id.exp_list);
        Movies_category = BeerData.getInfo();
        Movies_list = new ArrayList<String>(Movies_category.keySet());
        adapter = new BeerAdapter(this, Movies_category, Movies_list);
        Exp_list.setAdapter(adapter);
    }



}
