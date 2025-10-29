package io.github.henriqueaguiiar.springBoot_project.domain.repository;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.Category;
import io.github.henriqueaguiiar.springBoot_project.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
