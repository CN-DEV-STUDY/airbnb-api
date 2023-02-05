package com.clone.airbnb.main.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Category {

    @Id @GeneratedValue
    @Column(name = "category_id")
    private int id;

    private String category_name;

    @OneToOne(mappedBy = "category")
    private Picture picture;

}
