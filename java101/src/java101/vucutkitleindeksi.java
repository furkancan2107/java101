import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Vücut Kitle İndeksi Hesaplama
         * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
         * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp
         * ekrana yazdırın.
         * 
         * Formül
         * Kilo (kg) / Boy(m) * Boy(m)
         * 
         * 
         * 
         */

        try (Scanner scan = new Scanner(System.in)) {
            scan.useLocale(Locale.US);
            double boy;
            int kilo;

            System.out.println("lutfen boyunuzu metre cinsinden giriniz: ");
            boy = scan.nextDouble();
            System.out.println("Lütfen kilonuzu kg cinsinden giriniz: ");
            kilo = scan.nextInt();
            double vkih = kilo / boy * boy;
            System.out.println("Vucut kitle indeksiniz: " + vkih);
        }

    }
}
