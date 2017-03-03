package com.kbh.msbteexamtool.activity;

/**
 * Created by Dell on 2/1/2017.
 */

 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;
 import android.support.v7.widget.Toolbar;
 import android.view.Menu;
 import android.view.MenuItem;
 import com.kbh.msbteexamtool.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
       // if (id == R.id.intent_action) {
         //   return true;
        //}

        return super.onOptionsItemSelected(item);
    }
}
