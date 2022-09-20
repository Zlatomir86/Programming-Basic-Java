import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int freeDays = Integer.parseInt(scanner.nextLine());

        int playMinutesRestDays = freeDays * 127;
        int workdays = 365 - freeDays;

        int playMinutesWorkDays = workdays * 63;

        int playMinutesAllDays = playMinutesRestDays + playMinutesWorkDays;

        if (playMinutesAllDays <= 30000) {
            int remainder = 30000 - playMinutesAllDays;
            int minutes = remainder % 60;
            int hours = remainder / 60;

            System.out.printf("Tom sleeps well %n");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);

        } else {
            int remainder = playMinutesAllDays - 30000;
            int minutes = remainder % 60;
            int hours = remainder / 60;

            System.out.printf("Tom will run away %n");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }
    }
}
