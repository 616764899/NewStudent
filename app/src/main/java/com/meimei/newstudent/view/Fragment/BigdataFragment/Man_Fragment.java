package com.meimei.newstudent.view.Fragment.BigdataFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.meimei.newstudent.R;
import com.meimei.newstudent.view.PieView;

/**
 * Created by 梅梅 on 2016/8/4.
 */
public class Man_Fragment extends Fragment {
    private final String TAG = "Man_Fragment";
    private View view;
    private Spinner sp_college;
    private Spinner sp_professional;
    private PieView pv_bigdata_man;
    private String[] item_professional;
    private String[] item_college;
    private ArrayAdapter<String> adapter_professional;
    private ArrayAdapter<String> adapter_college;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_bigdata_man,container,false);
        init();

        return view;
    }

    private void init(){
        sp_college = (Spinner) view.findViewById(R.id.sp_bigdata_man);
        sp_professional = (Spinner) view.findViewById(R.id.sp_bigdata_man_1);
        pv_bigdata_man = (PieView) view.findViewById(R.id.pv_bigdata_man);

        sp_college.setOnItemSelectedListener(collegeSpinnerListener);
        sp_professional.setOnItemSelectedListener(ProfessionalSpinnerListener);

    }

    private AdapterView.OnItemSelectedListener collegeSpinnerListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            item_professional = chooseProfessional(position,item_professional); //根据学院的选择获取专业信息
            adapter_professional = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,item_professional);
            adapter_professional.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sp_professional.setAdapter(adapter_professional);

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    private AdapterView.OnItemSelectedListener ProfessionalSpinnerListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (position == 0){
            }else {
                pv_bigdata_man.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };



    private String[] chooseProfessional(int position,String[] item_professional){
        if (position == 0){
            item_professional = getResources().getStringArray(R.array.professional);
        }else if (position == 1){
            item_professional = getResources().getStringArray(R.array.professional_0);
        }else if (position == 2){
            item_professional = getResources().getStringArray(R.array.professional_1);
        }else if (position == 3){
            item_professional = getResources().getStringArray(R.array.professional_2);
        }else if (position == 4){
            item_professional = getResources().getStringArray(R.array.professional_3);
        }else if (position == 5){
            item_professional = getResources().getStringArray(R.array.professional_4);
        }else if (position == 6){
            item_professional = getResources().getStringArray(R.array.professional_5);
        }else if (position == 7){
            item_professional = getResources().getStringArray(R.array.professional_6);
        }else if (position == 8){
            item_professional = getResources().getStringArray(R.array.professional_7);
        }else if (position == 9){
            item_professional = getResources().getStringArray(R.array.professional_8);
        }else if (position == 10){
            item_professional = getResources().getStringArray(R.array.professional_9);
        }else if (position == 11){
            item_professional = getResources().getStringArray(R.array.professional_10);
        }else if (position == 12){
            item_professional = getResources().getStringArray(R.array.professional_11);
        }else if (position == 13){
            item_professional = getResources().getStringArray(R.array.professional_12);
        }else if (position == 14){
            item_professional = getResources().getStringArray(R.array.professional_13);
        }
        return item_professional;
    }


}
