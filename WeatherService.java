package com.weather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.model.WeatherResponse;
import org.springframework.stereotype.Service;
import java.net.URL;

@Service
public class WeatherService {

    private static final String API_KEY = "YOUR_API_KEY";
    private static final String API_URL = 
        "https://api.openweathermap.org/data/2.5/forecast?q=%s&appid=%s&units=metric";

    public WeatherResponse getWeatherData(String city) {
        try {
            String url = String.format(API_URL, city, API_KEY);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new URL(url), WeatherResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
