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
import com.meimei.newstudent.adapter.Rv_Adapter_Dormitory;
import com.meimei.newstudent.bean.Dormitory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 梅梅 on 2016/8/4.
 */
public class Dormitory_Fragment extends Fragment{
    private static String TAG = "Dormitory";
    private View view;
    private RecyclerView recyclerView;
    private Rv_Adapter_Dormitory rv_adapter_dormitory;
    private List<Dormitory> data = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_strategy_dormitory,container,false);
        init();
        Log.i(TAG,"onCreateView");
        //拿数据
        getData();
        rv_adapter_dormitory = new Rv_Adapter_Dormitory(getActivity(),data,R.layout.dormitory_item);
        recyclerView.setAdapter(rv_adapter_dormitory);
        return view;
    }

    private void init(){
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_dormitory);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }
    private void getData(){
        Dormitory item = new Dormitory();
        item.setIntroduce("1、5、6是学校现存最老的寝室。住宿条件比较差。今年1栋改为了研究生宿舍，5、6栋的4人间调整为3人间，而6人间调整为了4人间，住宿空间较以前有了比较大的改善。整体情况是每层楼设有公用的卫生间、洗澡间，这也就意味着每个寝室都没有独立卫生间，没有阳台。处于校园中心，上课、生活都极其便利。");
        data.add(item);
        Dormitory item1 = new Dormitory();
        item1.setIntroduce("8-12栋位于学校情人坡旁边，是学校标准的4人间，上床下桌，配有阳台，独立卫生间。楼栋周边环境一流，食堂与超市一应俱全，为\n" +
                "学习生活提供不少的便利");
        data.add(item1);
        Dormitory item2 = new Dormitory();
        item2.setIntroduce("5-20栋分布在太极运动场的南边与东边。周边有学校的兴业院食堂及众多的超市、商铺，校车从这里穿过。寝室内部均设有独立卫生间，并在一些楼层设有洗衣机供大家使用，根据每栋宿舍不同，楼层不同分为4人间、6人间两种。4人间基本情况与8-12栋一样，而6人间则是上下铺与上床下桌的混搭。22-24屹立于悠悠重邮高处，周边风景秀丽，无论冬夏，绿色永存，每至冬季，一旁还有腊梅香气飘来。楼栋门前不时还会有校车等路过，其周边有“千喜鹤”、“好食基”、“红高粱”等食堂，还有重邮阳光超市、叮当超市、华生园等购物场所，交通便利，可以尽情满足同学们的平日生活需求。此外，楼栋内部住宿条件优越，环境较好，22栋全部为4人间寝室，与8-12栋寝室情况基本一致）,23及24全部为6人间寝室，且有独立的阳台、卫浴。25-32在学校的东南方向，周边分布有“千喜鹤”、“好食基”食堂。宿舍基本为6人间基本情况与22-24相同且有独立的阳台、卫浴，床铺是上下铺与上床下桌的混搭");
        data.add(item2);
        Log.i(TAG,"data的size:"+data.size());
    }
}
