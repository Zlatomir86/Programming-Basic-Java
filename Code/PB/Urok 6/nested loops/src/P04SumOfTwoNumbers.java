import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int stopInterval = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean validCombination = false;

        for (int num1 = startInterval; num1 <= stopInterval; num1++) {
            for (int num2 = startInterval; num2 <= stopInterval; num2++) {
                counter++;
                if (num1 + num2 == magicNum) {
                    validCombination = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, num1, num2, magicNum);
                    break;
                }
            }
            if (validCombination) {
                break;
            }
        }
        if (!validCombination) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
