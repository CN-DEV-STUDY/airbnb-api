package com.clone.airbnb.home.repository;

import com.clone.airbnb.home.domain.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home, Integer> {

}
