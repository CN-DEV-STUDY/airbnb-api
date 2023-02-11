package com.clone.airbnb.hosting.domain;

import com.clone.airbnb.main.domain.Home;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "host")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Host {

    @Id
    @GeneratedValue
    @Column(name = "host_id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "home_id")
    private Home home;

    private String hostName;
    private LocalDate hostSignInDate;
    private Boolean checkSuperHost;
    private Boolean checkCertification;
    private Integer hostReviewNum;
    private String hostStatusMessage;
    private String Interaction_with_guests;
    private String host_language;
    private String response_rate;
    private String response_time;
}
