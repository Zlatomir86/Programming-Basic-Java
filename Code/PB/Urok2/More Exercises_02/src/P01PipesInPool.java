import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vPool = Integer.parseInt(scanner.nextLine());
        int firstPipe = Integer.parseInt(scanner.nextLine());
        int secondPipe = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double firstPipeWork = firstPipe * hours;
        double secondPipeWork = secondPipe * hours;
        double allWork = firstPipeWork + secondPipeWork;

        if (allWork <= vPool) {
            double percent1 = (allWork * 100.00) / vPool;
            double percent2 = (firstPipeWork * 100.00) / allWork;
            double percent3 = (secondPipeWork * 100.00) / allWork;
            System.out.printf("The pool is %.2f%% full.Pipe 1: %.2f%%. Pipe 2: %.2f%%.",percent1, percent2, percent3);

        } else {
            double litersOverflow = allWork - vPool;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hours,litersOverflow);
        }
    }
}
