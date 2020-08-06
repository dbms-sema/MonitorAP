package com.dbmssema.monitorap;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TipsFragment extends Fragment {
    private CardView goodAir;
    public TipsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tips, container, false);
        goodAir= view.findViewById(R.id.goodAir);
        goodAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoodAir = new Intent(getActivity(),GoodAirActivity.class);
                startActivity(intentGoodAir);
            }
        });
        return view;
    }
}
