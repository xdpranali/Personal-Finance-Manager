package com.example.PersonalFinanceManager.repository;


import com.example.PersonalFinanceManager.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
