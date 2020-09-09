package com.scb.loan.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.loan.app.model.LoanEntity;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Integer> {
	
	
}

