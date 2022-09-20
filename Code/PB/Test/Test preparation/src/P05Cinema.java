import java.util.Scanner;

public class P05Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int notPaintedPercent = Integer.parseInt(scanner.nextLine());
        String tired = scanner.nextLine();

        boolean ready = false;
        boolean tiredEnd = false;
        double allPaintArea = height * width * 4;
        double notPainted = allPaintArea - allPaintArea * notPaintedPercent / 100;

        while (!tired.equals("Tired!")) {
            int PaintLitters = Integer.parseInt(tired);

            notPainted = notPainted - PaintLitters;

            if (notPainted <= 0) {
                ready = true;
                break;
            }

            tired = scanner.nextLine();

            if (tired.equals("Tired!")) {
                tiredEnd = true;
            }
        }

        double remainder = Math.abs(notPainted);

        if (tiredEnd) {
            System.out.printf("%.0f quadratic m left.", notPainted);
        } else if (notPainted < 0 && ready) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", remainder);
        } else if (notPainted == 0 ) {
            System.out.println("All walls are painted! Great job, Pesho!" );
        }
    }
}
