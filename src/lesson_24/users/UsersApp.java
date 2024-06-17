package lesson_24.users;
/*
@date 17.06.2024
@author Sergey Bugaienko
*/

public class UsersApp {
    public static void main(String[] args) {
        User admin = new User("admin@mail.com", "1234");
        admin.setRole(Role.ADMIN);


        User user = new User("user@mail.com", "12345");

        System.out.println(user);

        UsersUtil.setModerAccess(user, user);
        System.out.println(user);

        UsersUtil.setModerAccess(user, admin);
        System.out.println(user);

        UsersUtil.setUsualAccess(user, admin);
        System.out.println(user);


    }
}
