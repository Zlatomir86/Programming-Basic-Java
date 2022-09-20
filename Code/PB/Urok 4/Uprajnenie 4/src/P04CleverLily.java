import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int age = Integer.parseInt(scanner.nextLine());
         double priceWashingMachine = Double.parseDouble(scanner.nextLine());
         int priceToys = Integer.parseInt(scanner.nextLine());

         double savingsMoney = 0;
         int toys = 0;
         double steal = 0;
         double allMoney = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0 ) {
                savingsMoney = savingsMoney + 10;
                allMoney = allMoney + savingsMoney;
                steal++;

            } else {
                toys++;
            }
        }

        double savingsToys = priceToys * toys;
        double totalPrice = (savingsToys + allMoney) - steal;

        if (totalPrice >= priceWashingMachine) {
            double remainder = totalPrice - priceWashingMachine;
            System.out.printf("Yes! %.2f", remainder);
        } else {
            double remainder = priceWashingMachine - totalPrice;
            System.out.printf("No! %.2f", remainder);
        }
    }
}
