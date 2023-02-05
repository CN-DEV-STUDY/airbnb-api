package com.clone.airbnb.main.dto;

import lombok.*;

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
