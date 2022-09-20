import java.util.Scanner;

public class P03SantasHoliday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String grade = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        if (roomType.equals("room for one person")) {
            price = nights * 18.00;

        } else if (roomType.equals("apartment")) {
            price = nights * 25.00;

            if (days < 10) {
                price = price - price * 0.30;
            } else if (days <= 15) {
                price = price - price * 0.35;
            } else {
                price = price - price * 0.50;
            }

        } else if (roomType.equals("president apartment")) {
            price = nights * 35.00;

            if (days < 10) {
                price = price - price * 0.10;
            } else if (days <= 15) {
                price = price - price * 0.15;
            } else {
                price = price - price * 0.20;
            }

        }

        if (grade.equals("positive")) {
            price = price + price * 0.25;
        } else if (grade.equals("negative")) {
            price = price - price * 0.10;
        }

        System.out.printf("%.2f", price);
    }
}
