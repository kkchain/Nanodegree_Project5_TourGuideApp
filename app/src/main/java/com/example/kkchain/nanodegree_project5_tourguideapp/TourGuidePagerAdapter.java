package com.example.kkchain.nanodegree_project5_tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate{@link Fragment} for a view pager
 */

public class TourGuidePagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TourGuidePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
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

    //getPageTitle returns string resource associated with a fragment according to it position
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab_shop);
        } else if (position == 1) {
            return mContext.getString(R.string.tab_food);
        } else if (position == 2) {
            return mContext.getString(R.string.tab_play);
        } else {
            return mContext.getString(R.string.tab_parks);
        }
    }
}