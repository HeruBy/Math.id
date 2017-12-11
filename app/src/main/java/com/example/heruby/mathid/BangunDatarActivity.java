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

public class BangunDatarActivity extends AppCompatActivity {

    CardView persegi, persegiPanjang, segitiga, trapesium, lingkaran, jajarGenjang, belahKetupat, layangLayang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_datar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        init();
    }

    public void init() {
        persegi = (CardView) findViewById(R.id.persegi);
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BangunDatarActivity.this, PersegiActivity.class);
                startActivity(a);
            }
        });
        persegiPanjang = (CardView) findViewById(R.id.persegipanjang);
        persegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(BangunDatarActivity.this, PersegiPanjangActivity.class);
                startActivity(b);
            }
        });
        segitiga = (CardView) findViewById(R.id.segitiga);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(BangunDatarActivity.this, SegitigaActivity.class);
                startActivity(c);
            }
        });
        trapesium = (CardView) findViewById(R.id.trapesium);
        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(BangunDatarActivity.this, TrapesiumActivity.class);
                startActivity(d);
            }
        });
        lingkaran = (CardView) findViewById(R.id.lingkaran);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(BangunDatarActivity.this, LingkaranActivity.class);
                startActivity(e);
            }
        });
        jajarGenjang = (CardView) findViewById(R.id.jajargenjang);
        jajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(BangunDatarActivity.this, JajarGenjangActivity.class);
                startActivity(f);
            }
        });
        belahKetupat = (CardView) findViewById(R.id.belahketupat);
        belahKetupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(BangunDatarActivity.this, BelahKetupatActivity.class);
                startActivity(g);
            }
        });
        layangLayang = (CardView) findViewById(R.id.layanglayang);
        layangLayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(BangunDatarActivity.this, LayangActivity.class);
                startActivity(h);
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
