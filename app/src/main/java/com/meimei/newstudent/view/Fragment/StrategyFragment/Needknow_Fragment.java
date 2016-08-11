package com.meimei.newstudent.view.Fragment.StrategyFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meimei.newstudent.R;
import com.meimei.newstudent.adapter.Rv_Adapter_Needknow;
import com.meimei.newstudent.bean.Needknow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 梅梅 on 2016/8/4.
 */
public class Needknow_Fragment extends Fragment{
    private View view;
    private RecyclerView recyclerView;
    private Rv_Adapter_Needknow rv_adapter_needknow;
    private List<Needknow> data = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_strategy_needknow,container,false);
        /*init();
        getData();
        rv_adapter_needknow = new Rv_Adapter_Needknow(R.layout.rv_strategy_needknow_item,getActivity(),data);
        recyclerView.setAdapter(rv_adapter_needknow);*/
        return view;

    }
    /*private void init(){
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_needknow);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
*/
}
