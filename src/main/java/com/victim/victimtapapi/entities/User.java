package com.victim.victimtapapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Victim Musundire
 * @Date 9/21/2022 12:10 AM
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    @JsonIgnore
    private String name;
    private String username;
    private String email;
    @JsonIgnore
    private Address address;
    private String phone;
    @JsonIgnore
    private String website;
    @JsonIgnore
    private Company company;
}
