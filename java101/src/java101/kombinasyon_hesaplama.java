import java.util.Scanner;

/*
    * N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.


    *   Java ile kombinasyon hesaplayan program yazınız.

    *   Kombinasyon formülü
    *   C(n,r) = n! / (r! * (n-r)!)
    * 
    */
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("n degerini gir: ");
            int n = scan.nextInt();
            System.out.println("r degerini gir: ");
            int r = scan.nextInt();

            while (true) {
                if (n < r) {
                    System.out.println("n degeri r'den buyuk olmasi lazim tekrar deneyin");
                    break;
                }
                int sayac = 1;
                int sayac2 = 1;
                int sayac3 = 1;
                for (int i = 1; i <= n; i++) {
                    sayac = sayac * i;
                }

                for (int j = 1; j <= r; j++) {
                    sayac2 = sayac2 * j;
                }

                for (int k = 1; k <= (n - r); k++) {
                    sayac3 = sayac3 * k;
                }

                int kombinasyon = sayac / (sayac2 * sayac3);
                System.out.println("Sonuc: " + kombinasyon);
                break;
            }

        }
    }
}
