import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String kayWord = scanner.nextLine();
        double sum = 0;

        while (!kayWord.equals("NoMoreMoney")) {
            double num = Double.parseDouble(kayWord);
            if (num < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f %n", num);
            sum = sum + num;
            kayWord = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
