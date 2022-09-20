import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int vegetablesKg = Integer.parseInt(scanner.nextLine());
        int fruitsKg = Integer.parseInt(scanner.nextLine());

        double result1 = vegetablesPrice * vegetablesKg;
        double result2 = fruitsPrice * fruitsKg;

        double result3 = result1 + result2;

        double result4 = result3 / 1.94;

        System.out.printf("%.2f",result4);

    }
}
