import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        String evenOrOdd = " ";
        double result = 0;

         if (operator.equals("+")) {
             result = N1 + N2;
             if (result % 2 == 0) {
                 evenOrOdd = "even";

             } else {
                 evenOrOdd = "odd";

             }

             System.out.printf("%d %s %d = %.0f - %s", N1, operator, N2, result, evenOrOdd);

         } else if (operator.equals("*")) {
             result = N1 * N2;
             if (result % 2 == 0) {
                 evenOrOdd = "even";

             } else {
                 evenOrOdd = "odd";

             }

             System.out.printf("%d %s %d = %.0f - %s", N1, operator, N2, result, evenOrOdd);

         } else if (operator.equals("-")) {
             result = N1 - N2;
             if (result % 2 == 0) {
                 evenOrOdd = "even";

             } else {
                 evenOrOdd = "odd";

             }

             System.out.printf("%d %s %d = %.0f - %s", N1, operator, N2, result, evenOrOdd);

         } else if (operator.equals("/")) {
             result = N1 * 1.0 / N2;
             if (N2 == 0) {
                 System.out.printf("Cannot divide %d by zero", N1);
             } else {
                 System.out.printf("%d %s %d = %.2f", N1, operator, N2, result);
             }

         } else if (operator.equals("%")) {
             result = N1 * 1.0 % N2;
             if (N2 == 0) {
                 System.out.printf("Cannot divide %d by zero", N1);
             } else {
                 System.out.printf("%d %s %d = %.0f", N1, operator, N2, result);
             }
         }
    }
}
