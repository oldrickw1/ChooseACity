package com.example.chooseacity;

public class CityData {
    private String cityName;
    private String country;

    public CityData(String cityName, String country) {
        this.cityName = cityName;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getCityName() {
        return cityName;
    }
}
