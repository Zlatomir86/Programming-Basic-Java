import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double georgsMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        double freeBelts = students / 6;

        double totalPrice = lightsabers * Math.ceil(students + students * 0.10) + (robes * students) + belts * (students - freeBelts);

        if (georgsMoney >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);

        } else {
            double remainder = Math.abs(totalPrice - georgsMoney);
            System.out.printf("George Lucas will need %.2flv more.", remainder);

        }
    }
}
