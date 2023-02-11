package com.clone.airbnb.main.domain;

import javax.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "category")
public class Category {

    @Id @GeneratedValue
    @Column(name = "category_id")
    private Integer id;

    private String category_name;

    @OneToOne(mappedBy = "category")
    private Picture picture;

}
