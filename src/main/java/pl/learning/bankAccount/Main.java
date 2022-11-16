package pl.learning.bankAccount;

public class Main {
    public static void main(String[] args) {
        Account daro = new Account("12312312312", 25239, "Daro", "daro@gmail.com", "123 456 789");

        VipCustomer vip1 = new VipCustomer("Pablo", 141412);
        VipCustomer vip2 = new VipCustomer();
        VipCustomer vip3 = new VipCustomer("Michael", 12412, "Michael@gmail.com");

        System.out.println(vip1.getName() + " has " + vip1.getCreditLimit() + " credit limit.");
        System.out.println(vip2.getName());
        System.out.println(vip3.getEmailAddress());

        System.out.println(daro.getName());
        System.out.println(daro.getNumber());
        System.out.println(daro.getBalance());
        System.out.println(daro.getEmail());
        System.out.println(daro.getPhoneNumber());

        daro.withdrawFunds(3574);
        daro.depositFunds(912);

    }
}
