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
public class Scenery_Fragment extends Fragment{
    private static String TAG = "Scenery_Fragment";
    private View view;
    private RecyclerView recyclerView;
    private Rv_Adapter_Surrounding rv_adapter_surrounding;
    private List<Surrounding> data = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG,"onCreateView");
        view = inflater.inflate(R.layout.fragment_strategy_scenery,container,false);
        init();
        //拿数据
        getData();
        rv_adapter_surrounding = new Rv_Adapter_Surrounding(R.layout.rv_surrounding_item,getActivity(),data);
        recyclerView.setAdapter(rv_adapter_surrounding);
        return view;
    }

    private void init(){
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_scenery);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
    private void getData(){
        Surrounding item = new Surrounding();
        item.setName("大金鹰");
        item.setLocation("1、\t在老校门乘坐346公交车在四中站下车\n" +
                "2、\t步行至崇文路站（230米左右），搭乘384公交车在大金鹰下\n");
        item.setIntroduction("“大金鹰”雕塑，雄居在重庆南山671米高的鹞鹰岩上。上设有观景台，凭栏远眺，重庆数十里景物尽收眼底。据说，此系目前重庆最高的观景点。");
        data.add(item);
        Surrounding item1 = new Surrounding();
        item1.setName("黄葛古道");
        item1.setLocation("上新街爬南山上山的一条路（搭347/346在上新街下）");
        item1.setIntroduction("黄葛古道,是重庆市知名度最高的一条古道,有着800年历史,曾是历代川黔商贾的必经之地,被称为重庆的“丝绸之道”。该古道始于唐朝,宋、元、明、清时期处于鼎盛时期,属巴渝十二景之一。");
        data.add(item1);
        Surrounding item2 = new Surrounding();
        item2.setName("重庆抗战遗址博物馆");
        item2.setLocation("1、\t在老校门乘坐346公交车在四中站下车\n" +
                "2、\t步行至崇文路站（230米左右），搭乘384公交车在黄山站下\n");
        item2.setIntroduction("重庆抗战遗址博物馆是集抗战遗址与原生态自然景观于一体的综合旅游和爱国主义教育基地；是一个有着丰富人文资源、自然资源和旅游资源的综合性抗战遗址博物馆旅游景区。");
        data.add(item2);
        Surrounding item3 = new Surrounding();
        item3.setName("老君洞");
        item3.setLocation("位于黄桷古道边");
        item3.setIntroduction("老君洞道观是重庆主城区最大最主要的宫观，也是重庆市的重要道观。数百年来，每逢初一、十五或清明、中元等传统节日，香客朝香，游人登高，香火一时胜极。道观内香烟氤氲缭绕，山路上行人络绎不绝。");
        data.add(item3);
        Surrounding item4 = new Surrounding();
        item4.setName("南滨路");
        item4.setLocation("1、从南坪步行约390米,到达南坪东路站\n" +
                "2、乘坐375路,经过4站, 到达海棠烟雨广场站（也可乘坐373路）\n" +
                "3、步行约200米,到达南滨路\n");
        item4.setIntroduction("南滨路处于重庆市的中心地位，它北临长江，背依南山，可观最美渝中夜景；历史悠久的巴渝文化、宗教文化、开埠文化、大禹文化、码头文化、抗战遗址文化如珍珠般遍布沿线，使南滨路获得了“重庆外滩”的美誉。");
        data.add(item4);
        Surrounding item5 = new Surrounding();
        item5.setName("南之山书店");
        item5.setLocation("1、\t在老校门乘坐346公交车在四中站下车\n" +
                "2、\t步行至崇文路站（230米左右），搭乘384公交车在南山（植物园）下车\n" +
                "3、\t最后步行830即可\n");
        item5.setIntroduction("南山之上，一间看得见风景的书店，对于南之山书店的主人来说：“阅读，电影，音乐，绘画，美景，美食，美酒都是生活中最美好一部分，阅读不应该和其它我们所热爱的东西分离开来。“ 一卷书、一杯茶、一窗景、一间房、一个展……在这里，总能找到你爱的东西。（书店需要提前在微信上预约哦，微信号：nbooksclub_szj）");
        data.add(item5);
        Surrounding item6 = new Surrounding();
        item6.setName("涂山湖");
        item6.setLocation("新校门出去，向二外的方向。");
        item6.setIntroduction("涂山湖公园分东西南北打造四季景色：湖东面参差的民居被错落有致的植被替代，构成“翠堤画屏”的春季意境；毗邻二外的北面，凸显“荷塘月色”的夏季意境；西面的黄桷垭文化广场延伸到湖边，体现“林木深秋”的秋季意境；南面则以大堤坝和游园为平台，形成冬日清晨“白雾青黛”的冬季意境……");
        data.add(item6);
        Surrounding item7 = new Surrounding();
        item7.setName("一棵树观景台");
        item7.setLocation("老校门搭347/346到四中站下，步行1.2公里到一棵树观景台");
        item7.setIntroduction("重庆南山一棵树观景台位于南岸区王家山脉临江半山腰处，与重庆主城区隔江相望，是重庆都市旅游的必到之地。在这里可以看见重庆城这座山水之城的起伏面貌。");
        data.add(item7);
    }
}
