package academy.learnprogramming;

public class AreaCalculator {


    public static final double PI = 3.14;

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        }
        double area1 = PI * radius * radius;
        return area1;
    }

    public static void main(String[] args) {
        double area = area(15);
        System.out.println(area);

        double areaOfRectangle = area(10, 10);
        System.out.println(areaOfRectangle);
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return  -1.0;
        }
        double area1 = x * y;
        return area1;
    }
}