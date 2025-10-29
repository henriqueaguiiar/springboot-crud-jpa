package io.github.henriqueaguiiar.springBoot_project.domain.services;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.Order;
import io.github.henriqueaguiiar.springBoot_project.domain.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<Order> findAll();

    Order findById(Long id);

}
