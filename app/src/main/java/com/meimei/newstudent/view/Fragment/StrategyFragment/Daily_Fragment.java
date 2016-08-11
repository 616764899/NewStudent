package com.meimei.newstudent.view.Fragment.StrategyFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meimei.newstudent.R;
import com.meimei.newstudent.adapter.Rv_Adapter_Surrounding;
import com.meimei.newstudent.bean.Surrounding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 梅梅 on 2016/8/4.
 */
public class Daily_Fragment extends Fragment{
    private static String TAG = "Daily_Fragment";
    private View view;
    private RecyclerView recyclerView;
    private Rv_Adapter_Surrounding rv_adapter_surrounding ;
    private List<Surrounding> data = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Log.i(TAG,"onCreateView");
        view = inflater.inflate(R.layout.fragment_strategy_daily,container,false);
        init();
        //拿数据
        if (data.size() == 0){
            getData();
        }
        rv_adapter_surrounding = new Rv_Adapter_Surrounding(R.layout.rv_surrounding_item,getActivity(),data);
        recyclerView.setAdapter(rv_adapter_surrounding);
        return view;
    }

    private void init(){
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_daily);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    private void getData(){
        Surrounding item = new Surrounding();
        item.setName("中国农业银行");
        item.setLocation("新校门出门右转");
        data.add(item);
        Surrounding item1 = new Surrounding();
        item1.setName("多乐迪KTV");
        item1.setLocation("新校门出门右转，中国农业银行楼下");
        data.add(item1);
        Surrounding item2 = new Surrounding();
        item2.setName("新世纪超市");
        item2.setLocation("新校门出门右转，多乐迪KTV楼上");
        data.add(item2);
        Surrounding item3 = new Surrounding();
        item3.setName("永辉超市");
        item3.setLocation("新校门出门过马路，右转直走");
        data.add(item3);
        Surrounding item4 = new Surrounding();
        item4.setName("百世快递");
        item4.setLocation("老校门出门，过马路，左转直走，杀牛王火锅旁边。");
        data.add(item4);
        Surrounding item5 = new Surrounding();
        item5.setName("中通快递");
        item5.setLocation("老校门出门，过马路，左转，静苑小区旁。");
        data.add(item5);
        Surrounding item6 = new Surrounding();
        item6.setName("韵达快递");
        item6.setLocation("老校门出门，过马路，左转，静苑小区旁。");
        data.add(item6);
        Surrounding item7 = new Surrounding();
        item7.setName("重庆农村商业银行");
        item7.setLocation("老校门出门，过马路，右转。");
        data.add(item7);
        Surrounding item8 = new Surrounding();
        item8.setName("黄金书店");
        item8.setLocation("老校门出门，过马路，堕落二街里面，重庆农业商业银行附近。");
        data.add(item8);
        Surrounding item9 = new Surrounding();
        item9.setName("上海利科绿色干洗店");
        item9.setLocation("老校门出门，过马路，堕落二街里面，重庆农业商业银行附近。");
        data.add(item9);
        Surrounding item10 = new Surrounding();
        item10.setName("中国移动营业厅");
        item10.setLocation("老校门出门，过马路，右转直走。 ");
        data.add(item10);
        Surrounding item11 = new Surrounding();
        item11.setName("联佰大药房");
        item11.setLocation("新校门出门，过马路，右转直走。");
        data.add(item11);
        Surrounding item12 = new Surrounding();
        item12.setName("渝芳百货商场");
        item12.setLocation("新校门出门，左转直走。老校门出门，右转直走。");
        data.add(item12);
        Surrounding item13 = new Surrounding();
        item13.setName("中国工商银行自助服务点");
        item13.setLocation("新校门出门，左转直走，老校门出门，右转直走。");
        data.add(item13);
        Surrounding item14 = new Surrounding();
        item14.setName("ZAKKA生活小铺");
        item14.setLocation("新校门出门，左转直走，老校门出门，右转直走。");
        data.add(item14);
        Surrounding item15 = new Surrounding();
        item15.setName("洪川眼镜");
        item15.setLocation("新校门出门，左转直走。老校门出门，右转直走。");
        data.add(item15);
        Surrounding item16 = new Surrounding();
        item16.setName("中国邮政");
        item16.setLocation("老校门出门，右转。新校门出门，左转。");
        data.add(item16);
        Log.i(TAG,"data.size:"+data.size());
    }
}
