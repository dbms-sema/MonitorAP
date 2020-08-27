package com.dbmssema.monitorap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dbmssema.monitorap.requests.ServiceGenerator;
import com.dbmssema.monitorap.requests.responses.ThingSpeakResponse;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private TextView smoke, co,smoke2,co2,smoke3,co3;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        thingsSpeak();
        //todo while loop
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        smoke=view.findViewById(R.id.txtSmokeNodeOne);
        co=view.findViewById(R.id.txtCoNodeOne);

        smoke2 = view.findViewById(R.id.txtSmokeNodetwo);
        co2 = view.findViewById(R.id.txtCoNodetwo);

        smoke3 = view.findViewById(R.id.txtSmokeNodethree);
        co3 = view.findViewById(R.id.txtCoNodethree);
        connectThingsSpeak();

        return view;
    }
    private void connectThingsSpeak() {
        Thread mythread = new Thread(){
            @Override
            public void run() {
                try {
                    while (true){
                        thingsSpeak();
                    }
                } finally {

                }
            }
        };
        mythread.start();

    }

    private void thingsSpeak() {

        Call<ThingSpeakResponse> call= ServiceGenerator.getInstance(getActivity()).getMonitorApi().getSensorData();

        call.enqueue(new Callback<ThingSpeakResponse>() {
            @Override
            public void onResponse(Call<ThingSpeakResponse> call, Response<ThingSpeakResponse> response) {
                Log.d("log", "onResponse: " + response.body());
                ThingSpeakResponse data=response.body();
                smoke.setText(data.getFeeds().get(0).getField1());
                co.setText(data.getFeeds().get(0).getField2());
                smoke2.setText(data.getFeeds().get(0).getField3());
                co2.setText(data.getFeeds().get(0).getField4());
                smoke3.setText(data.getFeeds().get(0).getField5());
                co3.setText(data.getFeeds().get(0).getField6());
            }

            @Override
            public void onFailure(Call<ThingSpeakResponse> call, Throwable t) {

            }
        });
    }
}
