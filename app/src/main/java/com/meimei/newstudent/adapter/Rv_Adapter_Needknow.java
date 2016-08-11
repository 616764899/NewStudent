package com.meimei.newstudent.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.meimei.newstudent.R;
import com.meimei.newstudent.bean.Needknow;

import java.util.List;

/**
 * Created by 梅梅 on 2016/8/5.
 */
public class Rv_Adapter_Needknow extends RecyclerView.Adapter<Rv_Adapter_Needknow.ViewHolder>{

    List<Needknow> data;
    Context context;
    int resourceID;

    public Rv_Adapter_Needknow(int resourceID, Context context, List<Needknow> data) {
        super();
        this.resourceID = resourceID;
        this.context = context;
        this.data = data;
    }

    @Override
    public Rv_Adapter_Needknow.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(resourceID,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final Rv_Adapter_Needknow.ViewHolder holder, final int position) {

        holder.title.setText(data.get(position).getTitle());
        holder.content.setText(data.get(position).getContent());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView content;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tv_strategy_needknow_title);
            content = (TextView) itemView.findViewById(R.id.tv_strategy_needknow_content);
        }
    }
}
