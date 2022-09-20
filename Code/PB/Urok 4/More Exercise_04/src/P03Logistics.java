import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int loadsNumber = Integer.parseInt(scanner.nextLine());

        int tons1 = 0;
        double price = 0;
        double percent1 = 0;
        double percent2 = 0;
        double percent3 = 0;
        double percent4 = 0;
        double van = 0;
        double truck = 0;
        double train = 0;

        for (int i = 1; i <= loadsNumber; i++) {
            int tons = Integer.parseInt(scanner.nextLine());

            tons1 = tons1 + tons;

            if (tons <= 3) {
                price = price + tons * 200;
                van = van + tons;
            } else if (tons <= 11){
                price = price + tons * 175;
                truck = truck + tons;
            } else {
                price = price + tons * 120;
                train = train + tons;
            }
        }

        percent1 = price / tons1;
        percent2 = van / tons1 * 100;
        percent3 = truck / tons1 * 100;
        percent4 = train / tons1 * 100;

        System.out.printf("%.2f %n", percent1);
        System.out.printf("%.2f%% %n", percent2);
        System.out.printf("%.2f%% %n", percent3);
        System.out.printf("%.2f%%", percent4);
    }
}
