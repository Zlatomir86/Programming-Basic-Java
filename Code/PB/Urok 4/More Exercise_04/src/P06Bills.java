import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mount = Integer.parseInt(scanner.nextLine());

        double allElectricityTaxes = 0;
        double waterTaxes = 0;
        double internetTaxes = 0;
        double allOtherTaxes = 0;
        double monthAverage = 0;

        for (int i = 1; i <= mount; i++) {
            double electricityTaxes = Double.parseDouble(scanner.nextLine());

            allElectricityTaxes = allElectricityTaxes + electricityTaxes;

            waterTaxes = mount * 20;
            internetTaxes = mount * 15;
            double otherTaxes = (electricityTaxes + 20 + 15) + (electricityTaxes + 20 + 15) * 0.20;

            allOtherTaxes = allOtherTaxes + otherTaxes;

            monthAverage = (allElectricityTaxes + waterTaxes + internetTaxes + allOtherTaxes) / mount;
        }

        System.out.printf("Electricity: %.2f lv%n", allElectricityTaxes);
        System.out.printf("Water: %.2f lv%n", waterTaxes);
        System.out.printf("Internet: %.2f lv%n", internetTaxes);
        System.out.printf("Other: %.2f lv%n", allOtherTaxes);
        System.out.printf("Average: %.2f lv", monthAverage);
    }
}
