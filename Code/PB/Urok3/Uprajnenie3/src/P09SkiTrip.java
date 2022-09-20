import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String opinion = scanner.nextLine();

        double totalPrice = 0;
        double nights = days - 1;

        if (room.equals("room for one person")) {
            totalPrice = nights * 18.00;

        } else if (room.equals("apartment")) {
            totalPrice = nights * 25.00;

            if (days < 10) {
                totalPrice = totalPrice - totalPrice * 0.30;
            } else if (days <= 15) {
                totalPrice = totalPrice - totalPrice * 0.35;
            } else {
                totalPrice = totalPrice - totalPrice * 0.50;
            }

        } else if (room.equals("president apartment")) {
            totalPrice = nights * 35.00;

            if (days < 10) {
                totalPrice = totalPrice - totalPrice * 0.10;
            } else if (days <= 15) {
                totalPrice = totalPrice - totalPrice * 0.15;
            } else {
                totalPrice = totalPrice - totalPrice * 0.20;
            }

        }

        if (opinion.equals("positive")) {
            totalPrice = totalPrice + totalPrice * 0.25;
        } else if (opinion.equals("negative")) {
            totalPrice = totalPrice - totalPrice * 0.10;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
