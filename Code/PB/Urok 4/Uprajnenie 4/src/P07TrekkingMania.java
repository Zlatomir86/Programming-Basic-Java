import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int allPeople = 0;
        int peopleMusala = 0;
        int peopleMonblan = 0;
        int peopleKilimanjaro = 0;
        int peopleK2 = 0;
        int peopleEverest = 0;

        for (int i = 1; i <= n; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            allPeople = allPeople + people;

            if (people <= 5) {
                peopleMusala = peopleMusala + people;

            } else if (people <= 12) {
                peopleMonblan = peopleMonblan + people;

            } else if (people <= 25) {
                peopleKilimanjaro = peopleKilimanjaro + people;

            } else if (people <= 40) {
                peopleK2 = peopleK2 + people;

            } else {
                peopleEverest = peopleEverest + people;

            }
        }
        double percentMusala = peopleMusala * 1.00 / allPeople * 100.00;
        double percentMonblan = peopleMonblan * 1.00 / allPeople * 100.00;
        double percentKilimanjaro = peopleKilimanjaro * 1.00 / allPeople * 100.00;
        double percentK2 = peopleK2 * 1.00 / allPeople * 100.00;
        double percentEverest = peopleEverest * 1.00 / allPeople * 100.00;

        System.out.printf("%.2f%% %n", percentMusala);
        System.out.printf("%.2f%% %n", percentMonblan);
        System.out.printf("%.2f%% %n", percentKilimanjaro);
        System.out.printf("%.2f%% %n", percentK2);
        System.out.printf("%.2f%% %n", percentEverest);
    }
}
