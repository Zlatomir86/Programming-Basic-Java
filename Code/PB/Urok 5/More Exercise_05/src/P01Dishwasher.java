import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());

        String end = scanner.nextLine();
        int dishesOrPots = Integer.parseInt(end);

        int allQuantity = bottles * 750;
        int counter = 0;
        int dishes = 0;
        int pots = 0;

        while (!end.equals("End")) {
            counter++;

            if (!(counter % 3 == 0)) {
                int quantityDishes = dishesOrPots * 5;
                allQuantity = allQuantity - quantityDishes;
                dishes = dishes + dishesOrPots;

            } else {
                int quantityPots = dishesOrPots * 15;
                allQuantity = allQuantity - quantityPots;
                pots = pots + dishesOrPots;
            }

            if (allQuantity < 0) {
                break;
            } else {
                end = scanner.nextLine();
                if (end.equals("End")) {
                    continue;
                }
                dishesOrPots = Integer.parseInt(end);
            }
        }

        if (allQuantity >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", allQuantity);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(allQuantity));
        }
    }
}
