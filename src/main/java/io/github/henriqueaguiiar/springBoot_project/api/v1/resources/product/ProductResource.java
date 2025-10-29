package io.github.henriqueaguiiar.springBoot_project.api.v1.resources.product;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.Product;
import io.github.henriqueaguiiar.springBoot_project.domain.entities.User;
import io.github.henriqueaguiiar.springBoot_project.domain.services.UserService;
import io.github.henriqueaguiiar.springBoot_project.domain.services.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/products")
public class ProductResource {

    private final ProductServiceImpl productService;

    @Autowired
    public ProductResource(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> productList = productService.findAll();
        return ResponseEntity.ok().body(productList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product product = productService.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
