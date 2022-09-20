import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double penniesChange = Math.round(change * 100);
        int counter = 0;


        while (penniesChange > 0) {
            if (penniesChange >= 200) {
                penniesChange = penniesChange - 200;
                counter++;

            } else if (penniesChange >= 100) {
                penniesChange = penniesChange - 100;
                counter++;

            } else if (penniesChange >= 50) {
                penniesChange = penniesChange - 50;
                counter++;

            } else if (penniesChange >= 20) {
                penniesChange = penniesChange - 20;
                counter++;

            } else if (penniesChange >= 10) {
                penniesChange = penniesChange - 10;
                counter++;

            } else if (penniesChange >= 5) {
                penniesChange = penniesChange - 5;
                counter++;

            } else if (penniesChange >= 2) {
                penniesChange = penniesChange - 2;
                counter++;

            } else if (penniesChange >= 1) {
                penniesChange = penniesChange - 1;
                counter++;

            }
        }

        System.out.println(counter);
    }
}
