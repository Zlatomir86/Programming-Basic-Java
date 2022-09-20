import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = " ";
        String location = " ";
        double totalPrice = 0;

        if (budget <= 1000) {
            location = "Camp";

            if (season.equals("Summer")) {
                place = "Alaska";
                totalPrice = budget * 0.65;

            } else if (season.equals("Winter")) {
                place = "Morocco";
                totalPrice = budget * 0.45;
            }

        } else if (budget <= 3000) {
            location = "Hut";

            if (season.equals("Summer")) {
                place = "Alaska";
                totalPrice = budget * 0.80;

            } else if (season.equals("Winter")) {
                place = "Morocco";
                totalPrice = budget * 0.60;

            }

        } else {
            location = "Hotel";

            if (season.equals("Summer")) {
                place = "Alaska";
                totalPrice = budget * 0.90;

            } else if (season.equals("Winter")) {
                place = "Morocco";
                totalPrice = budget * 0.90;

            }
        }

        System.out.printf("%s - %s - %.2f", place, location, totalPrice);
    }
}
