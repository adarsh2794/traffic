package com.example.geektrust.models.vehicle;

import com.example.geektrust.models.orbit.OrbitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleOrbitType {

  public VehicleType vehicleType;
  public OrbitType orbitType;

}