import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1++;
            } else if (num < 400) {
                p2++;
            } else if (num < 600) {
                p3++;
            } else if (num < 800) {
                p4++;
            } else {
                p5++;
            }

        }

        double m1 = p1 * 1.00 / n * 100;
        double m2 = p2 * 1.00 / n * 100;
        double m3 = p3 * 1.00 / n * 100;
        double m4 = p4 * 1.00 / n * 100;
        double m5 = p5 * 1.00 / n * 100;

        System.out.printf("%.2f%% %n", m1);
        System.out.printf("%.2f%% %n", m2);
        System.out.printf("%.2f%% %n", m3);
        System.out.printf("%.2f%% %n", m4);
        System.out.printf("%.2f%%", m5);

    }
}
