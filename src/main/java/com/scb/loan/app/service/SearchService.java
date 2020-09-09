package com.scb.loan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.loan.app.model.LoanEntity;
import com.scb.loan.app.repo.LoanRepository;

@Service
public class SearchService {

	@Autowired
	LoanRepository repository;

	public List<LoanEntity> getloanDetails(LoanEntity loanObject) {
//		borrowerName;
//		private double loanAmount;
//		private long loanId;
		LoanEntity loanBuilder = LoanEntity.builder().borrowerName(loanObject.getBo)
		List<LoanEntity> loanList = repository.findAll(LoanEntity.of(loanBuilder));

		return loanList;
	}

}
