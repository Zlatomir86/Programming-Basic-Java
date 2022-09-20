import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String VipOrNormal = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        switch(VipOrNormal) {
            case "VIP":
                if (people >= 1 && people <=4) {
                    double percent = budget * 0.75;
                    double transport = budget - percent;
                    double ticket = people * 499.99;
                    if (transport >= ticket) {
                        double remainder = transport - ticket;
                        System.out.printf("Yes! You have %.2f leva left.", remainder);

                    } else {
                        double remainder = ticket - transport;
                        System.out.printf("Not enough money! You need %.2f leva.", remainder);

                    }

                } else if (people >= 5 && people <=9) {
                    double percent = budget * 0.60;
                    double transport = budget - percent;
                    double ticket = people * 499.99;
                    if (transport >= ticket) {
                        double remainder = transport - ticket;
                        System.out.printf("Yes! You have %.2f leva left.", remainder);

                    } else {
                        double remainder = ticket - transport;
                        System.out.printf("Not enough money! You need %.2f leva.", remainder);

                    }

                } else if (people >= 10 && people <=24) {
                    double percent = budget * 0.50;
                    double transport = budget - percent;
                    double ticket = people * 499.99;
                    if (transport >= ticket) {
                        double remainder = transport - ticket;
                        System.out.printf("Yes! You have %.2f leva left.", remainder);

                    } else {
                        double remainder = ticket - transport;
                        System.out.printf("Not enough money! You need %.2f leva.", remainder);

                    }

                } else if (people >= 25 && people <=49) {
                    double percent = budget * 0.40;
                    double transport = budget - percent;
                    double ticket = people * 499.99;
                    if (transport >= ticket) {
                        double remainder = transport - ticket;
                        System.out.printf("Yes! You have %.2f leva left.", remainder);

                    } else {
                        double remainder = ticket - transport;
                        System.out.printf("Not enough money! You need %.2f leva.", remainder);

                    }

                } else if (people > 50) {
                    double percent = budget * 0.25;
                    double transport = budget - percent;
                    double ticket = people * 499.99;
                    if (transport >= ticket) {
                        double remainder = transport - ticket;
                        System.out.printf("Yes! You have %.2f leva left.", remainder);

                    } else {
                        double remainder = ticket - transport;
                        System.out.printf("Not enough money! You need %.2f leva.", remainder);

                    }

                }
                break;

            case "Normal":
                if (people >= 1 && people <=4) {
                    double percent = budget * 0.75;
                    double transport = budget - percent;
                    double ticket = people * 249.99;
                    if (transport >= ticket) {
                        double remainder = transport - ticket;
                        System.out.printf("Yes! You have %.2f leva left.", remainder);

                    } else {
                        double remainder = ticket - transport;
                        System.out.printf("Not enough money! You need %.2f leva.", remainder);

                    }

                } else if (people >= 5 && people <=9) {
                    double percent = budget * 0.60;
                    double transport = budget - percent;
                    double ticket = people * 249.99;
                    if (transport >= ticket) {
                        double remainder = transport - ticket;
                        System.out.printf("Yes! You have %.2f leva left.", remainder);

                    } else {
                        double remainder = ticket - transport;
                        System.out.printf("Not enough money! You need %.2f leva.", remainder);

                    }

                } else if (people >= 10 && people <=24) {
                    double percent = budget * 0.50;
                    double transport = budget - percent;
                    double ticket = people * 249.99;
                    if (transport >= ticket) {
                        double remainder = transport - ticket;
                        System.out.printf("Yes! You have %.2f leva left.", remainder);

                    } else {
                        double remainder = ticket - transport;
                        System.out.printf("Not enough money! You need %.2f leva.", remainder);

                    }

                } else if (people >= 25 && people <=49) {
                    double percent = budget * 0.40;
                    double transport = budget - percent;
                    double ticket = people * 249.99;
                    if (transport >= ticket) {
                        double remainder = transport - ticket;
                        System.out.printf("Yes! You have %.2f leva left.", remainder);

                    } else {
                        double remainder = ticket - transport;
                        System.out.printf("Not enough money! You need %.2f leva.", remainder);

                    }

                } else if (people > 50) {
                    double percent = budget * 0.25;
                    double transport = budget - percent;
                    double ticket = people * 249.99;
                    if (transport >= ticket) {
                        double remainder = transport - ticket;
                        System.out.printf("Yes! You have %.2f leva left.", remainder);

                    } else {
                        double remainder = ticket - transport;
                        System.out.printf("Not enough money! You need %.2f leva.", remainder);

                    }

                }
                break;
        }
    }
}
