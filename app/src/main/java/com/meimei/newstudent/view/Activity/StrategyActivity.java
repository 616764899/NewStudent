package com.meimei.newstudent.view.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.meimei.newstudent.adapter.mFragmentAdapter;
import com.meimei.newstudent.R;
import com.meimei.newstudent.view.Fragment.StrategyFragment.Daily_Fragment;
import com.meimei.newstudent.view.Fragment.StrategyFragment.Dormitory_Fragment;
import com.meimei.newstudent.view.Fragment.StrategyFragment.Food_Fragment;
import com.meimei.newstudent.view.Fragment.StrategyFragment.Necessary_Fragment;
import com.meimei.newstudent.view.Fragment.StrategyFragment.Needknow_Fragment;
import com.meimei.newstudent.view.Fragment.StrategyFragment.QQGroup_Fragment;
import com.meimei.newstudent.view.Fragment.StrategyFragment.Route_Fragment;
import com.meimei.newstudent.view.Fragment.StrategyFragment.Scenery_Fragment;

import java.util.ArrayList;
import java.util.List;



public class StrategyActivity extends AppCompatActivity {

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
        String[] title = new String[]{" 入学须知" ," 须知路线 "," 寝室情况 "," 必备清单 ","  QQ群    "," 日常生活 "," 周边美食 "," 周边美景   "};

        Needknow_Fragment needknow_fragment = new Needknow_Fragment();
        Route_Fragment route_fragment = new Route_Fragment();
        Dormitory_Fragment dormitory_fragment = new Dormitory_Fragment();
        Necessary_Fragment necessary_fragment = new Necessary_Fragment();
        QQGroup_Fragment qqGroup_fragment = new QQGroup_Fragment();
        Daily_Fragment daily_fragment = new Daily_Fragment();
        Food_Fragment food_fragment = new Food_Fragment();
        Scenery_Fragment scenery_fragment = new Scenery_Fragment();
        fragments.add(needknow_fragment);
        fragments.add(route_fragment);
        fragments.add(dormitory_fragment);
        fragments.add(necessary_fragment);
        fragments.add(qqGroup_fragment);
        fragments.add(daily_fragment);
        fragments.add(food_fragment);
        fragments.add(scenery_fragment);

        mFragmentAdapter fragmentAdapter = new mFragmentAdapter(getSupportFragmentManager(),fragments,title);
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

    }
}
