package com.dkey.web.controller;

import com.dkey.dao.UserDao;
import com.dkey.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/all")
    public List<User> getUsers(){
        return userDao.findAll();
    }
    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userDao.findById(id);
    }

}