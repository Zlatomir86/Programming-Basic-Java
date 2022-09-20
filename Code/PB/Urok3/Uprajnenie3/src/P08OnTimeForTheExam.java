import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int hoursToMinutesExam = hourExam * 60;
        int hoursToMinutesArrival = hourArrival * 60;

        int timeExam = hoursToMinutesExam + minutesExam;
        int timeArrival = hoursToMinutesArrival + minutesArrival;

        if (timeArrival == timeExam || timeExam - timeArrival <= 30 && timeExam - timeArrival >= 1) {
            int remainder = timeExam - timeArrival;
            if (remainder == 0) {
                System.out.println("On time");

            } else if (remainder <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", remainder);
            }

        } else if (timeArrival > timeExam) {
            System.out.println("Late");

            if (timeArrival - timeExam < 60) {
                int remainder = timeArrival - timeExam;
                System.out.printf("%d minutes after the start", remainder);

            } else if (timeArrival - timeExam >= 60) {
                int remainderHours = (Math.abs(timeExam - timeArrival)) / 60;
                int remainderMinutes = (Math.abs(timeExam - timeArrival)) % 60;
                if (remainderMinutes < 10) {
                    System.out.printf("%d:0%d hours after the start", remainderHours, remainderMinutes);

                } else {
                    System.out.printf("%d:%d hours after the start", remainderHours, remainderMinutes);

                }

            }

        } else if (timeExam - 30 > timeArrival) {
            System.out.println("Early");

            if (timeExam - timeArrival < 60) {
                int remainder = timeExam - timeArrival;
                System.out.printf("%d minutes before the start", remainder);

            } else if (timeExam - timeArrival >= 60) {
                int remainderHours = (Math.abs(timeExam - timeArrival)) / 60;
                int remainderMinutes = (Math.abs(timeExam - timeArrival)) % 60;
                if (remainderMinutes < 10) {
                    System.out.printf("%d:0%d hours before the start", remainderHours, remainderMinutes);

                } else {
                    System.out.printf("%d:%d hours before the start", remainderHours, remainderMinutes);

                }
            }
        }
    }
}
