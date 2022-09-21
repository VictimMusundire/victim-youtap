package com.victim.victimtapapi.services.Impl;

import com.victim.victimtapapi.entities.User;
import com.victim.victimtapapi.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



/**
 * @Author Victim Musundire
 * @Date 9/21/2022 12:40 AM
 * @Version 1.0
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private final RestTemplate restTemplate;
    @Value("${you-tap.users}")
    private String usersUrl;

    public UserServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public User getUserById(Long id){
        User[] userList = restTemplate.getForObject(usersUrl,User[].class);
        assert userList != null;
            for (User userNow: userList) {
                if (id.equals(userNow.getId())){
                    return userNow;
                }
            }
        return null;
    }
    @Override
    public User getUserByUsername(String username) {
        User[] userList = restTemplate.getForObject(usersUrl,User[].class);
        assert userList != null;
        for (User userNow: userList) {
            if (username.equalsIgnoreCase(userNow.getUsername())){
                return userNow;
            }
        }
        return null;
    }
}
