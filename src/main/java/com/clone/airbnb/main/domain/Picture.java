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
    private int home_id;
    private int category_id;
    private String url;
}
