import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double chickenMenusPrice = chickenMenus * 10.35;
        double fishMenusPrice = fishMenus * 12.40;
        double vegetarianMenusPrice = vegetarianMenus * 8.15;

        double allPrice = chickenMenusPrice + fishMenusPrice + vegetarianMenusPrice;

        double dessertPrice = allPrice * 0.2;

        double endPrice = allPrice + dessertPrice + 2.50;

        System.out.println(endPrice);
    }
}
