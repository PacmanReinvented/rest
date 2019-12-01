package domain.interfaces.rest.controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import domain.interfaces.rest.IRestCRUD;
import domain.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface IUserController extends IRestCRUD<User, Long> {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    ResponseEntity login(ObjectNode node);
}