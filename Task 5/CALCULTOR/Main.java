package CALCULTOR;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result;
        double res;
        result = calc.add(6, 4);
        System.out.println(result);
        result = calc.subtract(6, 4);
        System.out.println(result);
        result = calc.multiply(6, 4);
        System.out.println(result);
        res = calc.divide(6, 4);
        System.out.println(res);
    }
}