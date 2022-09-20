import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double skumriqKg = Double.parseDouble(scanner.nextLine());
        double cacaKg = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int MidiKg = Integer.parseInt(scanner.nextLine());

        double palamudPrice = skumriqKg + skumriqKg * 0.60;
        double sumPalamud = palamudKg * palamudPrice;

        double safridPrice = cacaKg + cacaKg * 0.80;
        double sumSafrid = safridKg * safridPrice;

        double sumMidi = MidiKg * 7.5;

        double totalPrice = sumPalamud + sumSafrid + sumMidi;

        System.out.printf("%.2f", totalPrice);
    }
}
