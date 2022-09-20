import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();
        String pickedBook = scanner.nextLine();

        int check = 0;
        boolean favouriteBook = true;

        while (!wantedBook.equals(pickedBook)) {
            pickedBook = scanner.nextLine();
            check++;

            if (pickedBook.equals("No More Books")) {
                favouriteBook = false;
                break;

            }

        }

        if (favouriteBook) {
            System.out.printf("You checked %d books and found it.", check);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", check);
        }
    }
}
