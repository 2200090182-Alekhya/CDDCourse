package endsemlab;

public class BankingApp {
    public static void main(String[] args) {
        UserLoginManager loginManager = UserLoginManager.getInstance();
        loginManager.login();

        if (loginManager.isUserLoggedIn()) {
            System.out.println("View Balance: $1000");
            System.out.println("Deposit: $200");
            System.out.println("Withdraw: $300");
        } else {
            System.out.println("User is not logged in. Please log in to perform banking operations.");
        }
        
        loginManager.logout();
    }
}

class UserLoginManager {
    private static UserLoginManager instance;
    private boolean userLoggedIn;
    private UserLoginManager() {
        userLoggedIn = false;
    }

    public static UserLoginManager getInstance() {
        if (instance == null) {
            instance = new UserLoginManager();
        }
        return instance;
    }

    public void login() {
        userLoggedIn = true;
        System.out.println("User logged in successfully.");
    }

    public void logout() {
        userLoggedIn = false;
        System.out.println("User logged out.");
    }

    public boolean isUserLoggedIn() {
        return userLoggedIn;
    }
}



