package com.example.geektrust.models;

import com.example.geektrust.models.weather.WeatherType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Input {

  public WeatherType weatherType;
  public Integer trafficSpeedOrbit1;
  public Integer trafficSpeedOrbit2;

}
