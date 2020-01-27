package com.bram.tugas2_bram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtdata = (TextView) findViewById(R.id.txtdata);
        Intent datas = getIntent();
        String npm = datas.getStringExtra("data");
        String nama = datas.getStringExtra("datax");
        txtdata.setText(nama + "\n" + npm);


    }
    @Override
    public void onBackPressed(){
        Intent back = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(back);
        finish();
    }
}
