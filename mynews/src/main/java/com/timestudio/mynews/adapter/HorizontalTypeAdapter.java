package com.timestudio.mynews.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.timestudio.mynews.R;

/**
 * Created by thinkpad on 2016/10/18.
 */

public class HorizontalTypeAdapter extends MyBaseAdapter {

    public HorizontalTypeAdapter(Context mContext) {
        super(mContext);
    }

    @Override
    public View getMyView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.horizontal_item,null);
        TextView tv_type_title = (TextView) convertView.findViewById(R.id.tv_type_title);
        tv_type_title.setText(myList.get(position).toString());
        return convertView;
    }
}
