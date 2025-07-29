package com.weather.model;

import java.util.List;

public class WeatherResponse {
    public City city;
    public List<WeatherEntry> list;

    public static class City {
        public String name;
    }

    public static class WeatherEntry {
        public Main main;
        public String dt_txt;

        public static class Main {
            public double temp;
            public int humidity;
        }
    }
}
