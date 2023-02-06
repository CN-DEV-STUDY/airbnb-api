package com.clone.airbnb.user.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    private String email;
    private String pwd;
    private String lastName;
    private String firstName;
    private LocalDate birthday;
    private String profileImg;
    private LocalDate signupDate;
    private String description;
}
