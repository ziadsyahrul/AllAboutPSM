package com.ziadsyahrul.allaboutpsm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity2 extends AppCompatActivity {

    @BindView(R.id.myRecycleView2)
    RecyclerView myRecycleView2;

    String[] champions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle2);
        ButterKnife.bind(this);

        champions = getResources().getStringArray(R.array.juara);

        Adapter2 adapter2 = new Adapter2(this,champions);

        myRecycleView2.setHasFixedSize(true);
        myRecycleView2.setLayoutManager(new LinearLayoutManager(this));
        myRecycleView2.setAdapter(adapter2);
    }
}
