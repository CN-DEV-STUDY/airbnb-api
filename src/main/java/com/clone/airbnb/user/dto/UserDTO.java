package com.clone.airbnb.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserDTO {
    @NotNull
    private int id;

    @Email
    @NotNull
    private String email;

    @NotNull
    private String pwd;

    @NotNull
    private String lastName;

    @NotNull
    private String firstName;

    @NotNull
    private LocalDate birthday;
    private String profileImg;

    @NotNull
    private LocalDate signupDate;
    private String description;
}
