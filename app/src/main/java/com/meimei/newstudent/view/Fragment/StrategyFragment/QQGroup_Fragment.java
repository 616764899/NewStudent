package com.meimei.newstudent.view.Fragment.StrategyFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.meimei.newstudent.R;

/**
 * Created by 梅梅 on 2016/8/4.
 */
public class QQGroup_Fragment extends Fragment{
    private View view;
    private TextView redrock;
    private TextView college;
    private TextView hometown;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_strategy_qqgroup,container,false);

        return view;

    }

}
