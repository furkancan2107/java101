import java.util.Scanner;

public class App {
    // Mükemmel sayi mi kendi bölenlerin toplamı kendisine eşit olan sayı
    // örn 28, 1+2+4+7+14=28
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi girin: ");
        int sayi = scan.nextInt();
        int toplam = 0;
        scan.close();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        System.out.println(toplam);
        if (sayi == toplam) {
            System.out.println(sayi + " Mükemmel sayidir");
        } else {
            System.out.println("Mükemmel sayi degildir");
        }

    }
}
