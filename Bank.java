class BankAccount {
    double balance = 1000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", Remaining Balance: " + balance);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
    
        BankAccount user1 = new BankAccount();
        System.out.println("User 1 transactions:");
        user1.deposit(500);
        user1.withdraw(20000);

        BankAccount user2 = new BankAccount();
        System.out.println("\nUser 2 transactions:");
        user2.deposit(100);
        user2.withdraw(2500); 

        BankAccount user3 = new BankAccount();
        System.out.println("\nUser 3 transactions:");
        user3.deposit(1200);
        user3.withdraw(600);
    }
}