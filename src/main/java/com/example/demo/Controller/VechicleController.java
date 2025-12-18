

package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.VehicleEntity;
import com.example.demo.Service.VehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/{userId}")
    public VehicleEntity addVehicle(@PathVariable Long userId,
                              @RequestBody VehicleEntity vehicle) {
        return vehicleService.addVehicle(userId, vehicleEntity);
    }
}