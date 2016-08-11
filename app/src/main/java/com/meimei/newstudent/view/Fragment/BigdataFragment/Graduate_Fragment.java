package com.meimei.newstudent.view.Fragment.BigdataFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meimei.newstudent.R;

/**
 * Created by 梅梅 on 2016/8/4.
 */
public class Graduate_Fragment extends Fragment{

    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_bigdata_graduate,container,false);

        return view;
    }


}
