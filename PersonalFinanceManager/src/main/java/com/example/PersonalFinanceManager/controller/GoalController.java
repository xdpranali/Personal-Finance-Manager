package com.example.PersonalFinanceManager.controller;


import com.example.PersonalFinanceManager.model.Goal;
import com.example.PersonalFinanceManager.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goals")
public class GoalController {

    @Autowired
    private GoalService goalService;

    @GetMapping
    public List<Goal> getAllGoals() {
        return goalService.getAllGoals();
    }

    @PostMapping
    public Goal saveGoal(@RequestBody Goal goal) {
        return goalService.save(goal);
    }

    @DeleteMapping("/{id}")
    public void deleteGoal(@PathVariable Long id) {
        goalService.delete(id);
    }
}
