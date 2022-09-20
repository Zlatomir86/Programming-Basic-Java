import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;

        if (kmPerMonth <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                totalPrice = kmPerMonth * 0.75 * 4;
                totalPrice = totalPrice - totalPrice * 0.10;

            } else if (season.equals("Summer")) {
                totalPrice = kmPerMonth * 0.90 * 4;
                totalPrice = totalPrice - totalPrice * 0.10;

            } else if (season.equals("Winter")) {
                totalPrice = kmPerMonth * 1.05 * 4;
                totalPrice = totalPrice - totalPrice * 0.10;

            }

        } else if (kmPerMonth <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                totalPrice = kmPerMonth * 0.95 * 4;
                totalPrice = totalPrice - totalPrice * 0.10;

            } else if (season.equals("Summer")) {
                totalPrice = kmPerMonth * 1.10 * 4;
                totalPrice = totalPrice - totalPrice * 0.10;

            } else if (season.equals("Winter")) {
                totalPrice = kmPerMonth * 1.25 * 4;
                totalPrice = totalPrice - totalPrice * 0.10;

            }

        } else if (kmPerMonth <= 20000) {
            if (season.equals("Spring") || season.equals("Autumn") || season.equals("Summer") || season.equals("Winter")) {
                totalPrice = kmPerMonth * 1.45 * 4;
                totalPrice = totalPrice - totalPrice * 0.10;

            }
        }

        System.out.printf("%.2f", totalPrice);
    }
}
