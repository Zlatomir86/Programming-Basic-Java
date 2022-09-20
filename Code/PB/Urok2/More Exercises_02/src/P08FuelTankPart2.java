import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double fuelAmount = Double.parseDouble(scanner.nextLine());
        String sale = scanner.nextLine();

        switch (fuel) {

            case "Gas" :
                if (sale.equals("Yes")) {
                    double discount = fuelAmount * 0.85;

                    double totalPrice = 0;

                    if (fuelAmount > 25) {
                        totalPrice = discount - discount * 0.10;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else if (fuelAmount >=20) {
                        totalPrice = discount - discount *0.08;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else {
                        totalPrice = discount;

                        System.out.printf("%.2f lv.", discount);
                    }

                } else if (sale.equals("No")) {
                    double discount = fuelAmount * 0.93;

                    double totalPrice = 0;

                    if (fuelAmount > 25) {
                        totalPrice = discount - discount * 0.10;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else if (fuelAmount >= 20) {
                        totalPrice = discount - discount * 0.08;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else {
                        totalPrice = discount;

                        System.out.printf("%.2f lv.", discount);
                    }
                }
                break;

            case "Gasoline" :
                if (sale.equals("Yes")) {
                    double discount = fuelAmount * 2.04;

                    double totalPrice = 0;

                    if (fuelAmount > 25) {
                        totalPrice = discount - discount * 0.10;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else if (fuelAmount >=20) {
                        totalPrice = discount - discount *0.08;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else {
                        totalPrice = discount;

                        System.out.printf("%.2f lv.", discount);
                    }

                } else if (sale.equals("No")) {
                    double discount = fuelAmount * 2.22;

                    double totalPrice = 0;

                    if (fuelAmount > 25) {
                        totalPrice = discount - discount * 0.10;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else if (fuelAmount >= 20) {
                        totalPrice = discount - discount * 0.08;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else {
                        totalPrice = discount;

                        System.out.printf("%.2f lv.", discount);
                    }
                }
                break;

            case "Diesel" :
                if (sale.equals("Yes")) {
                    double discount = fuelAmount * 2.21;

                    double totalPrice = 0;

                    if (fuelAmount > 25) {
                        totalPrice = discount - discount * 0.10;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else if (fuelAmount >=20) {
                        totalPrice = discount - discount *0.08;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else {
                        totalPrice = discount;

                        System.out.printf("%.2f lv.", discount);
                    }

                } else if (sale.equals("No")) {
                    double discount = fuelAmount * 2.33;

                    double totalPrice = 0;

                    if (fuelAmount > 25) {
                        totalPrice = discount - discount * 0.10;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else if (fuelAmount >= 20) {
                        totalPrice = discount - discount * 0.08;

                        System.out.printf("%.2f lv.", totalPrice);

                    } else {
                        totalPrice = discount;

                        System.out.printf("%.2f lv.", discount);
                    }
                }
                break;
        }
    }
}
