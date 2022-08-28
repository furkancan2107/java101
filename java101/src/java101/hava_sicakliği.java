
/**
 * KullanciGiris
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hava sicakliğini 0-50 arasinda gir: ");
        int sicaklik = scan.nextInt();

        while (true) {
            if (sicaklik < 5 && sicaklik >= 0) {
                System.out.println("Kayak yap");
                break;
            }
            if (sicaklik >= 5 && sicaklik < 15) {
                System.out.println("sinemaya git");
                break;
            }
            if (sicaklik >= 15 && sicaklik < 25) {
                System.out.println("Piknik yap");
                break;
            }
            if (sicaklik >= 25 && sicaklik <= 50) {
                System.out.println("Yüz");
                break;
            } else {
                System.out.println("Lütfen 0 ile 50 arasinda sicaklik gir");
                break;
            }

        }

    }
}