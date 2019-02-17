package com.example.musiclibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Albums extends AppCompatActivity implements View.OnClickListener{
    GridView grd;
    Button btn_Add;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums);
        Intent in = new Intent();
        grd = (GridView) findViewById(R.id.gridView);
        imgAdapter im = new imgAdapter(this);
        grd.setAdapter(im);

        btn_Add = (Button) findViewById(R.id.btn_add);



    }

    @Override
    public void onClick(View v) {
        if(v == btn_Add)
        {
            Toast.makeText(this,"This to Add Albums to Favourite Albums",Toast.LENGTH_LONG).show();
        }
    }

    public class imgAdapter extends BaseAdapter {

        Context con;
        int[] images = {
                R.drawable.mfoud,
                R.drawable.mhamaqi,
                R.drawable.adale,
                R.drawable.tamerhosni,
                R.drawable.nansi
        };
String[] singer_Name ={"Mohammed Foud","Mohammed Hamaqi","Adela","Tamer Hosni","Nanssi Agram"};
        imgAdapter(Context c) {
            con = c;
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView img;

            if (convertView == null) {
                img = new ImageView(con);
                img.setLayoutParams(new GridView.LayoutParams(300, 300));
                img.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img.setPadding(5, 5, 5, 5);


            } else {
                img = (ImageView) convertView;

            }

            img.setImageResource(images[position]);


            return img;
        }
    }
}
