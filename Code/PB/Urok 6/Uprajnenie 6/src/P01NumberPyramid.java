import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean stop = false;

        int num = 1;
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (num > n) {
                    stop = true;
                    break;
                }
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            if (stop) {
                break;
            }
        }
    }
}
