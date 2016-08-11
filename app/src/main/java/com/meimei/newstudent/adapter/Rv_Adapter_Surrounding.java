package com.meimei.newstudent.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.meimei.newstudent.bean.Surrounding;
import com.meimei.newstudent.R;

import java.util.List;

/**
 * Created by 梅梅 on 2016/8/5.
 */
public class Rv_Adapter_Surrounding extends RecyclerView.Adapter<Rv_Adapter_Surrounding.ViewHolder>{

    List<Surrounding> data;
    Context context;
    int resourceID;
    private OnItemClickListener monItemClickListener;

    public interface OnItemClickListener{
        void onItemClick(View view,int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        monItemClickListener = listener;
    }

    public Rv_Adapter_Surrounding(int resourceID, Context context, List<Surrounding> data) {
        super();
        this.resourceID = resourceID;
        this.context = context;
        this.data = data;
    }

    @Override
    public Rv_Adapter_Surrounding.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(resourceID,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final Rv_Adapter_Surrounding.ViewHolder holder, final int position) {

        holder.pic.setImageBitmap(data.get(position).getPic());
        holder.name.setText(data.get(position).getName());
        holder.location.setText(data.get(position).getLocation());
        holder.Introduction.setText(data.get(position).getIntroduction());

        if (monItemClickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    monItemClickListener.onItemClick(holder.itemView,position);
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView pic;
        TextView name;
        TextView location;
        TextView Introduction;

        public ViewHolder(View itemView) {
            super(itemView);
            pic = (ImageView) itemView.findViewById(R.id.iv_surrounding_pic);
            name = (TextView) itemView.findViewById(R.id.tv_surrounding_name);
            location = (TextView) itemView.findViewById(R.id.tv_surrounding_location);
            Introduction = (TextView) itemView.findViewById(R.id.tv_surrounding_Introduction);
        }
    }
}
