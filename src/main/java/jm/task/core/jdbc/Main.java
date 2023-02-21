package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Bob","Marley",(byte)30);
        userService.saveUser("Job","Travolta",(byte)55);
        userService.saveUser("Well","Kz",(byte)24);
        userService.saveUser("Edward","Snowden",(byte)35);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
