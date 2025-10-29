package io.github.henriqueaguiiar.springBoot_project.domain.services;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.Category;


import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(Long id);

}
