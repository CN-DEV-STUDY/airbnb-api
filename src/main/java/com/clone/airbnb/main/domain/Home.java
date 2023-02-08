package com.clone.airbnb.main.domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Home {

    @Id @GeneratedValue
    @Column(name = "home_id")
    private Integer id;

    private String place;
    private String title;

    @Nullable
    private Boolean isSuperHost;
    private String addr;
    private String lat;
    private String lng;
    private String subTitle;
    @Nullable
    private Integer filterMaxPerson;
    @Nullable
    private Integer filterBedroom;
    @Nullable
    private Integer filterBed;
    @Nullable
    private Integer filterBathroom;
    private Integer price;
    private String hostNotice;
    private String locInfo;

    @OneToOne(mappedBy = "home")
    private Picture picture;

}
