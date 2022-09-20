import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalPrice = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;
        double numToys = puzzles + dolls + bears + minions + trucks;

        double endPrice = 0;

        if (numToys >= 50) {
            double percentSale = totalPrice * 0.25;
            endPrice = totalPrice - percentSale;

        } else {
            endPrice = totalPrice;
        }

        double rent = endPrice * 0.1;
        double profit = endPrice - rent;

        if (profit >= excursionPrice) {
            double remainder = profit - excursionPrice;
            System.out.printf("Yes! %.2f lv left.", remainder);

        } else {
            double remainder = excursionPrice - profit;
            System.out.printf("Not enough money! %.2f lv needed.", remainder);
        }
    }
}
