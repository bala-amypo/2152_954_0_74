

package com.example.demo.Service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;
    private final BCryptPasswordEncoder encoder;

    public UserServiceImpl(UserRepository userRepo,
                           BCryptPasswordEncoder encoder) {
        this.userRepo = userRepo;
        this.encoder = encoder;
    }

    @Override
    public UserEntity registerUser(UserEntity user) {

        // default role
        if (user.getRole() == null) {
            user.setRole("USER");
        }

        // encrypt password
        user.setPassword(encoder.encode(user.getPassword()));

        return userRepo.save(user);
    }
}