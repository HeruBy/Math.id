package com.example.heruby.mathid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class BangunRuangActivity extends AppCompatActivity {

    CardView kubus, balok, kerucut, tabung, limas, prisma, bola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_ruang);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        init();
    }
    public void init() {
        kubus = (CardView) findViewById(R.id.kubus);
        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BangunRuangActivity.this, KubusActivity.class);
                startActivity(a);
            }
        });
        balok = (CardView) findViewById(R.id.balok);
        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(BangunRuangActivity.this, BalokActivity.class);
                startActivity(b);
            }
        });
        kerucut = (CardView) findViewById(R.id.kerucut);
        kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(BangunRuangActivity.this, KerucutActivity.class);
                startActivity(c);
            }
        });
        tabung = (CardView) findViewById(R.id.tabung);
        tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(BangunRuangActivity.this, TabungActivity.class);
                startActivity(d);
            }
        });
        limas = (CardView) findViewById(R.id.limas);
        limas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(BangunRuangActivity.this, LimasActivity.class);
                startActivity(e);
            }
        });
        prisma = (CardView) findViewById(R.id.prisma);
        prisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(BangunRuangActivity.this, PrismaActivity.class);
                startActivity(f);
            }
        });
        bola = (CardView) findViewById(R.id.bola);
        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(BangunRuangActivity.this, BolaActivity.class);
                startActivity(g);
            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            // navigateUpTo(new Intent(this, HistoryListActivity.class));
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
