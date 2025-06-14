package com.example.PersonalFinanceManager.service;


import com.example.PersonalFinanceManager.model.Budget;
import com.example.PersonalFinanceManager.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Budget save(Budget budget) {
        return budgetRepository.save(budget);
    }

    public void delete(Long id) {
        budgetRepository.deleteById(id);
    }
}
