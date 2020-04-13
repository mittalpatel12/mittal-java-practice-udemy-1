package academy.learnprogramming.classses;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator c1 = new Calculator();
        c1.setFirstNumber(10);
        c1.setSecondNumber(5);
        System.out.println("First number is:" + c1.getFirstNumber());
        System.out.println("Second Number is : " + c1.getSecondNumber());
        double sum = c1.getAddition();
        System.out.println("sum is: " + sum);
        double substraction = c1.getSubstraction();
        System.out.println("Substraction is: " + substraction);


        //calling person class methods
        Person p1= new Person();
        p1.setFirstName("");
        p1.setLastName("");
        p1.setAge(13);
        System.out.println(p1.getFirstName());

        System.out.println(p1.getLastName());
        System.out.println(p1.getAge());
        System.out.println("Teen age is :" + p1.isTeen());
        System.out.println("Full name is:" + p1.getFullName());

        System.out.println("===================================");

        Floor floor = new Floor(10, 15);
        Carpet carpet = new Carpet(10);

        CarpetCalculator carpetCalculator = new CarpetCalculator(floor, carpet);
        System.out.println("Total cost: " + carpetCalculator.getTotalCost());


        System.out.println("========================================");

        ComplexNumber complexNumber = new ComplexNumber(5, 7);
        System.out.println(complexNumber);

        complexNumber.add(2, 1);
        System.out.println(complexNumber);

        ComplexNumber c2 = new ComplexNumber(3,2);
        System.out.println(c2);

        ComplexNumber c3 = new ComplexNumber(1,1);
        System.out.println(c3);

        c2.add(c2);
        System.out.println(c2);

        c2.substract(c2);
        System.out.println(c2);

        c2.substract(c3);
        System.out.println(c3);


    }
}
