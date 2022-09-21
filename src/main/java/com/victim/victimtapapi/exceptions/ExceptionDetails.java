package com.victim.victimtapapi.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @Author Victim Musundire
 * @Date 9/21/2022 4:01 AM
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDetails {
    private int id;
    private String message;
    private HttpStatus httpStatus;
}
