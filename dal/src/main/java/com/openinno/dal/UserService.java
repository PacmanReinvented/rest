package com.openinno.dal;

import com.openinno.dal.UserRepository;
import com.openinno.domain.interfaces.CRUD;
import com.openinno.domain.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService implements CRUD<User,Long> {

    @Qualifier("UserRepository")
    @Autowired
    private UserRepository repository;

    @Override
    public User create(User entity) {
        return repository.save(entity);
    }

    @Override
    public User read(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Iterable<User> readAll() {
        return repository.findAll();
    }

    @Override
    public User update(User entity) {
        return repository.save(entity);
    }

    @Override
    public boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}