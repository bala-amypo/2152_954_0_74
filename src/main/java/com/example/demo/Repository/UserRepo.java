

package com.example.demo.Repository;

import java.util.Optional;
import org.springframework.data.jpa.Repository.JpaRepository;
import com.example.demo.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}