

package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.VehicleEntity;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {
}