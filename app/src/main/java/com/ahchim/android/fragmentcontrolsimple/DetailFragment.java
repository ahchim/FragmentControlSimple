package com.ahchim.android.fragmentcontrolsimple;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class DetailFragment extends Fragment {
    MainActivity activity;

    public void setActivity(MainActivity activity){
        this.activity = activity;
    }

    public DetailFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        Button btn = (Button) view.findViewById(R.id.btnList);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.backToList();
            }
        });


        return view;
    }
}
