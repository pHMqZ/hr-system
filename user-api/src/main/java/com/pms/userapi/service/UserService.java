package com.pms.userapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.pms.userapi.entity.User;
import com.pms.userapi.exception.ObjectNotFoundException;
import com.pms.userapi.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private Environment env;

    public User findById(Long id){
    	log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port" );
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
    
    public List<User> findAll(){
    	return userRepository.findAll();
    }
}
