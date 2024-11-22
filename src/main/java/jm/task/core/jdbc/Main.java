package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Magomed", "Gagiev", (byte) 25);
        userService.saveUser("Vladimir", "Putin", (byte) 69);
        userService.saveUser("Elon", "Musk", (byte) 44);
        userService.saveUser("Michael", "Shumakher", (byte) 55);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
