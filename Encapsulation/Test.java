cclass BankAccount {
    private double balance;

    // setter with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance!");
        }
    }

    // getter
    public double getBalance() {
        return balance;
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());

        acc.setBalance(-100);   // invalid
    }
}