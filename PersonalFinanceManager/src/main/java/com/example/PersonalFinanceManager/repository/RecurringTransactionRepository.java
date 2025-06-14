package com.example.PersonalFinanceManager.repository;

import com.example.PersonalFinanceManager.model.RecurringTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecurringTransactionRepository extends JpaRepository<RecurringTransaction, Long> {
}
