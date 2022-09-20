import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int racerTime1 = Integer.parseInt(scanner.nextLine());
        int racerTime2 = Integer.parseInt(scanner.nextLine());
        int racerTime3 = Integer.parseInt(scanner.nextLine());

        int totalTime = racerTime1 + racerTime2 + racerTime3;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:%02d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
