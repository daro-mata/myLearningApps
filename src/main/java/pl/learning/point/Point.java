package pl.learning.point;

public class Point {

    public static void main(String[] args) {
        Point point1 = new Point(6,5);
        Point point2 = new Point(4,2);
        Point point3 = new Point(3,6);
        System.out.println("distance(0,0) = " +  point1.distance());
        System.out.println("distance(PointToPoint2) = " +  point1.distance(point2));
        System.out.println("distance(PointToPoint3) = " +  point1.distance(point3));
        System.out.println("distance(2,2) = " + point1.distance(2,2));

        Point another = new Point();
        System.out.println("distance() = " + point1.distance());

    }

    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX (int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public double distance(){
        return Math.sqrt((-this.x)*(-this.x)+(-this.y)*(-this.y));
    }

    public double distance(Point another){
        return Math.sqrt((this.x- another.x)*(this.x- another.x)+(this.y- another.y)*(this.y- another.y));
    }

    public double distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }

}
