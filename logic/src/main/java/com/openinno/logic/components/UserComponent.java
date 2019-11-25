package com.openinno.logic.components;

import com.openinno.dal.UserService;
import com.openinno.domain.interfaces.CRUD;
import com.openinno.domain.models.User;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserComponent implements CRUD<User,Long> {

    @Setter
    private UserService userService;

    public UserComponent() {
    }

    @Autowired
    public UserComponent(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User create(User entity) {
        return userService.create(entity);
    }

    @Override
    public User read(Long id) {
        return userService.read(id);
    }

    @Override
    public Iterable<User> readAll() {
        return userService.readAll();
    }

    @Override
    public User update(User entity) {
        return userService.update(entity);
    }

    @Override
    public boolean delete(Long id) {
        return userService.delete(id);
    }
}
