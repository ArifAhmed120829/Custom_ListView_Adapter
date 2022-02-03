package com.example.custom_listview_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] subtitle;
    private final int[] imageArray;

    public MyListAdapter(Activity context, String[] mainTitle, String[] subtitle, int[] imageArray) {
        super(context, R.layout.custom,mainTitle);
        this.context = context;
        this.mainTitle = mainTitle;
        this.subtitle = subtitle;
        this.imageArray = imageArray;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom,null,true);

        TextView titleText = rowView.findViewById(R.id.textView1);
        TextView subtitleText = rowView.findViewById(R.id.textView2);
        ImageView imageView = rowView.findViewById(R.id.imageview);

        titleText.setText(mainTitle[position]);
        subtitleText.setText(subtitle[position]);
        imageView.setImageResource(imageArray[position]);
        return rowView;
    }
}
