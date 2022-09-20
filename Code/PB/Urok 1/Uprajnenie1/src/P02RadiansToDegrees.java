import java.util.Scanner;

public class P02RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());
        double grad = rad * 180 / Math.PI;

        System.out.println(grad);
    }
}
