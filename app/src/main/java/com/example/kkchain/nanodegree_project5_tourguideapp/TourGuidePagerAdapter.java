package com.example.kkchain.nanodegree_project5_tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate{@link Fragment} for a view pager
 */

public class TourGuidePagerAdapter extends FragmentPagerAdapter {

    public TourGuidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        if (position == 0) {
            return new ShopFragment();
        } else {
            return new FoodFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}