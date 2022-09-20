import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String kayWord = scanner.nextLine();

        int minNum = Integer.MAX_VALUE;

        while (!kayWord.equals("Stop")) {
            int num = Integer.parseInt(kayWord);

            if (num < minNum) {
                minNum = num;
            }
            kayWord = scanner.nextLine();
        }

        System.out.println(minNum);
    }
}
