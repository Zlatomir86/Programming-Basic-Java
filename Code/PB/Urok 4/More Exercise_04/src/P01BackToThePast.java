import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int liveYear = Integer.parseInt(scanner.nextLine());

        int age = 19;

        for (int i = 1800; i <= liveYear; i++) {
            if (i % 2 == 0) {
                inheritedMoney = inheritedMoney - 12000;

            } else {
                inheritedMoney = inheritedMoney - (12000 + age * 50);
                age = age + 2;

            }

        }

        if (inheritedMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritedMoney));
        }
    }
}
