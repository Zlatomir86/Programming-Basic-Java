import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while ((sum < num1)) {
            int num2 = Integer.parseInt(scanner.nextLine());
            sum += num2;
        }
        System.out.println(sum);
    }
}
