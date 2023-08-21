import java.util.*;

public class CURRENCY_CONVERTER {
    public static void main(String[] args) {
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.92);
        exchangeRates.put("JPY", 146.19);
        exchangeRates.put("GBP", 0.78);
        exchangeRates.put("AUD", 1.56);
        exchangeRates.put("CAD", 1.35);
        exchangeRates.put("CHF", 0.88);
        exchangeRates.put("CNY", 7.21);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to CURRENCY CONVERTER!");

        System.out.print("Enter source currency: ");
        String source = scanner.nextLine().toUpperCase();

        System.out.print("Enter target currency: ");
        String target = scanner.nextLine().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        if (exchangeRates.containsKey(source) && exchangeRates.containsKey(target)) {
            double convertedAmount = 0;
            if(source != "USD") {
                // to convert from source currency to USD
                convertedAmount = amount / exchangeRates.get(source);
                // to convert from USD to target currency
                if (target != "USD"){
                    convertedAmount *= exchangeRates.get(target);
                }
            } else {
                // to convert from USD to target currency
                convertedAmount = amount * exchangeRates.get(target);
            }
            System.out.println("Converted amount: " + convertedAmount + " " + target);
        } else {
            System.out.println("Invalid currency entered.");
        }

        scanner.close();
    }
}