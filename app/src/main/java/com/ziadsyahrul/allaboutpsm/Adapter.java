package com.ziadsyahrul.allaboutpsm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    String[] namaPemain;
    int [] gambarPemain;

    public Adapter(Context context, String[] namaPemain, int[] gambarPemain) {
        this.context = context;
        this.namaPemain = namaPemain;
        this.gambarPemain = gambarPemain;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_psm,viewGroup,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, int i) {
        viewHolder.txtNama.setText(namaPemain[i]);
        Glide.with(context).load(gambarPemain[i]).into(viewHolder.imgLogo);

    }

    @Override
    public int getItemCount() {
        return namaPemain.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView txtNama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogo =itemView.findViewById(R.id.imgGambarPemain);
            txtNama = itemView.findViewById(R.id.txtNamaPemain);
        }
    }
}
