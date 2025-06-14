package com.example.PersonalFinanceManager.service;

import com.example.PersonalFinanceManager.model.Goal;
import com.example.PersonalFinanceManager.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {

    @Autowired
    private GoalRepository goalRepository;

    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }

    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }

    public void delete(Long id) {
        goalRepository.deleteById(id);
    }
}

