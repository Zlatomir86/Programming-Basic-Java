import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y;
        double window = 1.5 * 1.5;
        double twoSides = 2 * sideWall - 2 * window;
        double backWall = x * x;
        double input = 1.2 * 2;
        double frontAndBack = 2 * backWall - input;
        double totalArea1 = twoSides + frontAndBack;
        double greenPaint = totalArea1 / 3.4;


        double twoRectangles = 2 * (x * y);
        double twoTriangles = 2 * (x * h / 2);
        double totalArea2 = twoRectangles + twoTriangles;
        double blackPaint = totalArea2 / 4.3;

        System.out.printf("%.2f %n", greenPaint);
        System.out.printf("%.2f", blackPaint);
    }
}
