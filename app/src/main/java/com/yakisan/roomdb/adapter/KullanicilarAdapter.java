package com.yakisan.roomdb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yakisan.roomdb.R;
import com.yakisan.roomdb.db.User;

import java.util.ArrayList;
import java.util.List;

public class KullanicilarAdapter extends RecyclerView.Adapter<KullanicilarAdapter.VH> {

    Context context;
    List<User> kullaniciListesi;

    public KullanicilarAdapter(Context context) {
        this.context = context;
    }

    //Set User List
    public void setUserList(List<User> userList){
        this.kullaniciListesi = userList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new VH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.firstName.setText(this.kullaniciListesi.get(position).firstName);
        holder.lastName.setText(this.kullaniciListesi.get(position).lastName);
    }

    @Override
    public int getItemCount() {
        return kullaniciListesi.size();
    }

    //VH
    public static class VH extends RecyclerView.ViewHolder{

        TextView firstName, lastName;
        public VH(@NonNull View itemView) {
            super(itemView);
            firstName = itemView.findViewById(R.id.tvKullaniciAdi);
            lastName = itemView.findViewById(R.id.tvKullaniciSoyadi);
        }
    }

}
