import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double seconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double allSeconds = meters * secondsPerMeter;
        double add12Seconds1 = Math.floor(meters / 15);
        double add12Seconds2 = add12Seconds1 * 12.5;

        double totalTime = allSeconds + add12Seconds2;

        if (seconds <= totalTime) {
            double lose = totalTime - seconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.",lose);

        } else {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
