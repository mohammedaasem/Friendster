package com.aasem.friendster.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aasem.friendster.DataClass.HotelList;
import com.aasem.friendster.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by inspire_info_soft on 5/27/2018.
 */

public class HotelListAdapter extends RecyclerView.Adapter<HotelListAdapter.MyViewHolder> {

    Context context;
    List<HotelList> hotelLists = new ArrayList<>();

    public HotelListAdapter(Context context, List<HotelList> hotelLists) {
        this.context = context;
        this.hotelLists = hotelLists;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvHotelName, tvHotelContactNumber, tvHotelType, tvHotelAddress;
        ImageView ivImage, ivMore;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvHotelName = (TextView) itemView.findViewById(R.id.tv_hotel_name);
            tvHotelAddress = (TextView) itemView.findViewById(R.id.tv_hotel_address);
            tvHotelContactNumber = (TextView) itemView.findViewById(R.id.tv_contact_number);
            tvHotelType = (TextView) itemView.findViewById(R.id.tv_hotel_type);
            ivImage = (ImageView) itemView.findViewById(R.id.iv_image_hotel);
            ivMore = (ImageView) itemView.findViewById(R.id.iv_more);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(context);
        View view = inflate.inflate(R.layout.custom_design_hotel_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvHotelName.setText(hotelLists.get(position).getHotelName());
        holder.tvHotelType.setText(hotelLists.get(position).getHotelType());
        holder.tvHotelContactNumber.setText(hotelLists.get(position).getHotelContactNumber());
        holder.tvHotelAddress.setText(hotelLists.get(position).getHotelAddress());
        holder.ivImage.setImageResource(hotelLists.get(position).getImage());
      /*  Glide
                .with(context)
                .load(hotelLists.get(position).getHotelImage())
                .centerCrop()
                .into(holder.ivImage);*/
    }

    @Override
    public int getItemCount() {
        return hotelLists.size();
    }
}
