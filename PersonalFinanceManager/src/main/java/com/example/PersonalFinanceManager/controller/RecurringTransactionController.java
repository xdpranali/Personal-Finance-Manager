package com.example.PersonalFinanceManager.controller;

import com.example.PersonalFinanceManager.model.RecurringTransaction;
import com.example.PersonalFinanceManager.service.RecurringTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recurring-transactions")
public class RecurringTransactionController {

    @Autowired
    private RecurringTransactionService recurringTransactionService;

    @GetMapping
    public List<RecurringTransaction> getAllRecurringTransactions() {
        return recurringTransactionService.getAllRecurringTransactions();
    }

    @PostMapping
    public RecurringTransaction saveRecurringTransaction(@RequestBody RecurringTransaction recurringTransaction) {
        return recurringTransactionService.save(recurringTransaction);
    }

    @DeleteMapping("/{id}")
    public void deleteRecurringTransaction(@PathVariable Long id) {
        recurringTransactionService.delete(id);
    }
}
