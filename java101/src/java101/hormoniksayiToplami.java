import java.util.Scanner;

/*Java ile girilen sayının harmonik serisini bulan program yazacağız. */
public class App {
    public static void main(String[] args) throws Exception {
        try (

                Scanner scan = new Scanner(System.in)) {
            System.out.println("sayi gir: ");
            double sayi = scan.nextDouble();
            double toplam = 0;
            for (double i = 1; i <= sayi; i++) {
                toplam = toplam + 1 / i;

            }
            System.out.println(toplam);

        }
    }
}
