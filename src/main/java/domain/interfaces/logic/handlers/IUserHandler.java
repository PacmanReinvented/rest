package domain.interfaces.logic.handlers;

import domain.interfaces.logic.IHandlerCRUD;
import domain.models.User;

public interface IUserHandler extends IHandlerCRUD<User,Long> {
    User login(String email, String password);
}