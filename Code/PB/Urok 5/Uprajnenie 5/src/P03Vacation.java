import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double startedMoney = Double.parseDouble(scanner.nextLine());

        int spendDays = 0;
        int allDays = 0;
        boolean spend = true;
        double totalMoney = 0;
        totalMoney = startedMoney;

        while (!(totalMoney >= neededMoney)) {
            String spendOrSave = scanner.nextLine();
            double spendOrSaveMoney = Double.parseDouble(scanner.nextLine());

            allDays++;

            if (spendOrSave.equals("spend")) {
                totalMoney = totalMoney - spendOrSaveMoney;

                if (totalMoney < 0) {
                    totalMoney = 0;
                }

                spendDays++;

            } else if (spendOrSave.equals("save")) {
                totalMoney = totalMoney + spendOrSaveMoney;
                spendDays = 0;
            }

            if (spendDays >= 5) {
                spend = false;
                break;
            }
        }

        if (spend) {
            System.out.printf("You saved the money for %d days.", allDays);

        } else {
            System.out.println("You can't save the money.");
            System.out.printf("%d", allDays);
        }

    }
}
