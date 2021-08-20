package com.crud.service;

import java.util.List;

import com.crud.entity.User;

public interface UserService {
    User saveUser(User user);
    List<User> saveUsers(List<User> users);
    List<User> getUsers();
    User Update(User user,Long userId);
    User getUserById(Long userId);
    List<User> getUserByName(String userName);
    void DeleteById(Long userId);
    List<User> pagination(int pageNo, int pageSize);
}
