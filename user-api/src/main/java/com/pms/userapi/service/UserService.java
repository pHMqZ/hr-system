package com.pms.userapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.userapi.entity.User;
import com.pms.userapi.exception.ObjectNotFoundException;
import com.pms.userapi.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
    
    public List<User> findAll(){
    	return userRepository.findAll();
    }
}
