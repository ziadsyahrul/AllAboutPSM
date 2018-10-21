package com.ziadsyahrul.allaboutpsm;

import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.myRecycleView)
    RecyclerView myRecycleView;

    String[] namaPemain;
    int[] gambarPemain;

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        namaPemain = getResources().getStringArray(R.array.player_name);
        gambarPemain = new int[]{R.drawable.hilman,R.drawable.syaiful,R.drawable.shahar,R.drawable.rivky,R.drawable.zulkifli,R.drawable.hasyimkipuw,R.drawable.hendrawijaya,R.drawable.ardanaras,R.drawable.stevenpaulle,R.drawable.abdul,R.drawable.revaadi,R.drawable.wasyiathasbullah,R.drawable.ahmadhari,R.drawable.fauzanjamal,R.drawable.syafii,R.drawable.klok,R.drawable.rizkypellu,R.drawable.asnawi,R.drawable.marfan,R.drawable.rasyidbakri,R.drawable.wiljan,R.drawable.saldi,R.drawable.zulham,R.drawable.agipratama,R.drawable.arsyadyus,R.drawable.rahmat,R.drawable.herisusanto,R.drawable.guy,R.drawable.brucedjite};

        adapter = new Adapter(this, namaPemain,gambarPemain);

        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(this));
        myRecycleView.setAdapter(adapter);
    }
}
