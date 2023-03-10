package com.clone.airbnb.main.service.impl;

import com.clone.airbnb.main.dto.CategoryDTO;
import com.clone.airbnb.main.dto.HomeResponseDTO;
import com.clone.airbnb.main.repository.CategoryRepository;
import com.clone.airbnb.main.repository.HomeRepository;
import com.clone.airbnb.main.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {

    private final HomeRepository homeRepository;
    private final CategoryRepository categoryRepository;
    public Map<String, List<?>> findAll() {
        Map<String, List<?>> resultMap = new LinkedHashMap<>();
        List<CategoryDTO> categoryList = categoryToDTO(categoryRepository.findAllCategoryWithUrl());
        List<HomeResponseDTO> homeList = homeToDTO(homeRepository.findAllHomeWithUrl());
        resultMap.put("categoryList", categoryList);
        resultMap.put("homeList", homeList);

        return resultMap;
    }
}
