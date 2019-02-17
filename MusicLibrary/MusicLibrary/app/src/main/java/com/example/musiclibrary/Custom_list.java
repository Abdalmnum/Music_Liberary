package com.example.musiclibrary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom_list  extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] singer_name;
    private final String[] description;
    private final Integer[] imgid;


    public Custom_list(Activity context, String[] singer_name, String[] description, Integer[] imgid) {
        super(context, R.layout.custom_list,singer_name);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.singer_name = singer_name;
        this.description = description;

        this.imgid=imgid;

    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_list, null,true);

        TextView sing_name = (TextView) rowView.findViewById(R.id.singer_name);
        ImageView sing_img = (ImageView) rowView.findViewById(R.id.img_singer);
        TextView sing_desc = (TextView) rowView.findViewById(R.id.singer_desc);

        sing_name.setText(singer_name[position]);
        sing_img.setImageResource(imgid[position]);
        sing_desc.setText(description[position]);

        return rowView;

    };
}