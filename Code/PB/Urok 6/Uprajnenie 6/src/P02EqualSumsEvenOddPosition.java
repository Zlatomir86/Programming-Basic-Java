import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            String digit = "" + i;
            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < digit.length(); j++) {
                int currentDigit = Integer.parseInt("" + digit.charAt(j));

                if ( j % 2 == 0) {
                    evenSum = evenSum + currentDigit;
                } else {
                    oddSum = oddSum + currentDigit;
                }
            }

            if (oddSum == evenSum) {
                System.out.printf("%d ", i);
            }
        }
    }
}
