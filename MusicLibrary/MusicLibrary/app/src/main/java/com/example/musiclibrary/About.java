package com.example.musiclibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class About extends AppCompatActivity implements View.OnClickListener{
    Button btn_about;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        Intent in = new Intent();
         btn_about = (Button) findViewById(R.id.btn_contact);


    }

    @Override
    public void onClick(View v) {
        if(v == btn_about)
        {
            Toast.makeText(this,"This to Contact us ",Toast.LENGTH_LONG).show();
        }
    }
}