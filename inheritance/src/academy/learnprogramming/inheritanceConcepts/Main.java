package academy.learnprogramming.inheritanceConcepts;

public class Main {

    public static void main(String[] args) {
	// Calculate Cylinder Area
        Circle circle = new Circle(3.75);
        System.out.println("Circle Radius is:" +circle.getRadius());
        System.out.println("circle area is:" + circle.getArea());
        Cylinder cylinder = new Cylinder(10,2);
        System.out.println("======================================================");
        System.out.println("Cylinder radius is:"+cylinder.getRadius());
        System.out.println("Cylinder area is:"+cylinder.getArea());
        System.out.println("Cylinder volume is:" + cylinder.getVolume());

        System.out.println("======================================================");
        Rectangle ractangle = new Rectangle(5,2);
        System.out.println("Rectangle width is :" +ractangle.getWidth());
        System.out.println("Rectangle length is :" +ractangle.getLength());
        System.out.println("Rectangle area is :" +ractangle.getArea());
        System.out.println("======================================================");
        Cuboid cuboid = new Cuboid(10,20,30);
        System.out.println("Cuboid width is :" +cuboid.getWidth());
        System.out.println("Cuboid length is :" +cuboid.getLength());
        System.out.println("Cuboid height is :" +cuboid.getHeight());
        System.out.println("Cuboid volume is :" +cuboid.getVolume());

        System.out.println("=====================House with composition of lamp,wall and bed=========================");

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("modern",2,120,4,1);
        Lamp lamp = new Lamp("classic",false,45);
        Bedroom bedroom = new Bedroom("Tims",wall1,wall2,wall3,wall4,bed,lamp);
        bedroom.makeBed();
        lamp.turnOn();
        bed.make();


    }
}
