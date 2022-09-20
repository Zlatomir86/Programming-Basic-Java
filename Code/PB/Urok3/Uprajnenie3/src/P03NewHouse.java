import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (flowerType.equals("Roses")) {
            totalPrice = flowers * 5;

        } else if (flowerType.equals("Dahlias")) {
            totalPrice = flowers * 3.80;

        } else if (flowerType.equals("Tulips")) {
            totalPrice = flowers * 2.80;

        } else if (flowerType.equals("Narcissus")) {
            totalPrice = flowers * 3;

        } else if (flowerType.equals("Gladiolus")) {
            totalPrice = flowers * 2.50;

        }

        if (flowers > 80 && flowerType.equals("Roses")) {
            totalPrice = totalPrice - totalPrice * 0.10;
        }

        if (flowers > 90 && flowerType.equals("Dahlias")) {
            totalPrice = totalPrice - totalPrice * 0.15;
        }

        if (flowers > 80 && flowerType.equals("Tulips")) {
            totalPrice = totalPrice - totalPrice * 0.15;
        }

        if (flowers < 120 && flowerType.equals("Narcissus")) {
            totalPrice = totalPrice + totalPrice * 0.15;
        }

        if (flowers < 80 && flowerType.equals("Gladiolus")) {
            totalPrice = totalPrice + totalPrice * 0.20;
        }

        if (totalPrice <= budget) {
            double remainder = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowers, flowerType, remainder);

        } else if (totalPrice > budget) {
            double remainder = totalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", remainder);
        }
    }
}
