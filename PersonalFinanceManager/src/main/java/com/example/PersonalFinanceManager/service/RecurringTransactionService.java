package com.example.PersonalFinanceManager.service;

import com.example.PersonalFinanceManager.model.RecurringTransaction;
import com.example.PersonalFinanceManager.repository.RecurringTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecurringTransactionService {

    @Autowired
    private RecurringTransactionRepository recurringTransactionRepository;

    public List<RecurringTransaction> getAllRecurringTransactions() {
        return recurringTransactionRepository.findAll();
    }

    public RecurringTransaction save(RecurringTransaction recurringTransaction) {
        return recurringTransactionRepository.save(recurringTransaction);
    }

    public void delete(Long id) {
        recurringTransactionRepository.deleteById(id);
    }
}
