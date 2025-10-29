package io.github.henriqueaguiiar.springBoot_project.domain.repository;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
