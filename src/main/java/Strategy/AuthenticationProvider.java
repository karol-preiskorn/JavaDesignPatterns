package Strategy;

public interface AuthenticationProvider {
    void login(String username, String password);
    void logout();
}
