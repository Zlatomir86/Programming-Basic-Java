import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double allPrice = magnolias * 3.25 + hyacinths * 4 + roses * 3.50 + cacti * 8;
        double tax = allPrice * 0.05;
        double profit = allPrice - tax;

        if (presentPrice > profit) {
            double remainder = presentPrice - profit;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(remainder));

        } else {
            double remainder = profit - presentPrice;
            System.out.printf("She is left with %.0f leva.", Math.floor(remainder));
        }
    }
}
