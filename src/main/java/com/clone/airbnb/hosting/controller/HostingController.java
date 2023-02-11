package com.clone.airbnb.hosting.controller;

import com.clone.airbnb.hosting.service.HostingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class HostingController {

    private final HostingService hostingService;

    @PostMapping("/host/regiter/{userId}")
    public ResponseEntity<Integer> homeRegistration(@PathVariable Integer userId) {
        int result = hostingService.homeRegistration(userId);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
