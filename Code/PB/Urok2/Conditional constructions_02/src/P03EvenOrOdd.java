import java.util.Scanner;

public class P03EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        double b = a % 2;

        if (b == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
