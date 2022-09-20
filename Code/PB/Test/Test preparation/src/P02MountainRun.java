import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeFor1Meter = Double.parseDouble(scanner.nextLine());

        double time = distanceInMeters * timeFor1Meter;
        double delay = Math.floor(distanceInMeters / 50) * 30;
        double totalTime = time + delay;

        double remainder = Math.abs(recordInSeconds - totalTime);

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower." , remainder);
        }
    }
}
