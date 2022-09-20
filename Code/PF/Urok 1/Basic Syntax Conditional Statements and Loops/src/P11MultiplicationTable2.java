import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int i = 0;
        int sum = 0;

        for (i = num2; i <= 10; i++) {
            sum = num1 * i;

            System.out.printf("%d X %d = %d%n", num1, i, sum);

        }

        if (num2 > 10) {
            sum = num1 * num2;
            System.out.printf("%d X %d = %d%n", num1, num2, sum);
        }

    }
}
