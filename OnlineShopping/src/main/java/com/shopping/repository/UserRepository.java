package com.shopping.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public Boolean existsByUserName(String userName);

	public Optional<User> findByUserName(String userName);

}
