package com.example.geektrust.models.vehicle;

import java.util.HashMap;
import lombok.Data;

@Data
public class Vehicle {

  public VehicleType type;
  public Integer speed;
  public Integer timeToCrossCrater;

  Vehicle(VehicleType type, Integer speed, Integer timeToCrossCrater) {
    this.speed = speed;
    this.timeToCrossCrater = timeToCrossCrater;
    this.type = type;
  }

  public static HashMap<VehicleType, Vehicle> getVehicleTypeMap() {
    HashMap<VehicleType, Vehicle> vehicleTypeVehicleHashMap = new HashMap<>();
    vehicleTypeVehicleHashMap.put(VehicleType.BIKE,
        new Vehicle(VehicleType.BIKE, VehicleConstants.BIKE_SPEED, VehicleConstants.BIKE_TIME));
    vehicleTypeVehicleHashMap.put(VehicleType.TUKTUK,
        new Vehicle(VehicleType.TUKTUK, VehicleConstants.TUKTUK_SPEED,
            VehicleConstants.TUKTUK_TIME));
    vehicleTypeVehicleHashMap.put(VehicleType.CAR,
        new Vehicle(VehicleType.CAR, VehicleConstants.CAR_SPEED, VehicleConstants.CAR_TIME));
    return vehicleTypeVehicleHashMap;
  }
}
