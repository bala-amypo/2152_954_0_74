

package com.example.demo.Service;

import org.springframework.stereotype.Service;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Entity.VehicleEntity;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepo;
    private final UserRepository userRepo;

    public VehicleServiceImpl(VehicleRepository vehicleRepo,
                              UserRepository userRepo) {
        this.vehicleRepo = vehicleRepo;
        this.userRepo = userRepo;
    }

    @Override
    public VehicleEntity addVehicle(Long userId, VehicleEntity vehicle) {

        if (vehicle.getCapacityKg() <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }

        UserEntity user = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        vehicle.setUser(user);
        return vehicleRepo.save(vehicle);
    }
}