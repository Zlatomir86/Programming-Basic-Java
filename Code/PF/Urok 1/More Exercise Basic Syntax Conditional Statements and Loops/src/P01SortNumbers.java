import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mid = 0;

        if (max < num1) {
            max = num1;
        }

        if (max < num2) {
            max = num2;
        }

        if (max < num3) {
            max = num3;
        }


        if (min > num1) {
            min = num1;
        }

        if (min > num2) {
            min = num2;
        }

        if (min > num3) {
            min = num3;
        }


        if (max > num1 && min < num1) {
            mid = num1;
        }

        if (max > num2 && min < num2) {
            mid = num2;
        }

        if (max > num3 && min < num3) {
            mid = num3;
        }




        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
}
