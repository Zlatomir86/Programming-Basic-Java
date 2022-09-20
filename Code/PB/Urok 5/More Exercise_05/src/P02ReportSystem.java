import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalSum = Integer.parseInt(scanner.nextLine());
        String end = scanner.nextLine();

        int counter = 0;
        int cashCounter = 0;
        int cardCounter = 0;
        double totalMoney = 0;
        double cardPrice = 0;
        double cashPrice = 0;
        boolean declined = false;

        while (!end.equals("End")) {
            int price = Integer.parseInt(end);
            counter ++;

            if (!(counter % 2 == 0)) {
                if (price > 100) {
                    declined = true;

                } else {
                    cashCounter++;
                    cashPrice = cashPrice + price;

                }

            } else {
                if (price < 10) {
                    declined = true;

                } else {
                    cardCounter++;
                    cardPrice = cardPrice + price;

                }

            }

            if (declined) {
                System.out.println("Error in transaction!");
            } else {
                totalMoney = totalMoney + price;
                System.out.println("Product sold!");
            }

            if (totalSum <= totalMoney) {
                System.out.printf("Average CS: %.2f%n", cashPrice / cashCounter);
                System.out.printf("Average CC: %.2f%n", cardPrice / cardCounter);

                break;
            }

            declined = false;

            end = scanner.nextLine();
        }

        if (end.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
