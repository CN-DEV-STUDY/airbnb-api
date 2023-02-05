package com.clone.airbnb.main.repository;

import com.clone.airbnb.main.domain.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home, Integer> {

}
