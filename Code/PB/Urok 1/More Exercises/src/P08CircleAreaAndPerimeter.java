import java.util.Scanner;

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double calculatedArea = (r * r) * Math.PI;
        double calculatedPerimeter = 2 * (r * Math.PI);

        System.out.printf("%.2f %n", calculatedArea);
        System.out.printf("%.2f", calculatedPerimeter);
    }
}
