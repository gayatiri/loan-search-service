package com.scb.loan.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name="Loan")
public class LoanEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String borrowerName;
	private double loanAmount;
	private long loanId;
	
	//@CreatedDate
	private Date createdAt;
	
	//@LastModifiedDate
	private Date lastModifiedAt;
	
}
