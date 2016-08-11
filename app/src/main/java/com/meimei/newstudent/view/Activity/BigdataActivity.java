package com.meimei.newstudent.view.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.meimei.newstudent.R;
import com.meimei.newstudent.adapter.mFragmentAdapter;
import com.meimei.newstudent.view.Fragment.BigdataFragment.Employment_Fragment;
import com.meimei.newstudent.view.Fragment.BigdataFragment.Man_Fragment;
import com.meimei.newstudent.view.Fragment.BigdataFragment.Subjects_Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 梅梅 on 2016/8/5.
 */
public class BigdataActivity extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_strategy_bigdata);
            initView();
        }

        private void initView(){
            List<Fragment> fragments = new ArrayList<>();
            ViewPager viewPager = (ViewPager) findViewById(R.id.vp_startegy);
            TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_startegy);
            String[] title = new String[]{"男女比例","最难科目","就业率"};


            Man_Fragment man_fragment = new Man_Fragment();
            Subjects_Fragment subjects_fragment = new Subjects_Fragment();
            Employment_Fragment employment_fragment = new Employment_Fragment();

            fragments.add(man_fragment);
            fragments.add(subjects_fragment);
            fragments.add(employment_fragment);

            mFragmentAdapter fragmentAdapter = new mFragmentAdapter(getSupportFragmentManager(),fragments,title);
            viewPager.setAdapter(fragmentAdapter);
            tabLayout.setupWithViewPager(viewPager);
            tabLayout.setTabMode(TabLayout.MODE_FIXED);

        }

}
