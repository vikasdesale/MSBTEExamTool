package com.kbh.msbteexamtool.activity;

/**
 * Created by Dell on 2/1/2017.
 */

 import android.content.Intent;
 import android.os.Bundle;
 import android.support.design.widget.CollapsingToolbarLayout;
 import android.support.design.widget.TabLayout;
 import android.support.v4.view.ViewPager;
 import android.support.v7.app.AppCompatActivity;
 import android.support.v7.widget.Toolbar;
 import android.view.Menu;
 import android.view.MenuItem;
 import android.widget.ImageView;
 import android.widget.TextView;

 import com.kbh.msbteexamtool.R;
 import com.kbh.msbteexamtool.adapters.ViewPagerAdapter;
 import com.kbh.msbteexamtool.fragments.MSBTEFragment;

 import butterknife.BindView;
 import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    @BindView(R.id.htab_viewpager) private ViewPager viewPager;
    @BindView(R.id.htab_tabs) private TabLayout tabLayout;
    @BindView (R.id.htab_toolbar) private  Toolbar toolbar;
    @BindView(R.id.htab_collapse_toolbar) private CollapsingToolbarLayout collapsingToolbarLayout;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("MSBTE Exam Tool");
        collapsingToolbarLayout.setTitleEnabled(false);
        setupViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(this);
    }

    private void setupViewPager(ViewPager viewPager) {
        tabLayout.addTab(tabLayout.newTab().setText("Semester 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Semester 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Semester 3"));
        tabLayout.addTab(tabLayout.newTab().setText("Semester 4"));
        tabLayout.addTab(tabLayout.newTab().setText("Semester 5"));
        tabLayout.addTab(tabLayout.newTab().setText("Semester 6"));


        adapter = new ViewPagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
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

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
