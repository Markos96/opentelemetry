package com.spring.opentelemetry.data.dao;

import com.spring.opentelemetry.data.domain.User;
import com.spring.opentelemetry.data.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserJPADAO {

    private UserRepository userRepository;

    public UserJPADAO(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        this.userRepository.save(user);
    }
}
