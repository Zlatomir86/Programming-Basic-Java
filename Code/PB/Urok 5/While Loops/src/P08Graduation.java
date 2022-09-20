import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        boolean isExcluded = false;
        double totalSchoolGrade = 0;
        int grade = 1;
        int poorGradeCount = 0;

        while (grade <= 12) {
            if (poorGradeCount > 1) {
                isExcluded = true;
                break;
            }

            double schoolGrade = Double.parseDouble(scanner.nextLine());

            if (schoolGrade < 4) {
                poorGradeCount++;
                continue;
            }

            totalSchoolGrade = totalSchoolGrade + schoolGrade;

            grade++;

        }
        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        } else {
            double average = totalSchoolGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
