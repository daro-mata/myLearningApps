package pl.learning.diagonalStar;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(2);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int row = number;
            int rowCount = number;
            while (row > 0) {
                int column = number;
                while (column > 0) {
                    if (row == number) {
                        System.out.print("*");
                    } else if (column == (rowCount - row + 1)) {
                        System.out.print("*");
                    } else if (column == 1) {
                        System.out.print("*");
                    } else if (column == number) {
                        System.out.print("*");
                    } else if (row == column) {
                        System.out.print("*");
                    } else if (row == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    column--;
                }
                System.out.println("");
                row--;
            }
        }
    }
}
