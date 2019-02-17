package com.example.musiclibrary;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Songs extends AppCompatActivity  {
    Integer[] imageSinger = {R.drawable.mfoud,
            R.drawable.mhamaqi,
            R.drawable.adale,
            R.drawable.tamerhosni,
            R.drawable.nansi};
    String[] singerName = {
            "Mohammed Foud",
            "Mohammed Hamaqi",
            "Adela",
            "Tamer Hosni",
            "Nansi Agram",
    };
    String[] singerdescription = {
            "Tameny Allek to mohammed foud ",
            "mablish to mohammed hamaqi ",
            "Hello Its me To Adela",
            "kafaiek aizer to tamer hosni",
            "yabnat to nanci Agram"
    };
    ImageButton btn_play;
    ImageButton btn_pause;
    ListView lst;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);
        Intent in = new Intent();

        Custom_list adapter = new Custom_list(this, singerName, singerdescription, imageSinger);
        lst = (ListView) findViewById(R.id.lst1);
        lst.setAdapter(adapter);
        //--------------------------------songs media---------
        final MediaPlayer foud_song = MediaPlayer.create(this, R.raw.foud);
        final MediaPlayer tamer_song = MediaPlayer.create(this, R.raw.tamer);
        final MediaPlayer Adela_song = MediaPlayer.create(this, R.raw.hallo);
        final MediaPlayer hamaqi_song = MediaPlayer.create(this, R.raw.hamaqi);
        final MediaPlayer nanci_song = MediaPlayer.create(this, R.raw.nanci);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0 ) {

                        foud_song.start();


                } else if (position == 1) {

                    hamaqi_song.start();

                } else if (position == 2) {

                    Adela_song.start();

                } else if (position == 3) {

                    tamer_song.start();

                } else if (position == 4) {

                    nanci_song.start();

                }

            }
        });

    }



}

