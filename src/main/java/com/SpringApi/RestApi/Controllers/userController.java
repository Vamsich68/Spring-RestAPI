package com.SpringApi.RestApi.Controllers;

import com.SpringApi.RestApi.Repo.userRepository;
import com.SpringApi.RestApi.Services.userService;
import com.SpringApi.RestApi.User.user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    private userRepository userrepository;

    public userController(userRepository userrepository) {
        this.userrepository = userrepository;
    }
    @GetMapping("/users")
    public List<user> retrieveall(){
        return userrepository.findAll();
    }
    @PostMapping("/users")
    public user createUser(user user){
        user saveuser= userrepository.save(user);
        return saveuser;
    }


    /*private userService userservice;

    public userController(userService userservice) {
        this.userservice = userservice;
    }
    @GetMapping("/users")
    public List<user> retrieveall(){
        return userservice.getall();
    }
    @GetMapping("/users/{id}")
    public user retrieveuser(@PathVariable int id){
        user user= userservice.getById(id);
        return user;
    }*/

}