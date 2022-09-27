import java.util.Scanner;

public class App {
    // klavyeden girilen 25 adet sayi içerisinde negatif sayi toplami,pozitif sayi
    // toplami
    // 7 ye eşit olan sayinin adet sayisini yazdir
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int sayi;
        int sayac = 0;
        int nToplam = 0;
        int pToplam = 0;

        for (int i = 0; i < 25; i++) {
            System.out.println(i + 1 + ". sayiyi gir");
            sayi = scan.nextInt();
            if (sayi == 7) {
                sayac++;
            }
            if (sayi < 0) {
                nToplam = nToplam + sayi;
            } else {
                pToplam = pToplam + sayi;
            }

        }
        System.out.println("Negatif sayilarin Toplami: " + nToplam);
        System.out.println("Pozitif sayilarin Toplami: " + pToplam);
        System.out.println("kaç defa 7 sayisi geçti: " + sayac);

        scan.close();

    }
}
