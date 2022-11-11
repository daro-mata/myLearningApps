package pl.learning.printer;

public class Printer {

    public static void main(String[] args) {
        Printer printer = new Printer(29, false);

        printer.printerInfo();
        printer.printingPage(112);
        System.out.println("");
        printer.printerInfo();
        printer.printingPage(123);
        printer.printerInfo();
        System.out.println("");
        printer.fillUpToner();
        printer.printerInfo();
    }

    private double tonerLevel;
    private int printedPages;
    private boolean duplexPrinter;

    public Printer(double tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.printedPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void fillUpToner() {
        this.tonerLevel = 100;
        System.out.println("You filled up toner.");
    }

    public void printingPage(int pages) {
        if (isDuplexPrinter()) {
            if ((this.tonerLevel - (pages * 0.1)) < 0) {
                System.out.println("You cannot print " + pages + " pages, You do not have enough toner.");
            } else {
                System.out.println("Printer printed in duplex.");
                this.printedPages += (pages / 2 + pages % 2);
                this.tonerLevel = this.tonerLevel - (2 * pages * 0.1);
                System.out.println("Printer printed " + pages + " pages.");
                System.out.println("Toner level is: " + this.tonerLevel + "%.");
            }
        } else {
            if ((this.tonerLevel - (pages * 0.1)) < 0) {
                System.out.println("You cannot print " + pages + " pages, You do not have enough toner.");
            } else {
                this.printedPages += pages;
                this.tonerLevel = this.tonerLevel - (pages * 0.1);
                System.out.println("Printer printed " + pages + " pages.");
                System.out.println("Toner level is: " + this.tonerLevel + "%.");
            }
        }
    }

    public void printerInfo() {
        System.out.println("|||---TONER INFO---|||");
        System.out.println("Toner level: " + getTonerLevel() + "%.");
        System.out.println("Printed pages: " + getPrintedPages() + ".");
        if (isDuplexPrinter()) {
            System.out.println("Duplex printer: YES");
        } else {
            System.out.println("Duplex printer: NO");
        }
        System.out.println("|||________________|||");
    }
}
