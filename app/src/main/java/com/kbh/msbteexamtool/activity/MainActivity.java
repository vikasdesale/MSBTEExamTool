package com.kbh.msbteexamtool.activity;

/**
 * Created by Dell on 2/1/2017.
 */

 import android.os.Bundle;
 import android.support.design.widget.CollapsingToolbarLayout;
 import android.support.design.widget.TabLayout;
 import android.support.v4.view.ViewPager;
 import android.support.v7.app.AppCompatActivity;
 import android.support.v7.widget.Toolbar;
 import android.view.Menu;
 import android.view.MenuItem;
 import android.widget.ImageView;

 import com.kbh.msbteexamtool.R;
 import com.kbh.msbteexamtool.adapters.ViewPagerAdapter;
 import com.kbh.msbteexamtool.fragments.MSBTEFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.htab_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Parallax Tabs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.htab_viewpager);
        setupViewPager(viewPager);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.htab_tabs);
        tabLayout.setupWithViewPager(viewPager);

        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.htab_collapse_toolbar);
        collapsingToolbarLayout.setTitleEnabled(false);


    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new MSBTEFragment(getResources().getColor(R.color.accent_material_light)), "CSE");
        adapter.addFrag(new MSBTEFragment(getResources().getColor(R.color.ripple_material_light)), "MECH");
        adapter.addFrag(new MSBTEFragment(getResources().getColor(R.color.button_material_dark)), "CIVIL");
        viewPager.setAdapter(adapter);
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
