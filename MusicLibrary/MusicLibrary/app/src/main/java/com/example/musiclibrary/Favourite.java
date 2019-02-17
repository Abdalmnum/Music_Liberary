package com.example.musiclibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class Favourite extends AppCompatActivity implements View.OnClickListener {
 Button next_btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favourite);

        Intent in = new Intent();

        next_btn = (Button) findViewById(R.id.btn_next);

    }

    @Override
    public void onClick(View v) {
        if(v == next_btn)
        {
            Toast.makeText(this,"This to play Next Song In my Favourite Song",Toast.LENGTH_LONG).show();
        }

    }
}
