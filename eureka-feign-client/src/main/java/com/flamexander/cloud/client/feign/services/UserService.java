package com.flamexander.cloud.client.feign.services;

import com.flamexander.cloud.client.entites.SystemUser;
import com.flamexander.cloud.client.entites.User;
import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService
        extends UserDetailsService {
    User findByUserName(String username);
    boolean save(SystemUser systemUser);
}
