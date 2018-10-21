package com.ziadsyahrul.allaboutpsm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {
    Context context;
    String[] champions;

    public Adapter2(Context context, String[] champions) {
        this.context = context;
        this.champions = champions;
    }

    @NonNull
    @Override
    public Adapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_champions,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter2.ViewHolder viewHolder, int i) {
        viewHolder.txtChampions.setText(champions[i]);

    }

    @Override
    public int getItemCount() {
        return champions.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtChampions;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtChampions = itemView.findViewById(R.id.txtChampion);
        }
    }
}
