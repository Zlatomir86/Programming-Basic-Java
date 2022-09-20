import java.util.Scanner;

public class P04GrandpaStavri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalRakiq = 0;
        double totalDegree = 0;

        for (int i = 1; i <= n; i++) {
            double rakiq = Double.parseDouble(scanner.nextLine());
            double degree = Double.parseDouble(scanner.nextLine());

            totalRakiq = totalRakiq + rakiq;
            totalDegree = totalDegree + degree * rakiq;

        }

        double averageDegree = totalDegree / totalRakiq;

        System.out.printf("Liter: %.2f%n", totalRakiq);
        System.out.printf("Degrees: %.2f%n", averageDegree);

        if (averageDegree < 38) {
            System.out.println("Not good, you should baking!");
        } else if (averageDegree <= 42) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
