package com.clone.airbnb.main.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HomeResponseDTO {
    private int id;
    private String place;
    private String addr;
    private int price;

    private String url;

}
