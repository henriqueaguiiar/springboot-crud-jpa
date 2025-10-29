package io.github.henriqueaguiiar.springBoot_project.domain.repository;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.OrderItem;
import io.github.henriqueaguiiar.springBoot_project.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
