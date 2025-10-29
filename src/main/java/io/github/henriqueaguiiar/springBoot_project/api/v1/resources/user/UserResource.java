package io.github.henriqueaguiiar.springBoot_project.api.v1.resources.user;


import io.github.henriqueaguiiar.springBoot_project.domain.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Henrique Aguiiar", "henrique@email.com", "99999-9999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
