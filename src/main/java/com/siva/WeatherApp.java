package com.siva;

import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherClient client = new WeatherClient();
        Scanner scanner = new Scanner(System.in);

        // Ask for user input (city)
        System.out.println("Enter the city name to get weather info:");
        String city = scanner.nextLine();

        // Fetch and display weather data
        String weatherData = client.getWeather(city);
        System.out.println("Weather data for " + city + ":");
        System.out.println(weatherData);
    }
}
