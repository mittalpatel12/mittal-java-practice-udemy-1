package academy.learnprogramming.classses;

public class Calculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber()
    {
        return this.firstNumber;
    }

    public double getSecondNumber()
    {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getSubstraction() {
     return this.firstNumber - this.secondNumber;
    }



    public double getAddition() {
        return this.firstNumber + this.secondNumber;
    }
}

