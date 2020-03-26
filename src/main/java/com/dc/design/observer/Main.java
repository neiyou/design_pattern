package com.dc.design.observer;

/**
 * @Description:
 * @Author: chenhuaidong
 * @Date: 2020/3/26
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(0, 0, 0);
//        weatherData.setMeasurements(1, 1, 1);
    }
}
