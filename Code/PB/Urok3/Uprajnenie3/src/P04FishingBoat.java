import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisher = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (season.equals("Spring")) {
            price = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            price = 4200;
        } else if (season.equals("Winter")) {
            price = 2600;
        }

        double totalPrice = 0;

        if (fisher <= 6) {
            totalPrice = price - price * 0.10;
        } else if (fisher <=11) {
            totalPrice = price - price * 0.15;
        } else if (fisher > 12) {
            totalPrice = price - price * 0.25;
        }

        if (fisher % 2 == 0 && (season.equals("Spring") || season.equals("Summer") || season.equals("Winter"))) {
            totalPrice = totalPrice - totalPrice * 0.05;
        }

        if (budget >= totalPrice) {
            double remainder = budget - totalPrice;
            System.out.printf("Yes! You have %.2f leva left.", remainder);

        } else if (totalPrice > budget) {
            double remainder = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.", remainder);
        }
    }
}
