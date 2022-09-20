import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stop = scanner.nextLine();
        int primeNumSum = 0;
        int nonPrimeNumSum = 0;

        while (!stop.equals("stop")) {
            int num = Integer.parseInt(stop);

            if (num < 0) {
                System.out.println("Number is negative.");
                stop = scanner.nextLine();
                continue;
            }

            int counter = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                primeNumSum = primeNumSum + num;

            } else {
                nonPrimeNumSum = nonPrimeNumSum + num;
            }

            stop = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeNumSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeNumSum);
    }
}
