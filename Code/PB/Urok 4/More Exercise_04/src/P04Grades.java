import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int students1 = 0;
        int students2 = 0;
        int students3 = 0;
        int students4 = 0;

        double percent1 = 0;
        double percent2 = 0;
        double percent3 = 0;
        double percent4 = 0;

        double average = 0;
        double averagePercent = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            average = average + grade;

            if (grade >= 5 && grade <= 6) {
                students1++;
            } else if (grade >= 4) {
                students2++;
            } else if (grade >= 3) {
                students3++;
            } else if (grade < 3) {
                students4++;
            }
        }

        percent1 = students1 * 1.0 / students * 100;
        percent2 = students2 * 1.0 / students * 100;
        percent3 = students3 * 1.0 / students * 100;
        percent4 = students4 * 1.0 / students * 100;

        averagePercent = average / students;

        System.out.printf("Top students: %.2f%% %n", percent1);
        System.out.printf("Between 4.00 and 4.99: %.2f%% %n", percent2);
        System.out.printf("Between 3.00 and 3.99: %.2f%% %n", percent3);
        System.out.printf("Fail: %.2f%% %n", percent4);
        System.out.printf("Average: %.2f", averagePercent);
    }
}
