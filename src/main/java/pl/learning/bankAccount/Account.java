package pl.learning.bankAccount;

public class Account {

    public Account(String number, double balance, String name, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Account daro = new Account("12312312312", 25239, "Daro", "daro@gmail.com", "123 456 789");

        System.out.println(daro.getName());
        System.out.println(daro.getNumber());
        System.out.println(daro.getBalance());
        System.out.println(daro.getEmail());
        System.out.println(daro.getPhoneNumber());

        daro.withdrawFunds(3574);
        daro.depositFunds(912);

    }

    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;


    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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
