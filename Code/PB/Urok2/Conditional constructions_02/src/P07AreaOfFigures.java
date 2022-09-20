import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String variants = scanner.nextLine();

        if (variants.equals("square")) {
            double sideSquare = Double.parseDouble(scanner.nextLine());
            double areaSquare = sideSquare * sideSquare;
            System.out.printf("%.3f", areaSquare);
        } else if (variants.equals("rectangle")) {
            double sideRectangle1 = Double.parseDouble(scanner.nextLine());
            double sideRectangle2 = Double.parseDouble(scanner.nextLine());
            double areaRectangle = sideRectangle1 * sideRectangle2;
            System.out.printf("%.3f", areaRectangle);
        } else if (variants.equals("circle")) {
            double rCircle = Double.parseDouble(scanner.nextLine());
            double areaCircle = rCircle * rCircle * Math.PI;
            System.out.printf("%.3f", areaCircle);
        } else if (variants.equals("triangle")) {
            double sideTriangle = Double.parseDouble(scanner.nextLine());
            double hTriangle = Double.parseDouble(scanner.nextLine());
            double areaTriangle = (sideTriangle * hTriangle) / 2;
            System.out.printf("%.3f", areaTriangle);
        }
    }
}
