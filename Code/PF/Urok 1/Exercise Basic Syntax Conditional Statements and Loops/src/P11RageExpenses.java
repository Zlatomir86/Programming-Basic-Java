import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int brokenHeadset = 0;
        int brokenMouse = 0;
        int brokenKeyboard = 0;
        int brokenDisplay = 0;

        for (int i = 1; i <= lostGameCount; i++) {
            if (i % 2 == 0) {
                brokenHeadset++;
            }

            if (i % 3 == 0) {
                brokenMouse++;
            }

            if (i % 6 == 0) {
                brokenKeyboard++;
            }

            if (i % 12 == 0) {
                brokenDisplay++;
            }
        }

        double totalPrice = brokenHeadset * headsetPrice + brokenMouse * mousePrice + brokenKeyboard * keyboardPrice + brokenDisplay * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
