import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        int rankList = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        double average = 0;
        int finals = 0;

        for (int i = 1; i <= n; i++) {
            String stage = scanner.nextLine();

            if (stage.equals("W")) {
                totalPoints = totalPoints + 2000;
                finals++;

            } else if (stage.equals("F")) {
                totalPoints = totalPoints + 1200;

            } else if (stage.equals("SF")) {
                totalPoints = totalPoints + 720;

            }
        }

        average = totalPoints;

        average = average / n;
        average = Math.floor(average);

        totalPoints = totalPoints + rankList;

        double percent = (finals / n) * 100;

        System.out.printf("Final points: %d %n", totalPoints);
        System.out.printf("Average points: %.0f %n", average);
        System.out.printf("%.2f%%", percent);
    }
}
