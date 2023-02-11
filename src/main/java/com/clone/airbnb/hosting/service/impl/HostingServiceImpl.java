package com.clone.airbnb.hosting.service.impl;

import com.clone.airbnb.hosting.domain.Host;
import com.clone.airbnb.hosting.domain.UserHost;
import com.clone.airbnb.hosting.repository.HostRepository;
import com.clone.airbnb.hosting.repository.UserHostRepository;
import com.clone.airbnb.hosting.service.HostingService;
import com.clone.airbnb.main.domain.Home;
import com.clone.airbnb.main.repository.HomeRepository;
import com.clone.airbnb.user.domain.User;
import com.clone.airbnb.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HostingServiceImpl implements HostingService {

    private final HomeRepository homeRepository;
    private final HostRepository hostRepository;
    private final UserHostRepository userHostRepository;
    private final UserRepository userRepository;

    @Override
    public int homeRegistration(Integer userId) {
        Home home = homeRepository.save(Home.builder().build());

        if(home == null) {
            return 0;
        }

        Optional<User> user = userRepository.findById(userId);
        if(!user.isPresent()) {
            return 0;
        }

        String firstName = user.get().getFirstName();
        String lastName = user.get().getLastName();
        String hostName = firstName + " " + lastName;


        Host host = hostRepository.save(Host.builder()
                .home(home)
                .hostName(hostName)
                .build());
        userHostRepository.save(UserHost.builder().userId(user.get().getUserId())
                .hostId(host.getId())
                .build());

        return 1;
    }
}
