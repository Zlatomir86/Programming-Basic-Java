import java.util.Scanner;

public class P05ExcursionSale {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int seaExcursions = Integer.parseInt(scanner.nextLine());
        int mountainExcursions = Integer.parseInt(scanner.nextLine());
        String stop = scanner.nextLine();

        double totalSum = 0;
        boolean allSold = false;

        while (!stop.equals("Stop")) {
            if (seaExcursions == 0 && mountainExcursions == 0) {
                allSold = true;
                break;
            }

            String seaOrMountain = stop;

            if (seaOrMountain.equals("sea")) {
                if (seaExcursions == 0) {
                    totalSum = totalSum;
                } else {
                    seaExcursions = seaExcursions - 1;
                    totalSum = totalSum + 680;
                }

            }

            if (seaOrMountain.equals("mountain")) {
                if (mountainExcursions == 0) {
                    totalSum = totalSum;
                } else {
                    mountainExcursions = mountainExcursions - 1;
                    totalSum = totalSum + 499;
                }

            }
            if (seaExcursions != 0 || mountainExcursions != 0) {
                stop = scanner.nextLine();
            }
        }

        if (allSold) {
            System.out.println("Good job! Everything is sold.");
        }

        System.out.printf("Profit: %.0f leva.", totalSum);
    }
}
