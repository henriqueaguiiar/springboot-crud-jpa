package io.github.henriqueaguiiar.springBoot_project.domain.services.impl;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.Category;
import io.github.henriqueaguiiar.springBoot_project.domain.entities.Product;
import io.github.henriqueaguiiar.springBoot_project.domain.repository.CategoryRepository;
import io.github.henriqueaguiiar.springBoot_project.domain.repository.ProductRepository;
import io.github.henriqueaguiiar.springBoot_project.domain.services.CategoryService;
import io.github.henriqueaguiiar.springBoot_project.domain.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){

        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
