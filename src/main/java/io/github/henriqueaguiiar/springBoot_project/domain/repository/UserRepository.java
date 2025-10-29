package io.github.henriqueaguiiar.springBoot_project.domain.repository;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
