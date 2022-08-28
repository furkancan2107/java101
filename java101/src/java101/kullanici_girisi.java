
/**
 * KullanciGiris
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sifre = 1234;

        System.out.println("Sifre gir");
        int girilenSifre = scan.nextInt();

        if (sifre == girilenSifre) {
            System.out.println("giris yaptiniz");
        } else if (sifre != girilenSifre) {
            System.out.println(" sifre yanlis sifre sıfırlamak için 1'e tikla");
            Scanner input = new Scanner(System.in);
            int islem = input.nextInt();

            if (islem == 1) {
                Scanner y = new Scanner(System.in);
                System.out.println("Yeni sifre gir");
                int yeniSifre = y.nextInt();
                if (yeniSifre == sifre) {
                    System.out.println("aynisini girdin baska sifre gir");
                }
                if (yeniSifre != sifre) {
                    System.out.println("başarılı ");
                }
            } else {
                System.out.println("Cikis yapildi");
            }

        }

    }
}