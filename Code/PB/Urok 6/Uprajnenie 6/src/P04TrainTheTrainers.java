import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int judge = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();

        int counter = 0;
        double allGrade = 0;

        while (!presentation.equals("Finish")) {
            double totalGrade = 0;
            for (int i = 1; i <= judge; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                counter++;
                totalGrade = totalGrade + grade;
                allGrade = allGrade + grade;
            }

            double averagePresentationGrade = totalGrade / judge;

            System.out.printf("%s - %.2f.%n", presentation, averagePresentationGrade);

            presentation = scanner.nextLine();
        }
        double averageGrade = allGrade / counter;

        System.out.printf("Student's final assessment is %.2f.", averageGrade);
    }
}
