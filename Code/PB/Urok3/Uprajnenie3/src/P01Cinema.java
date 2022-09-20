import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double allPlaces = r * c;
        double totalPrice = 0;

        switch (type) {
            case "Premiere":
                totalPrice = allPlaces * 12;
                break;

            case "Normal":
                totalPrice = allPlaces * 7.5;
                break;

            case "Discount":
                totalPrice = allPlaces * 5;
                break;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
