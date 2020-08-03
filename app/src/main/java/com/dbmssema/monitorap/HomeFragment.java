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

    private TextView smoke, co;
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

        return view;
    }

    private void thingsSpeak() {

        Call<ThingSpeakResponse> call= ServiceGenerator.getInstance(getActivity()).getMonitorApi().getSensorData();

        call.enqueue(new Callback<ThingSpeakResponse>() {
            @Override
            public void onResponse(Call<ThingSpeakResponse> call, Response<ThingSpeakResponse> response) {
                ThingSpeakResponse data=response.body();
                smoke.setText(data.getFeeds().get(0).getField1());
                co.setText(data.getFeeds().get(0).getField2());
            }

            @Override
            public void onFailure(Call<ThingSpeakResponse> call, Throwable t) {

            }
        });
    }
}
