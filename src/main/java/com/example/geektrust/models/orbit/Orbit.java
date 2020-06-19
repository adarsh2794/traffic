package com.example.geektrust.models.orbit;

import com.example.geektrust.models.Input;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Orbit {

  Integer trafficSpeed;
  Integer distance;// in mm
  Integer craters;
  OrbitType orbitType;

  public Orbit(Integer trafficSpeed, Integer distance, Integer craters, OrbitType orbitType) {
    this.trafficSpeed = trafficSpeed;
    this.craters = craters;
    this.distance = distance;
    this.orbitType = orbitType;
  }

  public static ArrayList<Orbit> getOrbitListFromInputData(Input inputData) {
    ArrayList<Orbit> orbitArrayList = new ArrayList<>();
    Orbit orbit1 = new Orbit(inputData.getTrafficSpeedOrbit1(), OrbitConstants.ORBIT1_DISTANCE,
        OrbitConstants.ORBIT1_CRATERS, OrbitType.ORBIT1);
    Orbit orbit2 = new Orbit(inputData.getTrafficSpeedOrbit2(), OrbitConstants.ORBIT2_DISTANCE,
        OrbitConstants.ORBIT2_CRATERS, OrbitType.ORBIT2);
    orbitArrayList.add(orbit1);
    orbitArrayList.add(orbit2);
    return orbitArrayList;
  }

}
