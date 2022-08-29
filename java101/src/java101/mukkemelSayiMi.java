import java.util.Scanner;

/*Java ile girilen sayının harmonik serisini bulan program yazacağız. */
public class App {
    /*
     * 
     * Mükemmel Sayı Nedir ?
     * Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen
     * sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Sayi gir: ");
            int sayi = scan.nextInt();
            int i;
            int toplam = 0;
            for (i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam = toplam + i;
                }
            }
            System.out.println("Rakamlar Toplami: " + toplam);
            if (toplam == sayi) {
                System.out.println(sayi + " bir mukkemmel sayidir");
            } else {
                System.out.println(sayi + " mukkemmel sayi değildir");
            }

        }

    }
}
