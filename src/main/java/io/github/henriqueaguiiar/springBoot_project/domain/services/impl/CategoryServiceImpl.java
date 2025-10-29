package io.github.henriqueaguiiar.springBoot_project.domain.services.impl;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.Category;
import io.github.henriqueaguiiar.springBoot_project.domain.entities.User;
import io.github.henriqueaguiiar.springBoot_project.domain.repository.CategoryRepository;
import io.github.henriqueaguiiar.springBoot_project.domain.repository.UserRepository;
import io.github.henriqueaguiiar.springBoot_project.domain.services.CategoryService;
import io.github.henriqueaguiiar.springBoot_project.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
