import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;


        if (groupType.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;

            } else if (day.equals("Saturday")) {
                price = 9.80;

            } else if (day.equals("Sunday")) {
                price = 10.46;

            }

            totalPrice = price * group;

            if (group >= 30) {
                totalPrice = totalPrice - totalPrice * 0.15;

            }

        } else if (groupType.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;

            } else if (day.equals("Saturday")) {
                price = 15.60;

            } else if (day.equals("Sunday")) {
                price = 16;

            }

            totalPrice = price * group;

            if (group >= 100) {
                totalPrice = totalPrice - price * 10;

            }

        } else if (groupType.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;

            } else if (day.equals("Saturday")) {
                price = 20;

            } else if (day.equals("Sunday")) {
                price = 22.50;

            }

            totalPrice = price * group;

            if (group >= 10 && group <= 20) {
                totalPrice = totalPrice - totalPrice * 0.05;

            }

        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
