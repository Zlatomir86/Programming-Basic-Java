import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double hWithoutCorridor = h - 1;
        double hRow = hWithoutCorridor % 0.70;
        double hRow1 = hWithoutCorridor - hRow;
        double hRow2 = hRow1 / 0.70;


        double wRow = w % 1.20;
        double wRow1 = w - wRow;
        double wRow2 = wRow1 / 1.20;

        double alldesks = hRow2 * wRow2 - 3;

        System.out.println(alldesks);
    }
}
