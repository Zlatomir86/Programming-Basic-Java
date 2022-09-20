import java.util.Scanner;

public class P02FootballKit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tShirtPrice = Double.parseDouble(scanner.nextLine());
        double neededSum = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tShirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double butonkiPrice = (tShirtPrice + shortsPrice) * 2;

        double totalPrice = tShirtPrice + shortsPrice + socksPrice + butonkiPrice;
        double sale = totalPrice - totalPrice * 0.15;

        double remainder = neededSum - sale;

        if (sale >= neededSum) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", sale);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", remainder);
        }
    }
}
