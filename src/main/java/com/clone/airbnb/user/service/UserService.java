package com.clone.airbnb.user.service;

import com.clone.airbnb.user.domain.User;
import com.clone.airbnb.user.dto.UserDTO;

public interface UserService {

    void signUp(UserDTO userDTO);

    default User userDTOToEntity(UserDTO userDTO){
        User user = User.builder()
                .id(userDTO.getId())
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
