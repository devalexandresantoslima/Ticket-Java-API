package com.devalexandrelima.ticket_api.Repositorys;

import com.devalexandrelima.ticket_api.Entitys.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
