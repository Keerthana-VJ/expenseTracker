package com.example.backend.User.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.User.Dto.UserInput;
import com.example.backend.User.Model.UserDB;
import com.example.backend.User.Service.UserService;

@RestController
@RequestMapping("/Account")
//
public class UserController {

    private final UserService dataService;

    public UserController(UserService dataService)
    {
        this.dataService = dataService;
    }
    
    @PostMapping("/addUser")
    public UserDB adduser(@RequestBody UserInput userInput)
    {
        return dataService.addCustomer(userInput);
    }

    @GetMapping("/{id}")
    public UserDB getUser(@PathVariable UUID id)
    {
        return dataService.getCustomer(id);
    }

    @GetMapping("/allUsers")
    public List<UserDB>allUsers(UserDB userdata)
    {
        return dataService.allCustomers(userdata);
    }

    
}
