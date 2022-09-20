import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vineyard = Integer.parseInt(scanner.nextLine());
        double grapes = Double.parseDouble(scanner.nextLine());
        int vine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double allGrapes = vineyard * grapes;
        double allVine = 0.4 * allGrapes / 2.5;

        if (allVine >= vine) {
            double litersRemainder = allVine - vine;
            double litersPerPerson = litersRemainder / workers;

            double allVineDown = Math.floor(allVine);
            double litersRemainderUp = Math.ceil(litersRemainder);
            double litersPerPersonUp = Math.ceil(litersPerPerson);

            int allVineDownInt = (int)allVineDown;
            int litersRemainderUpInt = (int)litersRemainderUp;
            int litersPerPersonUpInt = (int)litersPerPersonUp;

            System.out.printf("Good harvest this year! Total wine: %d liters. %n", allVineDownInt);
            System.out.printf("%d liters left -> %d liters per person.", litersRemainderUpInt, litersPerPersonUpInt);
        } else {
            double a = vine - allVine;
            double aDown = Math.floor(a);

            int aDownInt = (int)aDown;

            System.out.printf("It will be a tough winter! More %d liters wine needed.", aDownInt);
        }
    }
}
