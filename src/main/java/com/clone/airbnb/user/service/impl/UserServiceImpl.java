package com.clone.airbnb.user.service.impl;

import com.clone.airbnb.user.domain.User;
import com.clone.airbnb.user.dto.UserDTO;
import com.clone.airbnb.user.repository.UserRepository;
import com.clone.airbnb.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void signUp(UserDTO userDTO) {
        User user = userDTOToEntity(userDTO);
        userRepository.save(user);
    }
}
