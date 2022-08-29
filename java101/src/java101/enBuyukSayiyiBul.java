import java.util.Scanner;

/*Java ile girilen sayının harmonik serisini bulan program yazacağız. */
public class App {
    /*
     * Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük
     * sayıları bulan ve bu sayıları ekrana yazan programı yazın.
     * 
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        int uzunluk = scan.nextInt();
        int max = 0, min = 0;
        for (int i = 1; i <= uzunluk; i++) {
            System.out.println("sayi giriniz: ");
            int sayi = scan.nextInt();

            if (i == 1) {
                max = sayi;
                min = sayi;
            }

            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("En Kucuk Sayi: " + min);
        System.out.println("En Buyuk Sayi: " + max);

    }
}
