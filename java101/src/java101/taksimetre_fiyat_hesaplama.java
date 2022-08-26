import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Km girin: ");
            double km = scan.nextDouble();
            int mintutar = 20;
            double fiyat = 10 + (km * 2.20);
            fiyat = fiyat <= mintutar ? 20 : fiyat;
            System.out.println("Fiyat: " + fiyat);

        }

    }
}
