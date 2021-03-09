package com.example.asm.huyhq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Weather {
    private Date DateTime;
    private int WeatherIcon;
    private String IconPhrase;
    private Temperature Temperature;

    public Date getDateTime() {
        return DateTime;
    }

    public void setDateTime(Date dateTime) {
        DateTime = dateTime;
    }

    public int getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        IconPhrase = iconPhrase;
    }

    public com.example.asm.huyhq.Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(com.example.asm.huyhq.Temperature temperature) {
        Temperature = temperature;
    }

    public String convertTime(String inputTime) {
        SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = null;
        try {
            date = inFormat.parse(inputTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat outFormat = new SimpleDateFormat("ha");
        String goal = outFormat.format(date);
        return goal;
    }


}
