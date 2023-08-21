package CALCULTOR;

import CALCULTOR.ICalculator;

public class Calculator implements ICalculator {
    @Override
    public int add(int firstNumber, int secondNumber) {
        System.out.print(firstNumber + " + " + secondNumber + " = ");
        return firstNumber + secondNumber;
    }
    @Override
    public int subtract(int firstNumber, int secondNumber) {
        System.out.print(firstNumber + " - " + secondNumber + " = ");
        return firstNumber - secondNumber;
    }

    @Override
    public int multiply(int firstNumber, int secondNumber) {
        System.out.print(firstNumber + " * " + secondNumber + " = ");
        return firstNumber * secondNumber;
    }
    @Override
    public double divide(double firstNumber, double secondNumber) {
        System.out.print((int)firstNumber + " / " + (int)secondNumber + " = ");
        return firstNumber / secondNumber;
    }
}
