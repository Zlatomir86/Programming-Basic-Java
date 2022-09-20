import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        
        int num1Number1 = num1 % 10;
        int num1Number2 = num1 / 10 % 10;
        int num1Number3 = num1 / 100 % 10;
        int num1Number4 = num1 / 1000 % 10;

        int num2Number1 = num2 % 10;
        int num2Number2 = num2 / 10 % 10;
        int num2Number3 = num2 / 100 % 10;
        int num2Number4 = num2 / 1000 % 10;

        for (int i = num1; i <= num2; i++) {
            boolean possible1 = false;
            boolean possible2 = false;
            boolean possible3 = false;
            boolean possible4 = false;
            boolean possible5 = false;

            int number1 = i % 10;
            int number2 = i / 10 % 10;
            int number3 = i / 100 % 10;
            int number4 = i / 1000 % 10;

            if (number1 >= num1Number1 && number1 <= num2Number1) {
                possible2 = true;
            }
            if (number2 >= num1Number2 && number2 <= num2Number2) {
                possible3 = true;
            }
            if (number3 >= num1Number3 && number3 <= num2Number3) {
                possible4 = true;
            }
            if (number4 >= num1Number4 && number4 <= num2Number4) {
                possible5 = true;
            }

            if (possible2 && possible3 && possible4 && possible5) {
                possible1 = true;
            }

            if (!(number1 % 2 == 0) && !(number2 % 2 == 0) && !(number3 % 2 == 0) && !(number4 % 2 == 0) && possible1) {
                System.out.print(i + " ");
            }
        }
    }
}
