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
import java.util.List;


public class Beer_Flavor extends ActionBarActivity {

    HashMap<String, List<String>> Flavor_Category;
    List<String> Flavor_List;
    ExpandableListView Exp_list;
    BeerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer__flavor);
        Exp_list = (ExpandableListView) findViewById(R.id.exp_list);
        Flavor_Category = BeerFlavor.getInfo();
        Flavor_List = new ArrayList<String>(Flavor_Category.keySet());
        adapter = new BeerAdapter(this, Flavor_Category, Flavor_List);
        Exp_list.setAdapter(adapter);



    }
    public void sendDirections(View view) {
        Intent intent = new Intent(this, Directions.class);
        startActivity(intent);
    }

}
