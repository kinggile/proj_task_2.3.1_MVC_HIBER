package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void save(User user);

    User getOneUser(int id);

    void updateUser(int id, User updatedUser);

    void deleteUser(int id);

}
