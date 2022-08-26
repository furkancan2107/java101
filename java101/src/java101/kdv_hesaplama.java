import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double tutar, kdvtutar, sonfiyat, kdvoran;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Lütfen tutar girin: ");
            tutar = scan.nextDouble();
        }

        if (tutar == 0 && tutar <= 1000) {
         kdvoran = 0.18;
        kdvtutar = tutar * kdvoran;
        sonfiyat = tutar + kdvtutar;
          System.out.println("kdv tutariniz: " + kdvtutar);
        System.out.println("yeni fiyat: " + sonfiyat);

        }
        if (tutar > 1000) {
         kdvoran = 0.08
        kdvtutar = tutar * kdvoran;
        sonfiyat = tutar + kdvtutar;
            System.out.println("kdv tutariniz: " + kdvtutar);
        System.out.println("yeni fiyat: " + sonfiyat);
        }
        

    }
}
