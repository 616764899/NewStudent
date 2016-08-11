package com.meimei.newstudent.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.meimei.newstudent.bean.Dormitory;
import com.meimei.newstudent.R;

import java.util.List;

/**
 * Created by 梅梅 on 2016/8/4.
 */
public class Rv_Adapter_Dormitory extends RecyclerView.Adapter<Rv_Adapter_Dormitory.ViewHolder>{
    private static String TAG = "Rv_Adapter_Dormitory";
    private Context context;
    private int resourceID;
    List<Dormitory> data;
    private OnItemClickListener monItemClickListener;

    public interface OnItemClickListener{
        void onItemClick(View view,int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        monItemClickListener = listener;
    }

    public Rv_Adapter_Dormitory(Context context, List<Dormitory> data, int resourceID){
        super();
        this.context = context;
        this.data = data;
        this.resourceID = resourceID;
        Log.i(TAG,""+data.get(0).getIntroduce()+data.get(1).getIntroduce()+data.get(2).getIntroduce());
    }

    @Override
    public Rv_Adapter_Dormitory.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(resourceID,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final Rv_Adapter_Dormitory.ViewHolder holder, final int position) {
        holder.introduce.setText(data.get(position).getIntroduce());
        holder.pic.setImageBitmap(data.get(position).getPic());

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
        TextView introduce;
        ImageView pic;

        public ViewHolder(View itemView) {
            super(itemView);
            pic = (ImageView) itemView.findViewById(R.id.iv_dormitory_pic);
            introduce = (TextView) itemView.findViewById(R.id.tv_dormitory_introduce);
        }
    }
}
