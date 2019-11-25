package com.openinno.logic.handlers;

import com.openinno.dal.UserService;
import com.openinno.domain.interfaces.CRUD;
import com.openinno.domain.models.User;
import com.openinno.logic.components.UserComponent;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserHandler implements CRUD<User,Long> {
    @Setter
    private UserComponent component;

    @Setter
    private UserService service;

    public UserHandler() {
    }

    @Autowired
    public UserHandler(UserComponent component, UserService service) {
        this.component = component;
        this.service = service;
    }

    @Override
    public User create(User entity) {
        return service.create(entity);
    }

    @Override
    public User read(Long id) {
        return service.read(id);
    }

    @Override
    public Iterable<User> readAll() {
        return service.readAll();
    }

    @Override
    public User update(User entity) {
        return service.update(entity);
    }

    @Override
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
