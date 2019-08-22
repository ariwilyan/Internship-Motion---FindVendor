package com.example.findvendor.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.findvendor.DetailKategori;
import com.example.findvendor.Model.Kategori;
import com.example.findvendor.R;

import java.util.List;

public class ListKategori extends RecyclerView.Adapter<ListKategori.MyViewHolder> {
    private Context context;
    private List<Kategori> kategoriList;

    public ListKategori(Context context, List<Kategori> makananList) {
        this.context = context;
        this.kategoriList = makananList;
    }

    @NonNull
    @Override
    public ListKategori.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_kategori,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListKategori.MyViewHolder myViewHolder, int i) {
        final Kategori makanan = kategoriList.get(i);
        myViewHolder.kategoriTitle.setText(makanan.getTitle());

        myViewHolder.cardMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailKategori.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return kategoriList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView kategoriTitle;
        CardView cardMenu;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            kategoriTitle = itemView.findViewById(R.id.tv_judul_makanan);
            cardMenu = itemView.findViewById(R.id.cardview_menu);
        }
    }
}
