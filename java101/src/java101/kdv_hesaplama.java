import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double tutar, kdvtutar, sonfiyat, kdvoran;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Lütfen tutar girin: ");
            tutar = scan.nextDouble();
        }

        kdvoran = 0.18;
        kdvtutar = tutar * kdvoran;
        sonfiyat = tutar + kdvtutar;
        if (tutar == 0 && tutar <= 1000) {
            kdvoran = 0.18;

        }
        if (tutar > 1000) {
            kdvoran = 0.08;
        }
        System.out.println("kdv tutariniz: " + kdvtutar);
        System.out.println("yeni fiyat: " + sonfiyat);

    }
}
