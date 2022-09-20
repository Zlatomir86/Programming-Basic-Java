import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        if (10 <= degree && degree <= 18) {
            if (time.equals("Morning")) {
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degree);
            } else if (time.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
            } else if (time.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
            }

        } else if (18 < degree && degree <= 24) {
            if (time.equals("Morning")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
            } else if (time.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);
            } else if (time.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
            }

        } else if (degree >= 25) {
            if (time.equals("Morning")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);
            } else if (time.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degree);
            } else if (time.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
            }
        }
    }
}
