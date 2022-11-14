package pl.learning.billsBurgers;

import java.util.Locale;
import java.util.Objects;

class Hamburger {

    private String breadRoll;
    private int meat;
    private int lettuce;
    private int tomato;
    private int pickles;
    private int onion;

    public Hamburger(String breadRoll, int meat, int lettuce, int tomato, int pickles, int onion) {
        this.breadRoll = breadRoll.toLowerCase(Locale.ROOT);
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickles = pickles;
        this.onion = onion;
    }

    public int price() {
        int price = 0;

        // bread roll price:
        if (Objects.equals(this.breadRoll, "white")) {
            price += 2;
        } else if (Objects.equals(this.breadRoll, "brown")) {
            price += 4;
        } else if (Objects.equals(this.breadRoll, "glutenfree")) {
            price += 5;
        }

        // meat
        price += this.meat * 5;

        //additional additions
        price += this.lettuce * 1;
        price += this.tomato * 1;
        price += this.onion * 1;
        price += this.pickles * 1;

        return price;
    }

    public void order() {
        System.out.println("You ordered " + getClass().getSimpleName() + " with: ");
        System.out.println("- " + this.breadRoll + " bread roll.");
        if (this.meat > 1) {
            System.out.println("- " + this.meat + " meats.");
        } else {
            System.out.println("- " + this.meat + " meat.");
        }
        if (this.lettuce > 1) {
            System.out.println("- " + this.lettuce + " lettuces.");
        } else if (this.lettuce == 1) {
            System.out.println("- " + this.lettuce + " lettuce.");
        }
        if (this.tomato > 1) {
            System.out.println("- " + this.tomato + " tomatoes.");
        } else if (this.tomato == 1) {
            System.out.println("- " + this.tomato + " tomato.");
        }
        if (this.pickles > 1) {
            System.out.println("- " + this.pickles + " pickles.");
        }
        if (this.onion > 1) {
            System.out.println("- " + this.onion + " onions.");
        } else if (this.onion == 1) {
            System.out.println("- " + this.onion + " onion.");
        }
    }

    public void pay(){
        System.out.println("Your order cost " + price() + "$.");
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public int getMeat() {
        return meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getPickles() {
        return pickles;
    }

    public int getOnion() {
        return onion;
    }
}
