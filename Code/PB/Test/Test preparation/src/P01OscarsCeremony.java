import java.util.Scanner;

public class P01OscarsCeremony {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statuettes = rent - rent * 0.30;
        double catering = statuettes - statuettes * 0.15;
        double voicing = catering / 2;

        double expenses = rent + statuettes + catering + voicing;

        System.out.printf("%.2f", expenses);
    }
}
