package pl.learning.bankAccount;

public class Account {

    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account(String number, double balance, String name, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("You deposited " + deposit + ". Your balance is: " + this.balance);
    }

    public void withdrawFunds(double withdraw) {
        if (this.balance - withdraw < 0) {
            System.out.println("You can't withdraw " + withdraw + ". Your account balance is: " + this.balance);
        } else {
            this.balance = this.balance - withdraw;
            System.out.println("You withdrawn: " + withdraw + ". Your account balance is: " + this.balance);
        }
    }
}
