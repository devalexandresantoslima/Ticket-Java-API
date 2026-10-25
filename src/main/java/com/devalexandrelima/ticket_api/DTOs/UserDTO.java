package com.devalexandrelima.ticket_api.DTOs;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class UserDTO {

    private String user;
    private String email;
    private String fullname;
    private String password;
}
