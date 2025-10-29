package io.github.henriqueaguiiar.springBoot_project.domain.services;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAll();

    User findById(Long id);

}
