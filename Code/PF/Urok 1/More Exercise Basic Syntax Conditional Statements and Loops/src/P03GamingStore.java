import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String gameTime = scanner.nextLine();

        double spend = 0;

        while (!gameTime.equals("Game Time")) {
            if (balance == 0) {
                break;
            }

            if (gameTime.equals("OutFall 4")) {
                if (balance >= 39.99) {
                    balance = balance - 39.99;
                    spend = spend + 39.99;
                    System.out.printf("Bought %s%n", gameTime);

                } else {
                    System.out.println("Too Expensive");

                }

            } else if (gameTime.equals("CS: OG")) {
                if (balance >= 15.99) {
                    balance = balance - 15.99;
                    spend = spend + 15.99;
                    System.out.printf("Bought %s%n", gameTime);

                } else {
                    System.out.println("Too Expensive");

                }

            } else if (gameTime.equals("Zplinter Zell")) {
                if (balance >= 19.99) {
                    balance = balance - 19.99;
                    spend = spend + 19.99;
                    System.out.printf("Bought %s%n", gameTime);

                } else {
                    System.out.println("Too Expensive");

                }

            } else if (gameTime.equals("Honored 2")) {
                if (balance >= 59.99) {
                    balance = balance - 59.99;
                    spend = spend + 59.99;
                    System.out.printf("Bought %s%n", gameTime);

                } else {
                    System.out.println("Too Expensive");

                }

            } else if (gameTime.equals("RoverWatch")) {
                if (balance >= 29.99) {
                    balance = balance - 29.99;
                    spend = spend + 29.99;
                    System.out.printf("Bought %s%n", gameTime);

                } else {
                    System.out.println("Too Expensive");

                }

            } else if (gameTime.equals("RoverWatch Origins Edition")) {
                if (balance >= 39.99) {
                    balance = balance - 39.99;
                    spend = spend + 39.99;
                    System.out.printf("Bought %s%n", gameTime);

                } else {
                    System.out.println("Too Expensive");

                }

            } else {
                System.out.println("Not Found");
            }



            gameTime = scanner.nextLine();
        }

        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, balance);
        } else {
            System.out.println("Out of money!");
        }

    }
}
