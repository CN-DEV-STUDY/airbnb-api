package com.clone.airbnb.main.repository;

import com.clone.airbnb.main.domain.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HomeRepository extends JpaRepository<Home, Integer> {

    @Query("select h from Home h join fetch h.picture")
    List<Home> findAllHomeWithUrl();

}
