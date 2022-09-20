import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String realPassword = "";
        int counter = 0;
        boolean blocked = false;


        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            realPassword = realPassword + symbol;


        }

        String password = scanner.nextLine();

        while (!password.equals(realPassword)) {
            counter++;
            System.out.println("Incorrect password. Try again.");
            if (counter == 3) {
                blocked = true;
                break;
            }

            password = scanner.nextLine();
        }

        if (blocked) {
            System.out.printf("User %s blocked!", username);

        } else {
            System.out.printf("User %s logged in.", username);

        }

    }
}
