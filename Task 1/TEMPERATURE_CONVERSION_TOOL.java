import java.util.Scanner;
public class TEMPERATURE_CONVERSION_TOOL {
    public static double CelsiusToFahrenheit(double degree) {
        //(0°C × 9/5) + 32 = 32°F
        // 9/5 = 1.8
        double newDegree = (degree * 1.8) + 32;
        return newDegree;
    }
    public static double FahrenheitToCelsius(double degree){
        //(0°F − 32) × 5/9
        // 5/9 = 0.5555555555555556
        double newDegree = (degree - 32) * (0.5555555555555556);
        return newDegree;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t\t\tTEMPERATURE CONVERSION TOOL");
        System.out.println("1. from Fahrenheit to Celsius");
        System.out.println("2. from Celsius to Fahrenheit");
        System.out.print("\nEnter Your Choice: ");
        int choice = input.nextInt();
        System.out.print("Enter The Degree: ");
        double degree = input.nextDouble();
        double newDegree;
        switch (choice){
            case 1:
                newDegree = FahrenheitToCelsius(degree);
                System.out.println(newDegree);
                break;
            case 2:
                newDegree = CelsiusToFahrenheit(degree);
                System.out.println(newDegree);
                break;
            default:
                System.out.println("ERROR: Wrong Choice...");
                break;
        }

    }
}