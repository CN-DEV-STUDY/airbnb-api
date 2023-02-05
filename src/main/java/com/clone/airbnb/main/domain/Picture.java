package com.clone.airbnb.main.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Picture {

    @Id
    @GeneratedValue
    @Column(name = "picture_id")
    private int id;

//    @OneTo
//    private int home_id;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private String url;

}
