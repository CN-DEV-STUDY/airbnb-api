package com.clone.airbnb.hosting.repository;

import com.clone.airbnb.hosting.domain.UserHost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHostRepository extends JpaRepository<UserHost, Integer> {
}
