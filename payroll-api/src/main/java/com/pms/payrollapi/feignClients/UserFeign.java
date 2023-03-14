package com.pms.payrollapi.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pms.payrollapi.entity.User;

@FeignClient(name = "user-api")
public interface UserFeign {
	
	@GetMapping("/api/users/{id}")
	ResponseEntity<User> findById(@PathVariable Long id);
	
	@GetMapping
	ResponseEntity<List<User>> findAll();

}
