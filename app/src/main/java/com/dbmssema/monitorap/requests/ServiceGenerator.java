package com.dbmssema.monitorap.requests;

import android.content.Context;

import com.dbmssema.monitorap.utils.Constants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static ServiceGenerator instance;
    private Context context;

    public static ServiceGenerator getInstance(Context context) {
        if (instance == null) {
            instance = new ServiceGenerator(context);
        }
        return instance;
    }

    private ServiceGenerator(Context context) {
        this.context=context;
    }



    public   OkHttpClient getClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)

                .build();

        return client;
    }
    private Retrofit retrofit=new Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(getClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private  MonitorApi MonitorApi=retrofit.create(MonitorApi.class);


    public  MonitorApi getMonitorApi(){
        return MonitorApi;
    }
}
