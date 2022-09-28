//import java.util.Scanner;

public class App {
    // 1-100 arasindaki cift sayilarin toplami mükkemel mi
    // Mükemmel sayi mi kendi bölenlerin toplamı kendisine eşit olan sayı
    // örn 28, 1+2+4+7+14=28
    public static void main(String[] args) throws Exception {
        int toplam = 0;
        int mukkemelMi = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
        System.out.println(toplam);
        for (int j = 1; j < toplam; j++) {
            if (toplam % j == 0) {
                mukkemelMi += j;
            }
        }
        if (mukkemelMi == toplam) {
            System.out.println("1 ile 100 arasindaki cift sayilar  toplami mükemmel sayidir");

        } else {

            System.out.println("1 ile 100 arasindaki cift sayilar  toplami mükemmel sayi degildir");

        }
    }
}
