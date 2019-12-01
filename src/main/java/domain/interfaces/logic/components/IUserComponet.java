package domain.interfaces.logic.components;

import domain.interfaces.ICRUD;
import domain.models.User;

public interface IUserComponet extends ICRUD<User,Long> {
    User login(String email, String password);

}