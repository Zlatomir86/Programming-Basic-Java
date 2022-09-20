import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password1 = scanner.nextLine();
        String password2 = scanner.nextLine();

        while (!password1.equals(password2)) {
            password2 = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", username);
    }
}
