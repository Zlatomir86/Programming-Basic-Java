import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketsNumber = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double sum = 0;
        boolean freePhoto = false;

        if (stage.equals("Quarter final")) {
            if (ticketType.equals("Standard")) {
                sum = ticketsNumber * 55.50;

            } else if (ticketType.equals("Premium")) {
                sum = ticketsNumber * 105.20;

            } else if (ticketType.equals("VIP")) {
                sum = ticketsNumber * 118.90;

            }

        } else if (stage.equals("Semi final")) {
            if (ticketType.equals("Standard")) {
                sum = ticketsNumber * 75.88;

            } else if (ticketType.equals("Premium")) {
                sum = ticketsNumber * 125.22;

            } else if (ticketType.equals("VIP")) {
                sum = ticketsNumber * 300.40;

            }

        } else if (stage.equals("Final")) {
            if (ticketType.equals("Standard")) {
                sum = ticketsNumber * 110.10;

            } else if (ticketType.equals("Premium")) {
                sum = ticketsNumber * 160.66;

            } else if (ticketType.equals("VIP")) {
                sum = ticketsNumber * 400;

            }

        }

        if (sum > 4000) {
            freePhoto = true;
            sum = sum - sum * 0.25;
        } else if (sum > 2500) {
            sum = sum - sum * 0.10;
        }

        if (symbol.equals("Y")) {
            if (freePhoto) {
                sum = sum - 0;
            } else {
                sum = sum + 40 * ticketsNumber;
            }
        } else if (symbol.equals("N")) {
            sum = sum - 0;
        }

        System.out.printf("%.2f", sum);
    }
}
