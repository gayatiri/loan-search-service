package com.scb.loan.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.scb.loan.app.model.LoanEntity;
import com.scb.loan.app.repo.LoanRepository;

@Service
public class SearchService {

	@Autowired
	LoanRepository repository;

	public List<LoanEntity> getloanDetails(LoanEntity loanObject) {

		System.out.println("--------------------------->"+loanObject);
		List<LoanEntity> loanList = repository.findAll(Example.of(loanObject));

		return loanList;
	}

}
