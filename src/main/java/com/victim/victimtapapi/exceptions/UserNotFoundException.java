package com.victim.victimtapapi.exceptions;

/**
 * @Author Victim Musundire
 * @Date 9/21/2022 3:57 AM
 * @Version 1.0
 */
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
