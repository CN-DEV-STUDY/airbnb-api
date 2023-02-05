package com.clone.airbnb.home.service;

import com.clone.airbnb.home.domain.Home;
import com.clone.airbnb.home.repository.HomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService {

    private final HomeRepository homeRepository;
    public List<Home> findAll() {
        return homeRepository.findAll();
    }
}
