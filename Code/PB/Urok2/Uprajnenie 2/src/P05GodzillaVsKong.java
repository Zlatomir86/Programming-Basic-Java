import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = movieBudget * 0.1;
        double allOutfitPrice = statists * outfitPrice;

        double totalOutfitPrice = 0;

        if (statists >= 150) {
            double sale = allOutfitPrice * 0.1;
            totalOutfitPrice = allOutfitPrice - sale;

        } else {
            totalOutfitPrice = allOutfitPrice;
        }

        double totalMoviePrice = decorPrice + totalOutfitPrice;

        if (movieBudget >= totalMoviePrice) {
            double remainder = movieBudget - totalMoviePrice;
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.", remainder);

        } else {
            double remainder = totalMoviePrice - movieBudget;
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", remainder);
        }

    }
}
