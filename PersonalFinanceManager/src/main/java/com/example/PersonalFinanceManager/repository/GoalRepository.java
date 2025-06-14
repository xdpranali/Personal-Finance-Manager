package com.example.PersonalFinanceManager.repository;

import com.example.PersonalFinanceManager.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {
}
