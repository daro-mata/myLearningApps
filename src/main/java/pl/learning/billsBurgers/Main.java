package pl.learning.billsBurgers;

public class Main {
    public static void main(String[] args) {
        Hamburger order1 = new Hamburger("white", 2, 1, 2, 2, 2);
        HealthyBurger order2 = new HealthyBurger(2, 1, 1, 1, 0, 1, true);
        DeluxeHamburger order3 = new DeluxeHamburger("glutenfree", 2);

        order1.order();
        order1.pay();
        System.out.println("");

        order2.order();
        order2.pay();
        System.out.println("");

        order3.order();
        order3.pay();
        System.out.println("");

        System.out.println("The bill for all orders is " + (order1.price() + order2.price() + order3.price()) + "$.");
    }
}
