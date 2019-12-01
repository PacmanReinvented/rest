package logic.handlers;

import domain.interfaces.logic.components.IUserComponet;
import domain.interfaces.logic.handlers.IUserHandler;
import domain.models.User;
import logic.components.UserComponent;
import persistence.services.UserServices;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserHandler implements IUserHandler {

    @Setter
    private IUserComponet component;

    @Setter
    private UserServices service;

    public UserHandler() {
    }

    @Autowired
    public UserHandler(UserComponent component, UserServices service) {
        this.component = component;
        this.service = service;
    }

    @Override
    public User login(String email, String password) {
        return component.login(email,password);
    }

    @Override
    public User create(User entity) {
        return component.create(entity);
    }

    @Override
    public User read(Long id) {
        return service.read(id);
    }

    @Override
    public List<User> readAll() {
        Iterable<User> users = service.readAll();
        List<User> userList = new ArrayList<>();

        users.iterator().forEachRemaining(userList::add);
        return userList;
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