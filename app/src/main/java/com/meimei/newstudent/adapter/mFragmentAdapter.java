package com.meimei.newstudent.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 梅梅 on 2016/8/5.
 */
public class mFragmentAdapter extends FragmentPagerAdapter{

    private List<Fragment> fragments;
    private String[] title = new String[3];

    public mFragmentAdapter(FragmentManager fm, List<Fragment> fragments, String[] title) {
        super(fm);
        this.fragments = fragments;
        this.title = title;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return title.length;
    }

    public CharSequence getPageTitle(int position){
        return title[position];
    }
}
