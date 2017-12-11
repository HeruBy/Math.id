package com.example.heruby.mathid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    CardView aritmatika, rumus, bangundatar, bangunruang, bantuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
    }

    public void init() {
        aritmatika = (CardView) findViewById(R.id.aritmatika);
        aritmatika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, AritmatikaActivity.class);
                startActivity(a);
            }
        });
        rumus = (CardView) findViewById(R.id.rumus);
        rumus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, RumusTabActivity.class);
                startActivity(b);
            }
        });
        bangundatar = (CardView) findViewById(R.id.bangundatar);
        bangundatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity.this, BangunDatarActivity.class);
                startActivity(c);
            }
        });
        bangunruang = (CardView) findViewById(R.id.bangunruang);
        bangunruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(MainActivity.this, BangunRuangActivity.class);
                startActivity(d);
            }
        });
        bantuan = (CardView) findViewById(R.id.bantuan);
        bantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MainActivity.this, BantuanActivity.class);
                startActivity(e);
            }
        });


    }


}
