package com.clone.airbnb.home.controller;

import com.clone.airbnb.home.domain.Home;
import com.clone.airbnb.home.service.HomeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
@Log4j2
public class HomeContoller {

    private final HomeService homeService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Home>> list() {
        log.info("list 조회");
        List<Home> list = homeService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
