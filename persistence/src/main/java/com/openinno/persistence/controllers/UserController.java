package com.openinno.persistence.controllers;

import com.openinno.domain.interfaces.RESTCRUD;
import com.openinno.domain.models.User;
import com.openinno.logic.handlers.UserHandler;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200","*"})
@RestController
@RequestMapping("/users")
public class UserController implements RESTCRUD<User,Long> {

    @Setter
    private UserHandler handler;

    public UserController() {
    }

    @Autowired
    public UserController(UserHandler handler) {
        this.handler = handler;
    }

    @Override
    public ResponseEntity create(User entity) {
        return new ResponseEntity<>(handler.create(entity), HttpStatus.valueOf(200));
    }

    @Override
    public ResponseEntity read(Long id) {
        return new ResponseEntity<>(handler.read(id), HttpStatus.valueOf(200));
    }

    @Override
    public ResponseEntity readAll() {
        return new ResponseEntity<>(handler.readAll(), HttpStatus.valueOf(200));
    }

    @Override
    public ResponseEntity update(User entity) {
        return new ResponseEntity<>(handler.update(entity), HttpStatus.valueOf(200));
    }

    @Override
    public ResponseEntity delete(Long id) {
        return new ResponseEntity<>(handler.delete(id), HttpStatus.valueOf(200));
    }
}
