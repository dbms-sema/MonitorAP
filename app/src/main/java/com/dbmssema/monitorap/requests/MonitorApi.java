package com.dbmssema.monitorap.requests;

import com.dbmssema.monitorap.requests.responses.ChannelResponse;
import com.dbmssema.monitorap.requests.responses.ThingSpeakResponse;

import java.util.List;

import androidx.lifecycle.LiveData;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MonitorApi {

    @GET("feeds.json?api_key=XCBZ8C3EW7NIG1TK&results=1")
    Call<ThingSpeakResponse> getSensorData();

}
