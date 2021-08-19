package com.crud.controller;

import com.crud.entity.User;
import com.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //for creating single user
    @PostMapping("/")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
    }

    //for creating multiple user
    @PostMapping("/users")
    public ResponseEntity<List<User>> saveUsers(@RequestBody List<User> users) {
        return new ResponseEntity<List<User>>(userService.saveUsers(users), HttpStatus.CREATED);
    }

    //getting user record
    @GetMapping("/")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    //update user based on id
    @PutMapping("/update/{id}")
    public ResponseEntity<User> Update(@PathVariable("id") Long userId, @RequestBody User user) {
        return new ResponseEntity<User>(userService.Update(user, userId), HttpStatus.OK);

    }

    //getting user based on id
    @GetMapping("/get-id/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId) {
        return new ResponseEntity<User>(userService.getUserById(userId), HttpStatus.OK);
    }

    //getting user based on user name
    @GetMapping("/get-name/{userName}")
    public ResponseEntity<List<User>> getUserByName(@PathVariable("userName") String userName){
        return new ResponseEntity<List<User>>(userService.getUserByName(userName),HttpStatus.OK);
    }

    //delete user based on id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> DeleteById(@PathVariable("id") Long userId){
        userService.DeleteById(userId);
        return new ResponseEntity<String>("user id no:"+userId+" has been delete successfully",HttpStatus.OK);
    }


}
