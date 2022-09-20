import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;
        boolean goHome = true;
        boolean success = false;

        while (totalSteps < 10000) {
            String home = scanner.nextLine();

            if (home.equals("Going home")) {
                goHome = false;
                int moreSteps = Integer.parseInt(scanner.nextLine());
                totalSteps = totalSteps + moreSteps;
                if (totalSteps >= 10000) {
                    success = true;
                }
                break;
            }

            int steps = Integer.parseInt(home);

            totalSteps = totalSteps + steps;

        }

        int remainder = totalSteps - 10000;

        if (goHome) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", remainder);
        } else {
            if (success) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", Math.abs(remainder));
            } else {
                System.out.printf("%d more steps to reach goal.", Math.abs(remainder));
            }

        }
    }
}
