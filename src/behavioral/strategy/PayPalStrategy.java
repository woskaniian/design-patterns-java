package behavioral.strategy;

public class PayPalStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PayPalStrategy(String email, String pwd) {
        this.email = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        this.checkCredentials(this.email, this.password);
        System.out.println(amount + " paid using PayPal.");
    }

    private void checkCredentials(String email, String password) {
        if (!(email.equals("john@example.com") && password.equals("Admin@123"))) {
            throw new RuntimeException("Unauthenticated user");
        }
    }
}
