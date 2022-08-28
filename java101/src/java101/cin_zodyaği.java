import java.util.Scanner;

public class App {
    /*
     * Çin Zodyağı nedir?
     * 
     * 4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve
     * insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun
     * eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve
     * yıldızlarla pek bir ilgisi yoktur.
     * 
     * Çin Zodyağı nasıl hesaplanır?
     * 
     * Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre
     * bulunur.
     * 
     * Doğum Tarihi %12 = 0 ➜ Maymun
     * 
     * Doğum Tarihi %12 = 1 ➜ Horoz
     * 
     * Doğum Tarihi %12 = 2 ➜ Köpek
     * 
     * Doğum Tarihi %12 = 3 ➜ Domuz
     * 
     * Doğum Tarihi %12 = 4 ➜ Fare
     * 
     * Doğum Tarihi %12 = 5 ➜ Öküz
     * 
     * Doğum Tarihi %12 = 6 ➜ Kaplan
     * 
     * Doğum Tarihi %12 = 7 ➜ Tavşan
     * 
     * Doğum Tarihi %12 = 8 ➜ Ejderha
     * 
     * Doğum Tarihi %12 = 9 ➜ Yılan
     * 
     * Doğum Tarihi %12 = 10 ➜ At
     * 
     * Doğum Tarihi %12 = 11 ➜ Koyun
     * 
     * Senaryo
     * 
     * Doğum Yılınızı Giriniz : 1990
     * Çin Zodyağı Burcunuz : At
     * 
     * 
     * 
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("kral dogum yilini gir: ");
        int yil = scan.nextInt();
        int kalan = yil % 12;
        if (kalan == 0) {
            System.out.println("Çin Zodyağı: Maymun");
        }
        if (kalan == 1) {
            System.out.println("Çin Zodyağı: Horoz");
        }
        if (kalan == 2) {
            System.out.println("Çin Zodyağı: Köpek");
        }
        if (kalan == 3) {
            System.out.println("Çin Zodyağı: Domuz");
        }
        if (kalan == 4) {
            System.out.println("Çin Zodyağı: Fare");
        }
        if (kalan == 5) {
            System.out.println("Çin Zodyağı: Öküz");
        }
        if (kalan == 6) {
            System.out.println("Çin Zodyağı: Kaplan");
        }
        if (kalan == 7) {
            System.out.println("Çin Zodyağı: Tavşan");
        }
        if (kalan == 8) {
            System.out.println("Çin Zodyağı: Ejdarha");
        }
        if (kalan == 9) {
            System.out.println("Çin Zodyağı: Yılan");
        }
        if (kalan == 10) {
            System.out.println("Çin Zodyağı: At");
        }
        if (kalan == 11) {
            System.out.println("Çin Zodyağı: Koyun");
        }

    }
}
