import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allTime = hours * 60 + minutes;
        allTime = allTime + 30;

        hours = allTime / 60;
        minutes = allTime % 60;

        if (hours >= 24) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
