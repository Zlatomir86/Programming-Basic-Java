import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int day = 0;
        int examinedPatient = 0;
        int unexaminedPatient = 0;
        int doctor = 7;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && unexaminedPatient > examinedPatient) {
                doctor = doctor + 1;
            }

            day = patients - doctor;

            if (day <= 0) {
                examinedPatient = examinedPatient + (day + doctor);

            } else {
                unexaminedPatient = unexaminedPatient + day;
                examinedPatient = examinedPatient + doctor;
            }

        }
        System.out.printf("Treated patients: %d. %n", examinedPatient);
        System.out.printf("Untreated patients: %d.", unexaminedPatient);
    }
}
