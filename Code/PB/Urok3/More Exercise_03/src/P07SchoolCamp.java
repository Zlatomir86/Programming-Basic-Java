import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        String sport = " ";

        if (season.equals("Winter")) {
            if (groupType.equals("girls")) {
                sport = "Gymnastics";
                totalPrice = students * nights * 9.60;

            } else if (groupType.equals("boys")) {
                sport = "Judo";
                totalPrice = students * nights * 9.60;

            } else if (groupType.equals("mixed")) {
                sport = "Ski";
                totalPrice = students * nights * 10;

            }

        } else if (season.equals("Spring")) {
            if (groupType.equals("girls")) {
                sport = "Athletics";
                totalPrice = students * nights * 7.20;

            } else if (groupType.equals("boys")) {
                sport = "Tennis";
                totalPrice = students * nights * 7.20;

            } else if (groupType.equals("mixed")) {
                sport = "Cycling";
                totalPrice = students * nights * 9.50;

            }

        } else if (season.equals("Summer")) {
            if (groupType.equals("girls")) {
                sport = "Volleyball";
                totalPrice = students * nights * 15;

            } else if (groupType.equals("boys")) {
                sport = "Football";
                totalPrice = students * nights * 15;

            } else if (groupType.equals("mixed")) {
                sport = "Swimming";
                totalPrice = students * nights * 20;

            }

        }

        if (students >= 50) {
            totalPrice = totalPrice - totalPrice * 0.50;

        } else if (students >= 20) {
            totalPrice = totalPrice - totalPrice * 0.15;

        } else if (students >=10) {
            totalPrice = totalPrice - totalPrice * 0.05;

        }

        System.out.printf("%s %.2f lv.", sport, totalPrice);
    }
}
