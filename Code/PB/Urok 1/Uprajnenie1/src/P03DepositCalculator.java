import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double interestRate1 = interestRate / 100;

        double sum = deposit + term * ((deposit * interestRate1) / 12);

        System.out.println(sum);
    }
}
