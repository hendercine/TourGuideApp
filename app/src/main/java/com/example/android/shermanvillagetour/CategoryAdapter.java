package com.example.android.shermanvillagetour;

/**
 * Created by Hendercine on 7/6/16.
 */
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context pContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        pContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ToEatFragment();
        } else if (position == 1){
            return new ToPlayFragment();
        } else if (position == 2){
            return new ToShopFragment();
        } else {
            return new ToSeeFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return pContext.getString(R.string.category_to_eat);
        } else if (position == 1) {
            return pContext.getString(R.string.category_to_play);
        } else if (position == 2) {
            return pContext.getString(R.string.category_to_shop);
        } else {
            return pContext.getString(R.string.category_to_see);
        }
    }

}