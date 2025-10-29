package io.github.henriqueaguiiar.springBoot_project.domain.repository;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
