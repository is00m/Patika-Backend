package Exceptions;

public class UserAuthMain {
    public static void main(String[] args) {
        AuthService authService = new AuthService();

        authService.register(new User("ismklc@test.com", "753423"));
        authService.register(new User("ismklc1@test.com", "985677"));
        authService.register(new User("ismklc2@test.com", "32413"));

        authService.login("ismklc@test.com", "753423");

        authService.getAllUsers();
    }
}
