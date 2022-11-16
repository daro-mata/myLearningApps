package pl.learning.billsBurgers;

public class DeluxeHamburger extends Hamburger {
    private boolean chipsAndDrinks;

    public DeluxeHamburger(String breadRoll, int meat) {
        super(breadRoll, meat, 0, 0, 0, 0);
        this.chipsAndDrinks = true;
    }

    public boolean isChipsAndDrinks() {
        return chipsAndDrinks;
    }

    @Override
    public int price() {
        int price = 0;
        price += super.price();

        //additional additions
        if (isChipsAndDrinks()) {
            price += 12;
        }
        return price;
    }

    @Override
    public void order() {
        super.order();
        if (isChipsAndDrinks()) {
            System.out.println("- chips and drinks.");
        }
    }

    @Override
    public void pay() {
        super.pay();
    }
}
