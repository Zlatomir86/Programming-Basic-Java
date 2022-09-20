public class P04NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {

        boolean divisibleBy3 = false;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                divisibleBy3 = true;
            }

            if (divisibleBy3) {
                System.out.println(i);
            }

            divisibleBy3 = false;
        }
    }
}
