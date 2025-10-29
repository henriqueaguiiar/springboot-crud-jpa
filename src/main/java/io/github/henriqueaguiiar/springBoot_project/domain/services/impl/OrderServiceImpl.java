package io.github.henriqueaguiiar.springBoot_project.domain.services.impl;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.Order;
import io.github.henriqueaguiiar.springBoot_project.domain.entities.User;
import io.github.henriqueaguiiar.springBoot_project.domain.repository.OrderRepository;
import io.github.henriqueaguiiar.springBoot_project.domain.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
