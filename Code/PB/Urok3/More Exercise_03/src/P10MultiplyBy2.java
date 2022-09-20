import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        if (num < 0) {
            System.out.println("Negative number!");
        } else {
            System.out.printf("Result: %.2f %n", num * 2);
            while (num >= 0) {
                double num2 = Double.parseDouble(scanner.nextLine());

                if (num2 < 0) {
                    System.out.println("Negative number!");
                    break;
                } else {
                    System.out.printf("Result: %.2f %n", num2 * 2);
                }
            }
        }

    }
}

