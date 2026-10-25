package com.devalexandrelima.ticket_api.Services;

import com.devalexandrelima.ticket_api.DTOs.UserDTO;
import com.devalexandrelima.ticket_api.Entitys.User;
import com.devalexandrelima.ticket_api.Repositorys.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("O usuario nao encontrado" + id));
    }

    public String createUser(UserDTO userDTO){
        User user = new User();

        user.setEmail(userDTO.getEmail());
        user.setFullname(userDTO.getFullname());
        user.setPassword(userDTO.getPassword());
        userRepository.save(user);

        return "Usuario criado com sucesso";
    }

    public User updateUser(Integer id, UserDTO userDTO){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario nao encontrado" + id));

        user.setEmail(userDTO.getEmail());
        user.setFullname(userDTO.getFullname());
        user.setPassword(userDTO.getPassword());

        return userRepository.save(user);
    }

    public String deleteUserById(Integer id) {
        userRepository.deleteById(id);

        return "Usuario deletado com Sucesso";
    }
}
