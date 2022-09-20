import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String start = scanner.nextLine();

        double totalEnteredMoney = 0;

        while (!start.equals("Start")) {
            double enteredMoney = Double.parseDouble(start);

            if (enteredMoney == 0.1 || enteredMoney == 0.2 || enteredMoney == 0.5 || enteredMoney == 1 || enteredMoney == 2) {
                totalEnteredMoney = totalEnteredMoney + enteredMoney;

            } else {
                System.out.printf("Cannot accept %.2f%n", enteredMoney);

            }

            start = scanner.nextLine();

        }

        String end = scanner.nextLine();


        while (!end.equals("End")) {
            if (end.equals("Nuts")) {
                if (totalEnteredMoney < 2) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalEnteredMoney = totalEnteredMoney - 2.0;
                    System.out.println("Purchased Nuts");
                }

            } else if (end.equals("Water")) {
                if (totalEnteredMoney < 0.7) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalEnteredMoney = totalEnteredMoney - 0.7;
                    System.out.println("Purchased Water");
                }

            } else if (end.equals("Crisps")) {
                if (totalEnteredMoney < 1.5) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalEnteredMoney = totalEnteredMoney - 1.5;
                    System.out.println("Purchased Crisps");
                }

            } else if (end.equals("Soda")) {
                if (totalEnteredMoney < 0.8) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalEnteredMoney = totalEnteredMoney - 0.8;
                    System.out.println("Purchased Soda");
                }

            } else if (end.equals("Coke")) {
                if (totalEnteredMoney < 1.0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalEnteredMoney = totalEnteredMoney - 1.0;
                    System.out.println("Purchased Coke");
                }

            } else {
                System.out.println("Invalid product");

            }

            end = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalEnteredMoney);
    }
}
