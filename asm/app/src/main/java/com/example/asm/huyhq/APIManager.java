package com.example.asm.huyhq;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIManager {

    String SERVER = "http://dataservice.accuweather.com/";

    @GET("forecasts/v1/hourly/12hour/353412?apikey=AFwHV230Cxrz4WDuBN3G072KnQNCMbjA&language=vi-vn&metric=true")
    Call<List<Weather>> apiGetListData();
}
