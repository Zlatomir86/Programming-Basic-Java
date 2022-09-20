import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         int a = Integer.parseInt(scanner.nextLine());
         int b = Integer.parseInt(scanner.nextLine());
         int c = Integer.parseInt(scanner.nextLine());
         double percent = Double.parseDouble(scanner.nextLine());

         double V = a * b * c;
         double VL = V / 1000;

         double percent1 = percent / 100;

         double L = VL * (1 - percent1);

        System.out.println(L);


    }
}
