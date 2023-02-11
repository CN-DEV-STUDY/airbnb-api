package com.clone.airbnb.hosting.repository;

import com.clone.airbnb.hosting.domain.Host;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostRepository extends JpaRepository<Host, Integer> {

}
