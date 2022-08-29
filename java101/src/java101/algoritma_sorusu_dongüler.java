import java.util.Scanner;

/*
 * Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

  Ödev
  Java döngüler ile negatif bir sayı girilene kadar
   kullanıcıdan girişleri kabul eden ve girilen değerlerden
    çift ve 4'ün katları olan sayıları toplayıp 
    ekrana basan programı yazıyoruz.
 */
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            boolean sayiPozitifMi = true;
            int toplam = 0;
            while (sayiPozitifMi) {

                System.out.println("Sayi girin: ");
                int sayi = scan.nextInt();
                if (sayi % 2 == 0 && sayi % 4 == 0) {
                    toplam = toplam + sayi;
                }

                if (sayi < 0) {
                    sayiPozitifMi = false;
                }

            }
            System.out.println("Toplam: " + toplam);
        }
    }
}
