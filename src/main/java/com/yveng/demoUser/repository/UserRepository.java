package com.yveng.demoUser.repository;

import com.yveng.demoUser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}