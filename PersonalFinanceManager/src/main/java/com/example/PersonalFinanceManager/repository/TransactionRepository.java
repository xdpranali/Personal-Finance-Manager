package com.example.PersonalFinanceManager.repository;

import com.example.PersonalFinanceManager.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
