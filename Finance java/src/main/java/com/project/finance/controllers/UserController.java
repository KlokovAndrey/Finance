package com.project.finance.controllers;

import com.project.finance.entity.UserData;
import com.project.finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/search")
    public UserData findByLogin(@RequestParam String login) {
        return userService.findByLogin(login);
    }

    @GetMapping("/findAll")
    public List<UserData> findAll() {
        return userService.findAll();
    }


    @PostMapping("/add")
    public void addController(@RequestBody UserData user){
        userService.save(user);
    }

    @PostMapping("/checkExist")
    public boolean checkController(@RequestBody UserData user){
        return userService.checkUser(user);
    }
}
