package com.clone.airbnb.main.repository;

import com.clone.airbnb.main.domain.Category;
import com.clone.airbnb.main.dto.CategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query("SELECT c, p FROM Category c LEFT JOIN Picture p on c.id = p.category_id")
    public List<Category> findAllCategoryWithUrl();
}
