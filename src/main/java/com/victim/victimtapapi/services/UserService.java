package com.victim.victimtapapi.services;

import com.victim.victimtapapi.entities.User;


/**
 * @Author Victim Musundire
 * @Date 9/21/2022 12:37 AM
 * @Version 1.0
 */
public interface UserService {
    User getUserById(Long id);
    User getUserByUsername(String username);
}
