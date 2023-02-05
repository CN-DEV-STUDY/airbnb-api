package com.clone.airbnb.main.dto;

import com.clone.airbnb.main.domain.Category;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CategoryDTO {

    private int id;
    private String name;
    private String url;

}
