package io.github.henriqueaguiiar.springBoot_project.domain.services;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.Category;
import io.github.henriqueaguiiar.springBoot_project.domain.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);

}
