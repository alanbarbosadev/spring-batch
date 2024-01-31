package com.springbatchtest.demo.repository;

import com.springbatchtest.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
