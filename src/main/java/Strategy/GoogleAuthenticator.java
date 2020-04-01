package Strategy;

public class GoogleAuthenticator implements AuthenticationProvider {
    @Override
    public void login(String username, String password) {
        System.out.println("Authenticating with google...");
    }

    @Override
    public void logout() {
        System.out.println("Logging out with google...");
    }
}