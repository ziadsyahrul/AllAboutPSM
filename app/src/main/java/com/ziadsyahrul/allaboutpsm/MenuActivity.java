package com.ziadsyahrul.allaboutpsm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.btnHistory)
    Button btnHistory;
    @BindView(R.id.btnPlayer)
    Button btnPlayer;
    @BindView(R.id.btnChampion)
    Button btnChampion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);


    }

    Intent pindah;

    @OnClick({R.id.btnHistory, R.id.btnPlayer, R.id.btnChampion})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnHistory:
                pindah = new Intent(this,HistoryActivity.class);
                startActivity(pindah);
                break;
            case R.id.btnPlayer:
                pindah = new Intent(this, RecycleActivity.class);
                startActivity(pindah);
                break;
            case R.id.btnChampion:
                pindah = new Intent(this,RecycleActivity2.class);
                startActivity(pindah);
                break;
        }
    }
}
