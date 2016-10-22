package com.timestudio.mynews.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.timestudio.mynews.R;
import com.timestudio.mynews.entity.NewsTitle;

import java.util.ArrayList;

/**
 * Created by thinkpad on 2016/10/18.
 */

public class NewsTitleAdapter extends MyBaseAdapter {

    public NewsTitleAdapter(Context mContext) {
        super(mContext);
    }

    @Override
    public View getMyView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.news_title_item, null);

        TextView tv_title_title = (TextView) convertView.findViewById(R.id.tv_title_title);
        TextView tv_title_detailes = (TextView) convertView.findViewById(R.id.tv_title_details);
        TextView tv_title_time = (TextView) convertView.findViewById(R.id.tv_title_time);

        tv_title_title.setText(((NewsTitle)myList.get(position)).getTitle());
        tv_title_detailes.setText(((NewsTitle)myList.get(position)).getDetails());
        tv_title_time.setText(((NewsTitle)myList.get(position)).getTime());
        return convertView;
    }
}
