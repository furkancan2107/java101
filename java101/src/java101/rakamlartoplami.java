import java.util.Scanner;

/*Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14 */

public class App {
    public static void main(String[] args) throws Exception {
        try (
                Scanner scan = new Scanner(System.in)) {
            System.out.println("sayi gir: ");
            int sayi = scan.nextInt();
            int rakam;
            int total = 0;
            while (sayi > 0) {
                rakam = sayi % 10;
                sayi = sayi / 10;

                total = rakam + total;
            }
            System.out.println(total);
        }
    }
}
