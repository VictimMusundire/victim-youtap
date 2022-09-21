package com.victim.victimtapapi.controllers;

import com.victim.victimtapapi.entities.User;
import com.victim.victimtapapi.exceptions.UserNotFoundException;
import com.victim.victimtapapi.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Victim Musundire
 * @Date 9/21/2022 12:26 AM
 * @Version 1.0
 */

@RestController
@RequestMapping("/getusercontacts")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "Use Path variable parameter(@PathVariable) EG: http://localhost:8080/getusercontacts/1",
            description = "Use the id: This endpoint retrieves the contact details for a particular user")
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user = userService.getUserById(id);
        if (user == null){
            throw new UserNotFoundException("User not Found");
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Operation(summary = "Use Query string parameter (@RequestParam) EG: http://localhost:8080/getusercontacts?username=Bret",
    description = "Use the username: This endpoint retrieves the contact details for a particular user")
    @GetMapping("")
    public ResponseEntity<User> getUserByUsername(@RequestParam(required = false) String username){
        User user = userService.getUserByUsername(username);
        if (user == null){
            throw new UserNotFoundException("User not Found");
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
