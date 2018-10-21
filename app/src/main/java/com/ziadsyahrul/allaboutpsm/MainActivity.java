package com.ziadsyahrul.allaboutpsm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnMasuk(View view) {
        Intent pindah = new Intent(this,MenuActivity.class);
        startActivity(pindah);
    }
}
