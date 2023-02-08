package com.clone.airbnb.main.service;

import com.clone.airbnb.main.domain.Category;
import com.clone.airbnb.main.domain.Home;
import com.clone.airbnb.main.dto.CategoryDTO;
import com.clone.airbnb.main.dto.HomeResponseDTO;
import com.clone.airbnb.main.repository.HomeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface MainService {

    Map<String, List<?>> findAll();

    default List<CategoryDTO> categoryToDTO(List<Category> categoryList) {
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        for(Category category : categoryList) {
            CategoryDTO categoryDTO = CategoryDTO.builder()
                    .id(category.getId())
                    .name(category.getCategory_name())
                    .url(category.getPicture().getUrl())
                    .build();
            categoryDTOList.add(categoryDTO);
        }
        return categoryDTOList;
    }

    default List<HomeResponseDTO> homeToDTO(List<Home> homeList) {
        List<HomeResponseDTO> homeResponseDTOList = new ArrayList<>();
        for(Home home : homeList) {
            HomeResponseDTO homeResponseDTO = HomeResponseDTO.builder()
                    .id(home.getId())
                    .place(home.getPlace())
                    .addr(home.getAddr())
                    .price(home.getPrice())
                    .url(home.getPicture().getUrl())
                    .build();
            homeResponseDTOList.add(homeResponseDTO);
        }
        return homeResponseDTOList;
    }

}
