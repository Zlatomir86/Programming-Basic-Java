import java.util.Scanner;

public class P01PCStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double processorPrice = Double.parseDouble(scanner.nextLine());
        double videoCardPrice = Double.parseDouble(scanner.nextLine());
        double ramPrice = Double.parseDouble(scanner.nextLine());
        int ramNumber = Integer.parseInt(scanner.nextLine());
        double salePercent = Double.parseDouble(scanner.nextLine());

        double processorLv = processorPrice * 1.57;
        double videoCardLv = videoCardPrice * 1.57;
        double ramLv = ramPrice * 1.57;
        double allRam = ramLv * ramNumber;

        double saleProcessor = processorLv - processorLv * salePercent;
        double saleVideoCard = videoCardLv - videoCardLv * salePercent;

        double totalPrice = saleProcessor + saleVideoCard + allRam;

        System.out.printf("Money needed - %.2f leva.", totalPrice);
    }
}
