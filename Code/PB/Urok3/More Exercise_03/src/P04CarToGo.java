import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double carPrice = 0;
        String carType = " ";

        if (budget <= 100) {
            System.out.println("Economy class");

            if (season.equals("Summer")) {
                carPrice = budget * 0.35;
                carType = "Cabrio";

            } else if (season.equals("Winter")) {
                carPrice = budget * 0.65;
                carType = "Jeep";

            }

        } else if (budget <= 500) {
            System.out.println("Compact class");

            if (season.equals("Summer")) {
                carPrice = budget * 0.45;
                carType = "Cabrio";

            } else if (season.equals("Winter")) {
                carPrice = budget * 0.80;
                carType = "Jeep";

            }

        } else {
            System.out.println("Luxury class");

            if (season.equals("Summer") || season.equals("Winter")) {
                carPrice = budget * 0.90;
                carType = "Jeep";

            }
        }
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
