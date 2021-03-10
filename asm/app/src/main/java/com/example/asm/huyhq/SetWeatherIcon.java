package com.example.asm.huyhq;

public class SetWeatherIcon {
    public String setIcon(int icon){
        String url = "https://developer.accuweather.com/sites/default/files/";
        if(icon < 10){
            return  url + "0" + icon + "-s.png";
        } else {
            return url + icon + "-s.png";
        }
    }
}
