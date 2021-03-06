package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.crud.entity.User;
import com.crud.exception.ResourceNotFoundException;
import com.crud.repo.UserRepository;

@Service
public class ServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User Update(User user, Long userId) {
        User existsUser = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "UserId", userId));
        existsUser.setUserName(user.getUserName());
        existsUser.setUserFatherName(user.getUserFatherName());
        existsUser.setUserMobile(user.getUserMobile());
        existsUser.setUserAddress(user.getUserAddress());
        userRepository.save(existsUser);
        return existsUser;
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "userId", userId));

    }

    @Override
    public List<User> getUserByName(String userName) {
        List<User> existsName = userRepository.findByUserName(userName);
        if (!existsName.isEmpty() || existsName == null) {
            userRepository.findByUserName(userName);
        } else {
            throw new ResourceNotFoundException("User", "userName", userName);
        }
        return existsName;

    }

    @Override
    public void DeleteById(Long userId) {
        userRepository.findById(userId)
                .orElseThrow(()->new ResourceNotFoundException("User","userId",userId));
        userRepository.deleteById(userId);
    }

	@Override
	public List<User> pagination(int pageNo, int pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<User> pageResult = userRepository.findAll(paging);
		return pageResult.toList();
	}

}
