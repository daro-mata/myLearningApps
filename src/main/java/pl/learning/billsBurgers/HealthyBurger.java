package pl.learning.billsBurgers;

public class HealthyBurger extends Hamburger {
    private int cheese;
    private boolean barbecueSos;

    public HealthyBurger(int meat, int lettuce, int tomato, int pickles, int onion, int cheese, boolean barbecueSos) {
        super("brown", meat, lettuce, tomato, pickles, onion);
        this.barbecueSos = barbecueSos;
        this.cheese = cheese;
    }

    @Override
    public int price() {
        int price = 0;
        price += super.price();

        //additional additions
        price += this.cheese * 2;
        if(isBarbecueSos()){
            price += 1;
        }
        return price;
    }

    @Override
    public void order() {
        super.order();
        if (this.cheese > 1) {
            System.out.println("- " + this.cheese + " slice of cheese.");
        }
        if (isBarbecueSos()) {
            System.out.println("- barbecue sos.");
        }
    }

    @Override
    public void pay() {
        super.pay();
    }

    public int getCheese() {
        return cheese;
    }

    public boolean isBarbecueSos() {
        return barbecueSos;
    }
}
