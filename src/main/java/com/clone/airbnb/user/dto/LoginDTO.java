package com.clone.airbnb.user.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginDTO {

    @NotNull
    private String email;

    @NotNull
    private String pwd;
}
