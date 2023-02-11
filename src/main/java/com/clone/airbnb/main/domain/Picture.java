package com.clone.airbnb.main.domain;

import javax.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "picture")
public class Picture {

    @Id
    @GeneratedValue
    @Column(name = "picture_id")
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_id")
    private Home home;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
    private String url;

}
