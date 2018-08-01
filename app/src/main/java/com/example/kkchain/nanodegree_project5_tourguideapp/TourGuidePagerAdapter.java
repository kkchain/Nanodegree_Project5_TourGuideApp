package com.example.kkchain.nanodegree_project5_tourguideapp;

import android.support.annotation.Nullable;
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
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ShopFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new PlayFragment();
        } else {
            return new ParksFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "SHOP";
        } else if (position == 1) {
            return "FOOD";
        } else if (position == 2) {
            return "PLAY";
        } else {
            return "PARKS";
        }
    }
}