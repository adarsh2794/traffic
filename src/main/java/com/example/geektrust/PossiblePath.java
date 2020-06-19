package com.example.geektrust;

import com.example.geektrust.helpers.TrafficTimeHelper;
import com.example.geektrust.models.Input;
import com.example.geektrust.models.orbit.Orbit;
import com.example.geektrust.models.vehicle.Vehicle;
import com.example.geektrust.models.vehicle.VehicleOrbitType;
import com.example.geektrust.models.vehicle.VehicleType;
import com.example.geektrust.models.weather.Weather;
import com.example.geektrust.utils.ProcessInput;
import java.util.ArrayList;
import java.util.HashMap;

class PossiblePath {

  private ProcessInput processInput;
  private TrafficTimeHelper trafficTimeHelper;


  PossiblePath(ProcessInput processInput, TrafficTimeHelper trafficTimeHelper) {
    this.processInput = processInput;
    this.trafficTimeHelper = trafficTimeHelper;
  }

  /**
   * @param data
   * @return
   */

  String getShortestPossiblePath(String data) {
    Input inputData = processInput.getProcessedInput(data);
    return trafficTimeHelper.getBestTimeData(getVehicleOrbitTypeMap(inputData));
  }

  private HashMap<VehicleOrbitType, Double> getVehicleOrbitTypeMap(Input inputData) {

    HashMap<VehicleOrbitType, Double> vehicleOrbitTimeMap = new HashMap<>();
    Integer craterOffset = Weather.getWeatherCraterChangeMap().get(inputData.getWeatherType());
    ArrayList<Orbit> orbitList = Orbit.getOrbitListFromInputData(inputData);

    for (VehicleType vehicleType : Weather.getWeatherAllowedVehicleMap()
        .get(inputData.getWeatherType())) {
      Vehicle vehicle = Vehicle.getVehicleTypeMap().get(vehicleType);
      Orbit minOrbit = null;
      Double minTime = null;
      for (Orbit orbit : orbitList) {
        Double timeTaken = trafficTimeHelper.timeTakenByOrbit(orbit, vehicle, craterOffset);
        if (minTime == null || timeTaken < minTime) {
          minTime = timeTaken;
          minOrbit = orbit;
        }
      }
      if (minOrbit != null) {
        vehicleOrbitTimeMap.put(new VehicleOrbitType(vehicleType, minOrbit.getOrbitType()),
            trafficTimeHelper.timeTakenByOrbit(minOrbit, vehicle, craterOffset));
      }
    }
    return vehicleOrbitTimeMap;
  }

}
