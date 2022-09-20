import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String summerOrWinter = scanner.nextLine();

        String destination = " ";
        String CampOrHotel = " ";
        double spent = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (summerOrWinter.equals("summer")) {
                CampOrHotel = "Camp";
                spent = budget * 0.30;

            } else if (summerOrWinter.equals("winter")) {
                CampOrHotel = "Hotel";
                spent = budget * 0.70;

            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            if (summerOrWinter.equals("summer")) {
                CampOrHotel = "Camp";
                spent = budget * 0.40;

            } else if (summerOrWinter.equals("winter")) {
                CampOrHotel = "Hotel";
                spent = budget * 0.80;

            }

        } else if (budget > 1000) {
            destination = "Europe";
            CampOrHotel = "Hotel";
            spent = budget * 0.90;
        }

        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", CampOrHotel, spent);
    }
}
