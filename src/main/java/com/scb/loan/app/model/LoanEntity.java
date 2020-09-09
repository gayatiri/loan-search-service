package com.scb.loan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Entity
@Table(name="Loan_details")
public class LoanEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="borrower_name")
	private String borrowerName;
	@Column(name="loan_amount")
	private double loanAmount;
	@Column(name="loan_number")
	private long loanId;
	
//	@CreatedDate
//	private Date createdAt;
//	@LastModifiedDate
//	private Date lastModifiedAt;
	
}
