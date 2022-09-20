import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int levels = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int l = levels; l >= 1; l--) {
            for (int r = 0; r < rooms; r++) {
                if (l == levels){
                    System.out.printf("L%d%d ", l, r);
                } else if (l % 2 == 0) {
                    System.out.printf("O%d%d ", l, r);
                } else {
                    System.out.printf("A%d%d ", l, r);
                }
            }
            System.out.println();
        }
    }
}
