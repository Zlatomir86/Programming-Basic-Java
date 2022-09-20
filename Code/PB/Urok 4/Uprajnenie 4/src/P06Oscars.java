import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;

        totalPoints = totalPoints + academyPoints;

        for (int i = 1; i <= n; i++) {
            String judge = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            int length = judge.length();
            totalPoints = totalPoints + (length * judgePoints / 2);

            if (totalPoints > 1250.5) {
                break;
            }
        }

        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, totalPoints);

        } else {
            double remainder = 1250.5 - totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!", name, remainder);
        }
    }
}
