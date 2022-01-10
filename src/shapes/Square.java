package shapes;

public class Square extends Quadrilateral {

    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }



    public double getArea() {
//        System.out.println("hello");
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
//        System.out.println("hello");
        return 4 * side;
    }

    public Square() {
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}
