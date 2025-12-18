

package com.example.demo.Service;

import com.example.demo.Entity.VehicleEntity;

public interface VehicleService {
    VehicleEntity addVehicle(Long userId, VehicleEntity vehicle);
}