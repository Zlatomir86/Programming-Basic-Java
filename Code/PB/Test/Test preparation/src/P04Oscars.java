import java.util.Scanner;

public class P04Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double totalPoints = academyPoints;

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            double nameLength = (name.length());

            totalPoints = totalPoints + nameLength * points / 2;

            if (totalPoints > 1250.5) {
                break;
            }
        }

        double remainder = 1250.5 - totalPoints;

        if (totalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, remainder);
        }
    }
}
