import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        double price1 = quantity * 2.50;
                        System.out.printf("%.2f", price1);
                        break;

                    case "apple":
                        double price2 = quantity * 1.20;
                        System.out.printf("%.2f", price2);
                        break;

                    case "orange":
                        double price3 = quantity * 0.85;
                        System.out.printf("%.2f", price3);
                        break;

                    case "grapefruit":
                        double price4 = quantity * 1.45;
                        System.out.printf("%.2f", price4);
                        break;

                    case "kiwi":
                        double price5 = quantity * 2.70;
                        System.out.printf("%.2f", price5);
                        break;

                    case "pineapple":
                        double price6 = quantity * 5.50;
                        System.out.printf("%.2f", price6);
                        break;

                    case "grapes":
                        double price7 = quantity * 3.85;
                        System.out.printf("%.2f", price7);
                        break;

                    default:
                        System.out.println("error");
                        break;
                }
            break;

            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        double price1 = quantity * 2.70;
                        System.out.printf("%.2f", price1);
                        break;

                    case "apple":
                        double price2 = quantity * 1.25;
                        System.out.printf("%.2f", price2);
                        break;

                    case "orange":
                        double price3 = quantity * 0.90;
                        System.out.printf("%.2f", price3);
                        break;

                    case "grapefruit":
                        double price4 = quantity * 1.60;
                        System.out.printf("%.2f", price4);
                        break;

                    case "kiwi":
                        double price5 = quantity * 3.00;
                        System.out.printf("%.2f", price5);
                        break;

                    case "pineapple":
                        double price6 = quantity * 5.60;
                        System.out.printf("%.2f", price6);
                        break;

                    case "grapes":
                        double price7 = quantity * 4.20;
                        System.out.printf("%.2f", price7);
                        break;

                    default:
                        System.out.println("error");
                }
            break;

            default:
                System.out.println("error");
                break;
        }
    }
}
