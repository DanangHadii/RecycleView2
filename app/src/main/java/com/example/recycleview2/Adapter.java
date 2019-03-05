package com.example.recycleview2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Contact> contactList;
    private Context ctx;

    public Adapter(List<Contact> contactList, Context ctx) {
        this.ctx = ctx;
        this.contactList = contactList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.txtNama.setText(contact.getNama());
        holder.txtStatus.setText(contact.getStatus());
        holder.txtTipePhone.setText(contact.getTipePhone());

        Glide.with(ctx).load(contact.getImage_view()).apply(RequestOptions.circleCropTransform().circleCrop()).into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNama, txtStatus, txtTipePhone;
        public ImageView imgView;

        public MyViewHolder(View view) {
            super(view);
            txtNama = view.findViewById(R.id.txtNama);
            txtStatus = view.findViewById(R.id.txtStatus);
            txtTipePhone = view.findViewById(R.id.txtPhoneType);
            imgView = view.findViewById(R.id.imageView);
        }
    }
}
