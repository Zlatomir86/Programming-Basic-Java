import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int overnightStay = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50;
            apartmentPrice = 65;

            if (overnightStay > 7 && overnightStay < 14) {
                studioPrice = studioPrice - studioPrice * 0.05;

            } else if (overnightStay > 14) {
                studioPrice = studioPrice - studioPrice * 0.30;
            }

            if (overnightStay > 14) {
                apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
            }

        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20;
            apartmentPrice = 68.70;

            if (overnightStay > 14) {
                studioPrice = studioPrice - studioPrice * 0.20;
            }

            if (overnightStay > 14) {
                apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
            }

        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76;
            apartmentPrice = 77;

            if (overnightStay > 14) {
                apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
            }
        }

        double totalPriceStudio = overnightStay * studioPrice;
        double totalPriceApartment = overnightStay * apartmentPrice;

        System.out.printf("Apartment: %.2f lv. %n", totalPriceApartment);
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);
    }
}
