package com.example.musiclibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button btn_song;
    Button btn_Albums;
    Button btn_favourite;
    Button btn_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_song = (Button) findViewById(R.id.btn_song);
        btn_Albums = (Button) findViewById(R.id.btn_albums);
        btn_favourite = (Button) findViewById(R.id.btn_favourite);
        btn_about = (Button) findViewById(R.id.btn_about);

        btn_song.setOnClickListener(this);
        btn_Albums.setOnClickListener(this);
        btn_about.setOnClickListener(this);
        btn_favourite.setOnClickListener(this);
       

    }

    @Override
    public void onClick(View v) {
        if (v == btn_song)
        {
            Intent i = new Intent(MainActivity.this,Songs.class);
            startActivity(i);
        }
        else if (v == btn_Albums)
        {
            Intent i = new Intent(MainActivity.this,Albums.class);
            startActivity(i);
        }
        else if (v == btn_favourite)
        {
            Intent i = new Intent(MainActivity.this,Favourite.class);
            startActivity(i);
        }
        else  if (v == btn_about)
        {
            Intent i = new Intent(MainActivity.this,About.class);
            startActivity(i);
        }
    }
}
