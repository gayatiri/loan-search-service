package com.scb.loan.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scb.loan.app.model.LoanEntity;
import com.scb.loan.app.service.SearchService;

@RestController
public class SearchController {
	
	@Autowired
	SearchService service;

	@GetMapping("/loan/search")
	public ResponseEntity<?> loanSearch(@RequestBody LoanEntity loanObject){
		
		List<LoanEntity> loanList = service.getloanDetails(loanObject);
		return loanList.isEmpty()? ResponseEntity.notFound().build() : ResponseEntity.ok(loanList) ;
		
	}
}
