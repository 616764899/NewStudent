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
public class Route_Fragment extends Fragment{

    private View view;
    private TextView airport_to_school;
    private TextView train_station_to_school;
    private TextView bus_station_to_school;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_strategy_route,container,false);
        init();

        return view;

    }
    private void init(){
        airport_to_school = (TextView) view.findViewById(R.id.tv_route_airport_to_school);
        train_station_to_school = (TextView) view.findViewById(R.id.tv_route_train_station_to_school);
        bus_station_to_school = (TextView) view.findViewById(R.id.tv_route_bus_station_to_school);

    }
}
