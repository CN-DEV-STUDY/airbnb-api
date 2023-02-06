package com.clone.airbnb.user.controller;

import com.clone.airbnb.user.dto.UserDTO;
import com.clone.airbnb.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<Map<String, Object>> signUp(@Validated @RequestBody UserDTO userDTO){
        Map<String, Object> resultMap = new HashMap<>();

        try {
            userService.signUp(userDTO);
            resultMap.put("msg", "등록 완료");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("msg", "등록 실패");
        }

        return new ResponseEntity<>(resultMap , HttpStatus.OK);
    }
}
