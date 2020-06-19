package com.example.geektrust.models.weather;

import com.example.geektrust.models.vehicle.VehicleType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Weather {


  public static HashMap<WeatherType, Integer> getWeatherCraterChangeMap() {
    HashMap<WeatherType, Integer> weatherCraterMap = new HashMap<>();
    weatherCraterMap.put(WeatherType.SUNNY, -10);
    weatherCraterMap.put(WeatherType.RAINY, 20);
    weatherCraterMap.put(WeatherType.WINDY, 0);
    return weatherCraterMap;
  }

  public static HashMap<WeatherType, ArrayList<VehicleType>> getWeatherAllowedVehicleMap() {

    HashMap<WeatherType, ArrayList<VehicleType>> weatherVehicleTypeMap = new HashMap<>();
    weatherVehicleTypeMap.put(WeatherType.SUNNY,
        new ArrayList<>(Arrays.asList(VehicleType.BIKE, VehicleType.CAR, VehicleType.TUKTUK)));
    weatherVehicleTypeMap.put(WeatherType.RAINY,
        new ArrayList<>(Arrays.asList(VehicleType.CAR, VehicleType.TUKTUK)));
    weatherVehicleTypeMap.put(WeatherType.WINDY,
        new ArrayList<>(Arrays.asList(VehicleType.BIKE, VehicleType.CAR)));
    return weatherVehicleTypeMap;

  }
}
