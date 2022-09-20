import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int allFans = Integer.parseInt(scanner.nextLine());

        double counterA = 0;
        double counterB = 0;
        double counterV = 0;
        double counterG = 0;

        for (int i = 1; i <= allFans; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case ("A"):
                    counterA++;
                    break;

                case ("B"):
                    counterB++;
                    break;

                case ("V"):
                    counterV++;
                    break;

                case ("G"):
                    counterG++;
                    break;
            }
        }

        double percentA = counterA / allFans * 100;
        double percentB = counterB / allFans * 100;
        double percentV = counterV / allFans * 100;
        double percentG = counterG / allFans * 100;

        double percentCapacity = allFans * 1.00 / stadiumCapacity * 100;

        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%", percentCapacity);
    }
}
