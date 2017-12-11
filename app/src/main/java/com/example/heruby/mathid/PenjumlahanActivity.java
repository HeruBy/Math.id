package com.example.heruby.mathid;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PenjumlahanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjumlahan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public void hitungJumlah(View view)
    {
        float n1,n2,hasil;
        EditText e1 = (EditText)findViewById(R.id.editJmlBil1);
        EditText e2 = (EditText)findViewById(R.id.editJmlBil2);
        TextView t1 = (TextView)findViewById(R.id.hasilJml);
        n1= Float.valueOf(Float.parseFloat(e1.getText().toString()));
        n2= Float.valueOf(Float.parseFloat(e2.getText().toString()));
        hasil = n1 + n2;
        t1.setText(Float.toString(hasil));
        display(hasil);
    }


    private void display(float number){
        TextView hasilJml = (TextView)findViewById(R.id.hasilJml);
        hasilJml.setText(""+number);

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
