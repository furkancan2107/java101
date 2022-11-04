import java.util.Scanner;

public class App {
    //İçi Boş Üçgen Çizdirme

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Satir gir: ");

        int satir = scan.nextInt();
        int bosluk1 = satir - 1;
        int bosluk2 = 0;
        int yildiz = 1;
        int yildiz2 = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < satir; i++) {
            for (j = 0; j < bosluk1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < yildiz; j++) {
                System.out.print("*");
            }
            for (j = 0; j < bosluk2; j++) {
                if (bosluk2 < (2 * satir) - 3) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (j = 0; j < yildiz2; j++) {
                System.out.print("*");
            }
            System.out.println();
            yildiz2 = 1;

            bosluk2 += 2;

            bosluk1--;
        }

    }

}
