package Exceptions;

import Exceptions.e.ExceptionsMessages;
import Exceptions.e.UserAlreadyExistsException;
import Exceptions.e.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private List<User> registeredUsers = new ArrayList<>();

    public void register(User user) {
        boolean exists = registeredUsers.stream()
                .anyMatch(registeredUsers -> registeredUsers.getEmail().equalsIgnoreCase(user.getEmail()));

        if (exists) {
            throw new UserAlreadyExistsException(ExceptionsMessages.USER_ALREADY_EXISTS);
        }


        registeredUsers.add(user);
        System.out.println("Kayıt başarılı!\n" + "Email: " + user.getEmail() + "\n");
    }

    public void getAllUsers() {
        registeredUsers.forEach(System.out::println);
    }

    public void login(String email, String password) {
        User foundUser = registeredUsers.stream().filter(user -> user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(ExceptionsMessages.USER_NOT_FOUND));

        System.out.println("Giriş başarılı!\n" + "Email: " + foundUser.getEmail() + "\n");
    }

}
