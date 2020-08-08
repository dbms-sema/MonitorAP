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
    private CardView goodAir,moderateAir,unhealthyAir,veryUnhealthyAir,hazardousAir,unsatisfactoryAir;
    public TipsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tips, container, false);
        goodAir= view.findViewById(R.id.goodAir);
        moderateAir = view.findViewById(R.id.moderateAir);
        unhealthyAir = view.findViewById(R.id.unhealthyAir);
        unsatisfactoryAir = view.findViewById(R.id.unsatisfactoryAir);
        veryUnhealthyAir = view.findViewById(R.id.veryUnhealthyAir);
        hazardousAir = view.findViewById(R.id.hazardousAir);

        unsatisfactoryAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentUnsatisfactoryAir = new Intent(getActivity(),UnsatisfactoryActivity.class);
                startActivity(intentUnsatisfactoryAir);

            }
        });

        hazardousAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHazardouusAir = new Intent(getActivity(),HazardousActivity.class);
                startActivity(intentHazardouusAir);

            }
        });

        veryUnhealthyAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVeryUnhealthyAir = new Intent(getActivity(),VeryUnhealthyActivity.class);
                startActivity(intentVeryUnhealthyAir);

            }
        });



        unhealthyAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentUnhealthyAir = new Intent(getActivity(),UnhealthyActivity.class);
                startActivity(intentUnhealthyAir);

            }
        });

        moderateAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentModerateAir = new Intent(getActivity(),ModerateActivity.class);
                startActivity(intentModerateAir);
            }
        });
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
