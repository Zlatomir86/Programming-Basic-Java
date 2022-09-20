import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double score = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;

        double percent1 = 0;
        double percent2 = 0;
        double percent3 = 0;
        double percent4 = 0;
        double percent5 = 0;
        double percent6 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 0 || number > 50) {
                score = score / 2;
                counter6++;

            } else if (number <= 9) {
                score = score + (number * 1.0 * 0.2);
                counter1++;

            } else if (number <= 19) {
                score = score + (number * 1.0 * 0.3);
                counter2++;

            } else if (number <= 29) {
                score = score + (number * 1.0 * 0.4);
                counter3++;

            } else if (number <= 39) {
                score = score + 50;
                counter4++;

            } else {
                score = score + 100;
                counter5++;

            }
        }

        percent1 = counter1 * 1.0 / n * 100;
        percent2 = counter2 * 1.0 / n * 100;
        percent3 = counter3 * 1.0 / n * 100;
        percent4 = counter4 * 1.0 / n * 100;
        percent5 = counter5 * 1.0 / n * 100;
        percent6 = counter6 * 1.0 / n * 100;

        System.out.printf("%.2f%n", score);
        System.out.printf("From 0 to 9: %.2f%%%n", percent1);
        System.out.printf("From 10 to 19: %.2f%%%n", percent2);
        System.out.printf("From 20 to 29: %.2f%%%n", percent3);
        System.out.printf("From 30 to 39: %.2f%%%n", percent4);
        System.out.printf("From 40 to 50: %.2f%%%n", percent5);
        System.out.printf("Invalid numbers: %.2f%%%n", percent6);
    }
}
