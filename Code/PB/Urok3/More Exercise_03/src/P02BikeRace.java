import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int young = Integer.parseInt(scanner.nextLine());
         int old = Integer.parseInt(scanner.nextLine());
         String route = scanner.nextLine();

         if (route.equals("trail")) {
             double totalPrice = young * 5.50 + old * 7;
             double remainder = totalPrice - totalPrice * 0.05;
             System.out.printf("%.2f", remainder);

         } else if (route.equals("cross-country")) {
             double totalPrice = young * 8 + old * 9.50;
             if (young + old >= 50) {
                 double sale = totalPrice - totalPrice * 0.25;
                 double remainder = sale - sale * 0.05;
                 System.out.printf("%.2f", remainder);
             } else {
                 double remainder = totalPrice - totalPrice * 0.05;
                 System.out.printf("%.2f", remainder);
             }

         } else if (route.equals("downhill")) {
             double totalPrice = young * 12.25 + old * 13.75;
             double remainder = totalPrice - totalPrice * 0.05;
             System.out.printf("%.2f", remainder);

         } else if (route.equals("road")) {
             double totalPrice = young * 20 + old * 21.50;
             double remainder = totalPrice - totalPrice * 0.05;
             System.out.printf("%.2f", remainder);

         }
    }
}
