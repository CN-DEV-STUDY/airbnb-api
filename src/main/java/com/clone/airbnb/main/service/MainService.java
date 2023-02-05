package com.clone.airbnb.main.service;

import com.clone.airbnb.main.repository.CategoryRepository;
import com.clone.airbnb.main.repository.HomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MainService {

    private final HomeRepository homeRepository;
    private final CategoryRepository categoryRepository;
    public Map<String, List<?>> findAll() {
        Map<String, List<?>> resultMap = new LinkedHashMap<>();
        resultMap.put("categories", categoryRepository.findAllCategoryWithUrl());
        resultMap.put("accomodations", homeRepository.findAll());

        return resultMap;
    }
}
