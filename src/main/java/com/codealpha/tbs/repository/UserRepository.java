package com.codealpha.tbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codealpha.tbs.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
