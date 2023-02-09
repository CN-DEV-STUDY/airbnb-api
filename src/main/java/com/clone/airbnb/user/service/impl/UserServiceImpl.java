package com.clone.airbnb.user.service.impl;

import com.clone.airbnb.user.domain.User;
import com.clone.airbnb.user.dto.LoginDTO;
import com.clone.airbnb.user.dto.UserDTO;
import com.clone.airbnb.user.repository.UserRepository;
import com.clone.airbnb.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private static BCryptPasswordEncoder encoder;


    @Override
    public void signUp(UserDTO userDTO) {

        encoder = new BCryptPasswordEncoder();
        userDTO.setPwd(encoder.encode(userDTO.getPwd())); // 비밀번호 암호화

        User user = userDTOToEntity(userDTO);
        userRepository.save(user);
    }

    @Override
    public Map<String,Object> signIn(LoginDTO loginDTO) {
        Map<String, Object> resultMap = new HashMap<>();

        User user = userRepository.findByEmail(loginDTO.getEmail());

        if(user == null){
            resultMap.put("msg", "사용자가 존재하지 않습니다.");
        } else if (user != null && encoder.matches(loginDTO.getPwd(), user.getPwd())){
            resultMap.put("msg", "로그인 성공");
        } else {
            resultMap.put("msg", "비밀번호를 다시 한번 확인해주세요.");
        }
        return resultMap;
    }
}
