import java.util.Scanner;

/*
 * 
Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
 * 
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        try (

                Scanner scan = new Scanner(System.in)) {
            System.out.println("sayi gir: ");
            int sayi = scan.nextInt();
            int rakam;
            int üs;
            int number = sayi;
            int basamakSayisi = 0;
            int toplam = 0;
            while (number > 0) {
                number /= 10;
                basamakSayisi++;
            }
            number = sayi;
            while (number > 0) {
                rakam = number % 10;
                üs = 1;
                for (int i = 1; i <= basamakSayisi; i++) {
                    üs = rakam * üs;

                }
                toplam = toplam + üs;
                number /= 10;
            }
            if (toplam == sayi) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
    }
}
