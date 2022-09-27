import java.util.Scanner;

public class App {
    // kalvyeden girilen 20 adet sayidan çift olanların toplamının tek olanlarının
    // toplamına oranı bul
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double sayi;
        double cToplam = 0;
        double tToplam = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println(i + 1 + " . sayiyi gir");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                cToplam = cToplam + sayi;
            } else {
                tToplam = tToplam + sayi;
            }
        }
        System.out.println("Cift Sayiların Toplami/Tek Sayiların toplami: " + cToplam / tToplam);

        scan.close();

    }
}
