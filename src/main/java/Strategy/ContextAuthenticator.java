package Strategy;

public class ContextAuthenticator {

    private AuthenticationProvider strategy;

    ContextAuthenticator(AuthenticationProvider strategy) {
        this.strategy = strategy;
    }

    public void login(String username, String password) {
        strategy.login(username, password);
    }

    public void logout() {
        strategy.logout();
    }

    public static void main(String[] args) {
        //sign in with facebook
        ContextAuthenticator context = new ContextAuthenticator(new FacebookAuthenticator());
        context.login("james@gml.com", "S*s23Sd");
        context.logout();    //sign in with google
        context = new ContextAuthenticator(new FacebookAuthenticator());
        context.login("jack@gml.com", "Jkjs23*kw");
        context.logout();    //sign in with linkedIn
        context = new ContextAuthenticator(new LinkedInAuthenticator());
        context.login("dave@gml.com", "Ijks9&js@3");
        context.logout();
    }
}

