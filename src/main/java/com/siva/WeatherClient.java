package com.siva;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherClient {
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String API_KEY = "201a066056964fc776029aef08adf9c7"; // Replace with your actual API key

    // Method to fetch weather for a given city
    public String getWeather(String city) {
        StringBuilder result = new StringBuilder();
        try {
            String urlStr = String.format("%s?q=%s&appid=%s&units=metric",  "https://api.openweathermap.org/data/2.5/weather", "Addanki" , "201a066056964fc776029aef08adf9c7");
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
