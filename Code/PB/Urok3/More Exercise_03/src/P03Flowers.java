import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                price = chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50;
                break;

            case "Autumn":
            case "Winter":
                price = chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15;
                break;
        }

        if (day.equals("Y")) {
            price = price + price * 0.15;

        } else if (day.equals("N")) {
            price = price;
        }

        if (season.equals("Spring") && tulips > 7) {
            price = price - price * 0.05;
        }

        if (season.equals("Winter") && roses >= 10) {
            price = price - price * 0.10;
        }

        if ((season.equals("Spring") || season.equals("Winter") || season.equals("Summer") || season.equals("Autumn")) && chrysanthemums + roses + tulips > 20) {
            price = price - price * 0.20;
        }

        double allPrice = price + 2;

        System.out.printf("%.2f", allPrice);

    }
}
