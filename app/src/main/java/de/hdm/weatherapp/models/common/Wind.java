package de.hdm.weatherapp.models.common;

import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("deg")
    public double deg;

    @SerializedName("speed")
    public double speed;
}