package Strategy;

public class LinkedInAuthenticator implements AuthenticationProvider {
    @Override
    public void login(String username, String password) {
        System.out.println("Authenticating with linkedIn...");
    }

    @Override
    public void logout() {
        System.out.println("Logging out with linkedIn...");
    }
}
