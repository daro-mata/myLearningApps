package pl.learning.wallArea;

public class Wall {

    private double width;
    private double height;
    public Wall() {
    }

    public Wall(double width, double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

    }

    public static void main(String[] args) {

        Wall wall = new Wall(5, -1);
        System.out.println("Area = " + wall.getArea());

        wall.setHeight(3);
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Area: " + wall.getArea());

        wall.setWidth(-2);
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Area: " + wall.getArea());

        Wall wall2 = new Wall();

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.height * this.width;
    }


}
