package com.meimei.newstudent.view.Fragment.BigdataFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meimei.newstudent.R;

/**
 * Created by 梅梅 on 2016/8/4.
 */
public class Class_Fragment extends Fragment{
    private View view;
    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_bigdata_class,container,false);
        init();
        //拿数据

        return view;
    }

    private void init(){
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_bigdata_class);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }
}
