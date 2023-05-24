interface Account {
    void set(String accountNumber, double balance);
    void display();
}

interface Person {
    void store(String name);
    void disp();
}

class Customer implements Account, Person {
    private String name;
    private String accountNumber;
    private double balance;
    private double interestRate = 0.05; // Assuming an interest rate of 5%

    @Override
    public void set(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + (balance * interestRate));
    }

    @Override
    public void store(String name) {
        this.name = name;
    }

    @Override
    public void disp() {
        System.out.println("Name: " + name);
    }
}

public class Prob19 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.store("John Doe");
        customer.set("123456789", 5000);
        customer.disp();
        customer.display();

        customer.store("Hetan");
        customer.set("932874932074", 9000);
        customer.disp();
        customer.display();
    }
}
