package com.review.demo.RRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review.demo.RModel.AdminModel;

public interface AdminRepository extends JpaRepository<AdminModel, Integer> {

}
