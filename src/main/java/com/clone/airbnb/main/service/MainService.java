package com.clone.airbnb.main.service;

import com.clone.airbnb.main.domain.Category;
import com.clone.airbnb.main.dto.CategoryDTO;

import java.util.ArrayList;
import java.util.List;

public interface MainService {


    default List<CategoryDTO> CategorytoDTO(List<Category> categoryList) {
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
