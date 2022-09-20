import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = n;

        int totalSum = 0;

        while (num > 0) {
            int lastNum = num % 10;

            int fact = 1;
            for (int i = 1; i <= lastNum; i++) {
                fact = fact * i;

            }

            totalSum = totalSum + fact;
            num = num / 10;
        }

        if (totalSum == n) {
            System.out.println("yes");

        } else {
            System.out.println("no");

        }
    }
}
