import java.util.Scanner;

public class P06Substitute {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = k; i <= 8; i++) {
            if (i % 2 != 0) {
                continue;
            }
            for (int j = 9; j >= l; j--) {
                if (j % 2 == 0) {
                    continue;
                }
                for (int o = m; o <= 8; o++) {
                    if (o % 2 != 0) {
                        continue;
                    }
                    for (int p = 9; p >= n; p--) {
                        if (p % 2 == 0) {
                            continue;
                        }

                        if (counter == 6) {
                            break;
                        }

                        if (i == o && j == p) {
                            System.out.println("Cannot change the same player.");
                        } else {
                            counter++;
                            System.out.printf("%d%d - %d%d%n", i, j, o, p);
                        }
                    }
                    if (counter == 6) {
                        break;
                    }
                }
                if (counter == 6) {
                    break;
                }
            }
            if (counter == 6) {
                break;
            }
        }
    }
}
