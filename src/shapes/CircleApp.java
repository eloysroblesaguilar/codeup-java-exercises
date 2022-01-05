package shapes;

import util.Input;

public class CircleApp {


    public static void circleCreator () {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble("Please enter in the radius for the circle"));
        circle.getArea();
        circle.getCircumference();
        if (input.yesNo("Would you like to create another circle?")) {
            circleCreator();
        }
    }

    public static void main(String[] args) {
        circleCreator();
    }
}
