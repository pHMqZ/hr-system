package com.pms.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.userapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
