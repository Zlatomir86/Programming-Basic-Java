import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int preparation = Integer.parseInt(scanner.nextLine());
        double sale = Double.parseDouble(scanner.nextLine());

        double pricePens = pens * 5.80;
        double priceMarkers = markers * 7.20;
        double pricePreparation = preparation * 1.20;

        double priceAll = pricePens + priceMarkers + pricePreparation;

        double percent = sale / 100;

        double priceWithSale = priceAll - (priceAll * percent);

        System.out.println(priceWithSale);
    }
}
