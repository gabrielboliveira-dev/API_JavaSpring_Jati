package curso.api.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.api.teste.entity.UserEntity;
import curso.api.teste.service.UserService; 

@RestController
@RequestMapping ("/User")

public class UserController {
@Autowired

    private UserService userService;
@PostMapping

    public ResponseEntity<UserEntity>salvarUser(@RequestBody UserEntity userEntity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.cadastrarUser(userEntity));
    }
    
}
