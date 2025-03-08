package com.spring.opentelemetry.service;

import com.spring.opentelemetry.data.dao.UserJPADAO;
import com.spring.opentelemetry.data.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserJPADAO userJPADAO;

    public UserService(UserJPADAO userJPADAO) {
        this.userJPADAO = userJPADAO;
    }

    public void saveUser(User user) {
        this.userJPADAO.saveUser(user);
    }
}
