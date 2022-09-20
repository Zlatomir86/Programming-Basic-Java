import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        int allTicketsCounter = 0;
        int studentCounter = 0;
        int standardCounter = 0;
        int kidCounter = 0;

        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int allCounter = 0;

            while (!ticketType.equals("End")) {
                allCounter++;
                allTicketsCounter++;

                if (ticketType.equals("student")) {
                    studentCounter++;
                } else if (ticketType.equals("standard")) {
                    standardCounter++;
                } else if (ticketType.equals("kid")) {
                    kidCounter++;
                }

                if (ticketType.equals("Finish") || allCounter >= freeSeats) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, allCounter * 1.0 / freeSeats * 100);

            movieName = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", allTicketsCounter);
        System.out.printf("%.2f%% student tickets.%n", studentCounter * 1.00 / allTicketsCounter * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCounter * 1.00 / allTicketsCounter * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidCounter * 1.00 / allTicketsCounter * 100);

    }
}
