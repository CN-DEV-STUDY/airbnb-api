package com.clone.airbnb.main.service;

import com.clone.airbnb.main.domain.Category;
import com.clone.airbnb.main.dto.CategoryDTO;

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


}
