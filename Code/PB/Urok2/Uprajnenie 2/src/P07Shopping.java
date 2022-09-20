import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double nPrice = n * 250;

        double mPrice1 = nPrice * 0.35;
        double mPrice2 = m * mPrice1;

        double pPrice1 = nPrice * 0.10;
        double pPrice2 = p * pPrice1;

        double totalPrice = nPrice + mPrice2 + pPrice2;

        double allPrice = 0;

        if (n > m) {
            allPrice = totalPrice - (totalPrice * 0.15);

        } else {
            allPrice = totalPrice;
        }

        if (allPrice <= budget) {
            double remainder = budget - allPrice;
            System.out.printf("You have %.2f leva left!", remainder);

        } else {
            double remainder = allPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", remainder);
        }
    }
}
