package com.example.mikhail.cardviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mikhail.cardviewexample.model.CountryManager;


public class MainActivity extends Activity {

    private RecyclerView recyclerView_;
    private CountryAdapter countryAdapter_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_ = (RecyclerView)findViewById(R.id.my_recycler_view);
        recyclerView_.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_.setItemAnimator(new DefaultItemAnimator());

        countryAdapter_ = new CountryAdapter(CountryManager.getInstance().getCountries(),R.layout.row_country,this);
        recyclerView_.setAdapter(countryAdapter_);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
