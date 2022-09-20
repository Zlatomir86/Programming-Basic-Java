import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int peaces = width * length;
        boolean noMore = false;

        String stop = scanner.nextLine();
        int eatenPeaces = Integer.parseInt(stop);

        while (!stop.equals("STOP")) {
            peaces = peaces - eatenPeaces;

            if (peaces < 0) {
                noMore = true;
                break;
            }

            stop = scanner.nextLine();
            if (!stop.equals("STOP")) {
                eatenPeaces = Integer.parseInt(stop);
            }

        }

        if (!noMore) {
            System.out.printf("%d pieces are left.", peaces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(peaces));
        }
    }
}
