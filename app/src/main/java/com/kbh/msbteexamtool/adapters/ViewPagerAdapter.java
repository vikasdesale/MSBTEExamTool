package com.kbh.msbteexamtool.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kbh.msbteexamtool.fragments.MSBTEFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 3/4/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;

    public ViewPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }



    @Override
    public Fragment getItem(int position) {

                MSBTEFragment tab1 = new MSBTEFragment();
                return tab1;

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}