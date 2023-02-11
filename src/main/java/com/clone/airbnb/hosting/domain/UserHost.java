package com.clone.airbnb.hosting.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "host_user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class UserHost {
    @Id
    @GeneratedValue
    @Column(name = "user_host_id")
    private Integer id;
    private Integer userId;
    private Integer hostId;

}
