import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationPause = Integer.parseInt(scanner.nextLine());

        double lunchTime = durationPause / 8.00;
        double breackTime = durationPause / 4.00;
        double freeTime = durationPause - lunchTime - breackTime;

        double reminder = Math.abs(durationEpisode - freeTime);

        if (freeTime >= durationEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(reminder));

        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(reminder));
        }
    }
}
