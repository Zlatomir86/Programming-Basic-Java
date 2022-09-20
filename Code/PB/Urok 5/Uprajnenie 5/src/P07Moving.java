import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int space = length * width * height;
        int spaceCarton = 0;
        boolean enoughSpace = true;

        String done = scanner.nextLine();
        int carton = Integer.parseInt(done);

        while (!done.equals("Done")) {
            spaceCarton = spaceCarton + carton;

            if (space < spaceCarton) {
                enoughSpace = false;
                break;
            }

            done = scanner.nextLine();
            if (done.equals("Done")) {
                break;
            } else {
                carton = Integer.parseInt(done);
            }
        }

        int remainder = spaceCarton - space;

        if (enoughSpace) {
            System.out.printf("%d Cubic meters left.", Math.abs(remainder));
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(remainder));
        }
    }
}
