package academy.learnprogramming.inheritanceConcepts;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius,double height)
    {
        super(10);

        if (height < 0) {
            this.height = 0;
        }

        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    public double getVolume() {
        return getArea() * height;
    }
}
