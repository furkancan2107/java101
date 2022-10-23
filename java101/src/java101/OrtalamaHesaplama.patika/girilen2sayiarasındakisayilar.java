import java.util.Scanner;

public class App {
    // klavyeden girilen 2 sayı arasinaki sayiları yazdıran program
    public static void main(String[] args) throws Exception {
        /*
         * Oyun oyun = new Oyun();
         * oyun.start();
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("sayi 1 gir: ");
        int sayi1 = scan.nextInt();
        System.out.print("sayi 2 gir: ");
        int sayi2 = scan.nextInt();
        int bSayi;
        int kSayi;
        while (true) {
            if (sayi1 > sayi2) {
                bSayi = sayi1;
                kSayi = sayi2;
            } else {
                bSayi = sayi2;
                kSayi = sayi1;
            }

            while (bSayi >= kSayi) {

                System.out.println(bSayi);
                bSayi--;
            }
            break;
        }

    }
}
