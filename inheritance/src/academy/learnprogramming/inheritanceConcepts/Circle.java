package academy.learnprogramming.inheritanceConcepts;

public class Circle {
    private double radius;
    //private static final PI = Math.PI;
    public Circle(double radius) {
        if (radius < 0)
        {
            this.radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
