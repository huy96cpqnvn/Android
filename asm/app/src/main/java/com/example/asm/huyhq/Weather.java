package com.example.asm.huyhq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Weather {
    private String DateTime;
    private int WeatherIcon;
    private String IconPhrase;
    private Temperature Temperature;

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
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
}
