import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int dogs = Integer.parseInt(scanner.nextLine());
                int cats = Integer.parseInt(scanner.nextLine());

                double result = (dogs * 2.5) + (cats * 4.);

        System.out.println(result + " lv.");

    }
}
