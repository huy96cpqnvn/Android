package com.example.asm.huyhq;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.text.SimpleDateFormat;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter {
    Activity activity;
    List<Weather> listData;

    public HomeAdapter(Activity activity, List<Weather> listData) {
        this.activity = activity;
        this.listData = listData;
    }

    public void reloadData(List<Weather> list) {
        listData = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.item_weather, parent, false);
        HomeHolder holder = new HomeHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Weather model = listData.get(position);
        HomeHolder vh = (HomeHolder) holder;
        vh.tvTime.setText(model.convertTime(DateTime));
        vh.tvTemp.setText(model.getTemperature().getValue());
//        Glide.with(activity).load(model.getImage()).into(vh.ivCover);

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class HomeHolder extends RecyclerView.ViewHolder {
        TextView tvTime, tvTemp;
//        ImageView ivCover;

        public HomeHolder(@NonNull View itemView) {
            super(itemView);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvTemp = itemView.findViewById(R.id.tvTemp);
//            ivCover = itemView.findViewById(R.id.ivCover);

        }
    }
}
