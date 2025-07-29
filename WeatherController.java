package com.weather.controller;

import com.weather.model.WeatherResponse;
import com.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/weather")
    public String getWeather(@RequestParam String city, Model model) {
        WeatherResponse response = weatherService.getWeatherData(city);
        model.addAttribute("weather", response);
        return "result";
    }
}
