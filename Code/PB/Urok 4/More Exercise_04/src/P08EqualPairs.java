import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int value = 0;
        int counterTrueValue = 0;
        int counter = 0;
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            counter++;
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            int sum = num1 + num2;

            if (i == 1) {
                value = sum;
            }

            if (value == sum) {
                counterTrueValue ++;
            }

            if (i >= 2){
                int diff = Math.abs(value - sum);

                if (maxDiff < diff) {
                    maxDiff = diff;
                }

                value = sum;
            }
        }

        if (counterTrueValue == counter) {
            System.out.printf("Yes, value=%d", value);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
