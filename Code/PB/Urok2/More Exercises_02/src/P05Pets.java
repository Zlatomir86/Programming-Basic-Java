import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double foodDogKg = Double.parseDouble(scanner.nextLine());
        double foodCatKg = Double.parseDouble(scanner.nextLine());
        double foodTurtleGr = Double.parseDouble(scanner.nextLine());

        double neededFoodDog = days * foodDogKg;

        double neededFoodCat = days * foodCatKg;

        double foodTurtleKg = foodTurtleGr / 1000;
        double neededFoodTurtle = days * foodTurtleKg;

        double allFood = neededFoodDog + neededFoodCat + neededFoodTurtle;

        if (allFood <= foodKg) {
            double remainder = foodKg - allFood;
            System.out.printf("%.0f kilos of food left.", Math.floor(remainder));

        } else {
            double remainder = allFood - foodKg;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(remainder));
        }
    }
}
