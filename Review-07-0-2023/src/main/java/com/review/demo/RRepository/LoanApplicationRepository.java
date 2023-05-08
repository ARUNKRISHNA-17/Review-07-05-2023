package com.review.demo.RRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review.demo.RModel.LoanApplicationModel;

public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel, Integer> {

}
