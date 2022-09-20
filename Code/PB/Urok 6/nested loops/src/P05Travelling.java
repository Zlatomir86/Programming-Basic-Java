import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        double allSavings = 0;

        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());
            while (!(allSavings >= minBudget)) {
                double savings = Double.parseDouble(scanner.nextLine());
                allSavings = allSavings + savings;

                if (allSavings >= minBudget) {
                    allSavings = 0;
                    break;
                }
            }

            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }
    }
}
