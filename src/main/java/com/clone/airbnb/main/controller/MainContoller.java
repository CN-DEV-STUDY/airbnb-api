package com.clone.airbnb.main.controller;

import com.clone.airbnb.main.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Log4j2
public class MainContoller {

    private final MainService mainService;

    @GetMapping("/mainList")
    @ResponseBody
    public ResponseEntity<Map<String, List<?>>> list() {
        log.info("list 조회");
        Map<String, List<?>> resultMap = mainService.findAll();
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

}
