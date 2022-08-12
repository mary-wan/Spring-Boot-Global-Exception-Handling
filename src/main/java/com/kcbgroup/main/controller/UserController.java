package com.kcbgroup.main.controller;

import com.kcbgroup.main.models.User;
import com.kcbgroup.main.models.UserRequestDTO;
import com.kcbgroup.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/users")
    public ResponseEntity<?> saveUser(@RequestBody @Valid UserRequestDTO userRequest) {
//        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
        return ResponseEntity.ok().body(userService.saveUser(userRequest));
    }
}
