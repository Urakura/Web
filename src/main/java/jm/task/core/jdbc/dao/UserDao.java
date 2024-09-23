package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;
public interface UserDao {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(final String name, final String lastName, final byte age);

    void removeUserById(final long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}

