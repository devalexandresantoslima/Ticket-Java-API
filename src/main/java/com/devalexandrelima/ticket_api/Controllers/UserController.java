package com.devalexandrelima.ticket_api.Controllers;

import com.devalexandrelima.ticket_api.DTOs.UserDTO;
import com.devalexandrelima.ticket_api.Entitys.User;
import com.devalexandrelima.ticket_api.Services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public User getUserById(@RequestBody Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public User updateUser(@RequestBody Integer id, UserDTO userDTO) {
        return userService.updateUser(id, userDTO);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@RequestBody Integer id) {
        return;
    }
}
