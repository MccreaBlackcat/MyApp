package com.timestudio.mynews.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.timestudio.mynews.R;
import com.timestudio.mynews.activity.TestActivity;
import com.timestudio.mynews.adapter.HorizontalTypeAdapter;
import com.timestudio.mynews.adapter.NewsTitleAdapter;
import com.timestudio.mynews.entity.NewsTitle;
import com.timestudio.mynews.myView.HorizontalListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends Fragment {

    HorizontalListView hlv_title_type;
    ListView lv_details;
    ArrayList<NewsTitle> mData = new ArrayList<NewsTitle>();

    public ContentFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);

        hlv_title_type = (HorizontalListView) view.findViewById(R.id.hlv_title_type);
        lv_details = (ListView) view.findViewById(R.id.lv_details);
        initData();
        return view;
    }

    private void initData() {
        ArrayList<String> mDataList = new ArrayList<>();
        mDataList.add("社会");
        mDataList.add("军事");
        mDataList.add("娱乐");
        HorizontalTypeAdapter adapter = new HorizontalTypeAdapter(getActivity());
        adapter.setMyList(mDataList);
        hlv_title_type.setAdapter(adapter);
        setListListener();

    }

    private void setListListener() {
        hlv_title_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                NewsTitleAdapter typeAdapter = new NewsTitleAdapter(getActivity());
                mData.clear();
                switch (position) {
                    case 0:
                        Toast.makeText(getActivity(),"0",Toast.LENGTH_SHORT).show();
                        for (int i = 0 ; i < 10 ; i++){
                            mData.add(new NewsTitle("人民大会召开","就是要召开，嗯，习主席要召开！","2016-10-18 19:55:37"));
                        }
                        if (mData.size() > 0) {
                            typeAdapter.setMyList(mData);
                            lv_details.setAdapter(typeAdapter);
                        } else {
                            Toast.makeText(getActivity(),"mData为空",Toast.LENGTH_SHORT).show();

                        }
                        break;
                    case 1:
                        Toast.makeText(getActivity(),"1",Toast.LENGTH_SHORT).show();
                        for (int i = 0 ; i < 10 ; i++){
                            mData.add(new NewsTitle("城管大会召开","就是要召开，嗯，习主席要召开！","2016-10-18 19:55:37"));
                        }
                        if (mData.size() > 0) {
                            typeAdapter.setMyList(mData);
                            lv_details.setAdapter(typeAdapter);
                        } else {
                            Toast.makeText(getActivity(),"mData为空",Toast.LENGTH_SHORT).show();

                        }
                        break;
                    case 2:
                        Toast.makeText(getActivity(),"2",Toast.LENGTH_SHORT).show();
                        for (int i = 0 ; i < 10 ; i++){
                            mData.add(new NewsTitle("娱乐大师大会召开","就是要召开，嗯，习主席要召开！","2016-10-18 19:55:37"));
                        }
                        if (mData.size() > 0) {
                            typeAdapter.setMyList(mData);
                            lv_details.setAdapter(typeAdapter);
                        } else {
                            Toast.makeText(getActivity(),"mData为空",Toast.LENGTH_SHORT).show();

                        }
                        break;
                }
            }
        });

        lv_details.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), TestActivity.class);
                startActivity(intent);
            }
        });
    }
}
