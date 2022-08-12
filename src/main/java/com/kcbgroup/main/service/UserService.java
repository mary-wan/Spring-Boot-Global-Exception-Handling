package com.kcbgroup.main.service;

import com.kcbgroup.main.models.User;
import com.kcbgroup.main.models.UserRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    ResponseEntity<?> saveUser(UserRequestDTO userRequest);
}
