package com.kcbgroup.main.service.implementation;

import com.kcbgroup.main.models.User;
import com.kcbgroup.main.models.UserRequestDTO;
import com.kcbgroup.main.repository.UserRepository;
import com.kcbgroup.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<?> saveUser(UserRequestDTO userRequest) {
        User user = User.builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .mobile(userRequest.getMobile())
                .age(userRequest.getAge())
                .build();
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
    }
}
