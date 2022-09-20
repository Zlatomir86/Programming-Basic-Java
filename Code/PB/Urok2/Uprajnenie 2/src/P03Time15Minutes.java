import java.util.Scanner;

public class P03Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesPlus15 = 0;
        int hoursPlus15 = 0;

        if (minutes > 44) {
            minutesPlus15 = (minutes + 15) % 60;
            hoursPlus15 = hours + 1;

        } else {
            minutesPlus15 = minutes + 15;
            hoursPlus15 = hours;
        }

        if (hoursPlus15 >= 24) {
            hoursPlus15 = 0;
        }

        if (minutesPlus15 < 10) {
            System.out.printf("%d:0%d", hoursPlus15, minutesPlus15);
        } else {
            System.out.printf("%d:%d", hoursPlus15, minutesPlus15);
        }
    }
}
