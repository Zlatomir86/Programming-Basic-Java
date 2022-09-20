import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;

        int evenSum = 0;
        int oddSum = 0;
        int remainder = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum = evenSum + num;

            } else {
                oddSum = oddSum + num;

            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);

        } else {
            remainder = Math.abs(oddSum - evenSum);
            System.out.println("No");
            System.out.printf("Diff = %d", remainder);
        }
    }
}