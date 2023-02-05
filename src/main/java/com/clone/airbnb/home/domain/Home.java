package com.clone.airbnb.home.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
public class Home {

    @Id @GeneratedValue
    @Column(name = "home_id")
    private int id;

    private String place;
    private String title;
    private boolean isSuperHost;
    private String addr;
    private String lat;
    private String lng;
    private String subTitle;
    private int filterMaxPerson;
    private int filterBedroom;
    private int filterBed;
    private int filterBathroom;
    private int price;
    private String hostNotice;
    private String locInfo;


}
