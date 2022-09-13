import java.util.Scanner;

/*Kural:Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar N Sayısı:16 Çıktısı:16 11 6 1-4 1 6 11 16*/

public class App {

    static void sonuc(int sayi) {
        int son = sayi;
        System.out.print(sayi + ",");
        while (sayi > 0) {
            sayi -= 5;
            System.out.print(sayi + ",");
        }
        if (sayi > 0) {
            sayi -= 5;
            System.out.print(sayi + ",");
        }
        for (int i = sayi; i <= son; i++) {
            sayi += 5;
            System.out.print(sayi + ",");
            if (sayi == son) {

                break;
            }

        }

    }

    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Sayi gir: ");
            int sayi = scan.nextInt();
            sonuc(sayi);

        }
    }

}
