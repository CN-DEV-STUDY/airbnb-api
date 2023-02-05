package com.clone.airbnb.main.repository;

import com.clone.airbnb.main.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query("SELECT c FROM Category c LEFT JOIN c.picture")
    List<Category> findAllCategoryWithUrl();
}
