import java.util.Scanner;

/*Java ile girilen sayının harmonik serisini bulan program yazacağız. */
public class App {
    /*
     * Ters Üçgen Çizdirme 10 satir
     * 
     * 
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Satir gir: ");
            int satir = scan.nextInt();
            int bosluk = 0;
            int yildiz = (2 * satir) - 1;
            int i, j;
            for (i = 0; i < satir; i++) {
                for (j = 0; j < bosluk; j++) {
                    System.out.print(" ");
                }
                for (j = 0; j < yildiz; j++) {
                    System.out.print("*");
                }
                System.out.println("");
                yildiz -= 2;
                bosluk++;
            }

        }

    }
}
