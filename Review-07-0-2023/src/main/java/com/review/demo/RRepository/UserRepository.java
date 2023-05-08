package com.review.demo.RRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review.demo.RModel.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
