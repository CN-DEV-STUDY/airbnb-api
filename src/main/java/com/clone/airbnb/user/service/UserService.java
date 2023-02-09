package com.clone.airbnb.user.service;

import com.clone.airbnb.user.domain.User;
import com.clone.airbnb.user.dto.LoginDTO;
import com.clone.airbnb.user.dto.UserDTO;

import java.util.Map;

public interface UserService {

    void signUp(UserDTO userDTO);

    Map<String,Object> signIn(LoginDTO loginDTO);

    default User userDTOToEntity(UserDTO userDTO){
        User user = User.builder()
                .userId(userDTO.getUserId())
                .email(userDTO.getEmail())
                .pwd(userDTO.getPwd())
                .lastName(userDTO.getLastName())
                .firstName(userDTO.getFirstName())
                .birthday(userDTO.getBirthday())
                .profileImg(userDTO.getProfileImg())
                .signupDate(userDTO.getSignupDate())
                .description(userDTO.getDescription())
                .build();
        return user;
    }
}
