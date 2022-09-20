import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String kayWord = scanner.nextLine();

        int maxNum = Integer.MIN_VALUE;

        while (!kayWord.equals("Stop")) {
            int num = Integer.parseInt(kayWord);

            if (num > maxNum) {
                maxNum = num;
            }

            kayWord = scanner.nextLine();
        }

        System.out.println(maxNum);
    }
}
