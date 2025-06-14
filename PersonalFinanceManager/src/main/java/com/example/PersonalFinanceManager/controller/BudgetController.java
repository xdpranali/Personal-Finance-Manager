package com.example.PersonalFinanceManager.controller;

import com.example.PersonalFinanceManager.model.Budget;
import com.example.PersonalFinanceManager.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budgets")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @GetMapping
    public List<Budget> getAllBudgets() {
        return budgetService.getAllBudgets();
    }

    @PostMapping
    public Budget saveBudget(@RequestBody Budget budget) {
        return budgetService.save(budget);
    }

    @DeleteMapping("/{id}")
    public void deleteBudget(@PathVariable Long id) {
        budgetService.delete(id);
    }
}
