import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());
        String exercise = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        int poorGradesCounter = 0;
        int exercisesDone = 0;
        double averageGrade = 0;
        boolean success = true;
        String last = " ";

        while (!exercise.equals("Enough")) {
            if (grade <= 4) {
                poorGradesCounter++;
                exercisesDone++;
                averageGrade = averageGrade + grade;

            } else {
                exercisesDone++;
                averageGrade = averageGrade + grade;
            }

            if (poorGradesCounter >= poorGrades) {
                success = false;
                break;
            }

            exercise = scanner.nextLine();

            if (!exercise.equals("Enough")) {
                last = exercise;
            }

            if (exercise.equals("Enough")) {
                continue;
            }
            grade = Integer.parseInt(scanner.nextLine());
        }

        averageGrade = averageGrade / exercisesDone;

        if (success) {
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n", exercisesDone);
            System.out.printf("Last problem: %s", last);
        } else {
            System.out.printf("You need a break, %d poor grades.", poorGradesCounter);
        }
    }
}
