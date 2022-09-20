import java.util.Scanner;

public class P10WeatherForecastPart2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double degree = Double.parseDouble(scanner.nextLine());

        if (degree <= 35.00 && degree >= 26.00) {
            System.out.println("Hot");
        }
        else if (degree <= 25.9 && degree >= 20.1) {
            System.out.println("Warm");
        }
        else if (degree <= 20.00 && degree >= 15.00) {
            System.out.println("Mild");
        }
        else if (degree <= 14.9 && degree >= 12.00) {
            System.out.println("Cool");
        }
        else if (degree <= 11.9 && degree >= 5.00) {
            System.out.println("Cold");
        }
        else {
            System.out.println("unknown");
        }
    }
}
