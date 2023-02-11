package com.clone.airbnb.main.domain;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "home")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Home {

    @Id @GeneratedValue
    @Column(name = "home_id")
    private Integer id;

    private String place;
    private String title;
    private Boolean isSuperHost;
    private String addr;
    private String lat;
    private String lng;
    private String subTitle;
    private Integer filterMaxPerson;
    private Integer filterBedroom;
    private Integer filterBed;
    private Integer filterBathroom;
    private Integer price;
    private String hostNotice;
    private String locInfo;

    @OneToOne(mappedBy = "home")
    private Picture picture;

}
