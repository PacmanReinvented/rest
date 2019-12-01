package logic.components;

import domain.interfaces.logic.components.IUserComponet;
import domain.models.User;
import persistence.services.UserServices;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserComponent implements IUserComponet {

    @Setter
    private UserServices service;

    public UserComponent() {
    }

    @Autowired
    public UserComponent(UserServices service) {
        this.service = service;
    }


    @Override
    public User login(String email, String password) {
        return service.login(email,password);
    }

    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public User read(Long id) {
        return null;
    }

    @Override
    public Iterable<User> readAll() {
        return null;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}