package academy.learnprogramming.classses;

public class CarpetCalculator {

    private Floor floor;
    private Carpet carpet;

    public CarpetCalculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double calculatedArea = floor.getArea() * carpet.getCost();
        return calculatedArea;
    }

    public static void main(String[] args) {

        Floor floor = new Floor(10, 15);
        Carpet carpet = new Carpet(10);

        Floor floor1 = new Floor(20, 30);
        Carpet carpet1 = new Carpet(20);

        CarpetCalculator carpetCalculator = new CarpetCalculator(floor, carpet);
        CarpetCalculator carpetCalculator1 = new CarpetCalculator(floor1, carpet1);
        System.out.println("Total cost: " + carpetCalculator.getTotalCost());
        System.out.println("Total cost: " + carpetCalculator1.getTotalCost());
    }
}
