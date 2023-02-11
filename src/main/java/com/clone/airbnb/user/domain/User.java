package com.clone.airbnb.user.domain;

import com.clone.airbnb.hosting.domain.Host;
import javax.persistence.*;
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
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String email;
    private String pwd;
    private String lastName;
    private String firstName;
    private LocalDate birthday;
    private String profileImg;
    private LocalDate signupDate;
    private String description;

    @OneToOne
    @JoinTable(name = "user_host",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "host_id"))
    private Host host;

}
