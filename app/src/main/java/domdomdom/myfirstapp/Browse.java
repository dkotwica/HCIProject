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


public class Browse extends ActionBarActivity {

    HashMap<String, List<String>> Bar_Category;
    List<String> Bar_List;
    ExpandableListView Exp_list;
    BeerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
        Exp_list = (ExpandableListView) findViewById(R.id.exp_list);
        Bar_Category = BeerData.getInfo();
        Bar_List = new ArrayList<String>(Bar_Category.keySet());
        adapter = new BeerAdapter(this, Bar_Category, Bar_List);
        Exp_list.setAdapter(adapter);
    }
    public void sendDirections(View view) {
        Intent intent = new Intent(this, Directions.class);
        startActivity(intent);
    }



}
