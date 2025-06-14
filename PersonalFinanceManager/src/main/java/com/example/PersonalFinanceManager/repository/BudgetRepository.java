package com.example.PersonalFinanceManager.repository;

import com.example.PersonalFinanceManager.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
