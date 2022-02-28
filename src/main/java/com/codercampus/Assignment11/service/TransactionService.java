package com.codercampus.Assignment11.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	TransactionRepository transactionRepo;
	


	public List<Transaction> findAll() {
//		Optional<Transaction> sortedDates = transactionRepo.findAll().stream()
//				.sorted((e1, e2) -> e2.getDate().compareTo(e1.getDate())).findFirst();	
		return transactionRepo.findAll();
	}
	

	public Transaction findById(Transaction transaction, Long transactionId) {
		
		return transactionRepo.findById(transaction, transactionId);
	}

//	Optional<Transaction> sortedDates = transactionRepo.findAll().stream()
//  .sorted((e1, e2) -> e2.getDate().compareTo(e1.getDate()))
//  .findFirst();
}
