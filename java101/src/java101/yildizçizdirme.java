import java.util.Scanner;

//import java.util.Scanner;

/*
 *         1)en 4 boy 3 dikdörtgen yazdir    4) *****
 *              ****                             ***
 *              ****                              *
 *              ****
 *         2)*
 *           **
 *           ***
 *           ****
 *        3)  *                   5)         *
 *           ***                            **
 *          *****                          ***
 *                                        ****
 *      
 *      
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Soru1: ****
         * ****
         * ****
         * 
         * for (int i = 0; i < 3; i++) {
         * for (int j = 0; j < 4; j++) {
         * System.out.print("*");
         * }
         * System.out.println("");
         * }
         */
        /*
         * Soru2: *
         * **
         * ***
         * ****
         * int yildiz = 1;
         * for (int i = 0; i < 4; i++) {
         * for (int j = 0; j < yildiz; j++) {
         * System.out.print("*");
         * }
         * System.out.println("");
         * yildiz++;
         * }
         */
        Scanner scan = new Scanner(System.in);
        /*
         * Soru3-- *
         * ***
         * *****
         * int i, j;
         * int yildiz = 1;
         * System.out.println("satır gir: ");
         * int satir = scan.nextInt();
         * int bosluk = satir - 1;
         * for (i = 0; i < satir; i++) {
         * for (j = 0; j < bosluk; j++) {
         * System.out.print(" ");
         * }
         * for (j = 0; j < yildiz; j++) {
         * System.out.print("*");
         * }
         * System.out.println("");
         * yildiz = yildiz + 2;
         * bosluk--;
         * }
         */
        /*
         * Soru 4: *****
         * ***
         * *
         * int i, j;
         * 
         * System.out.println("satır gir: ");
         * int satir = scan.nextInt();
         * int bosluk = 0;
         * int yildiz = 2 * satir - 1;
         * for (i = 0; i < satir; i++) {
         * for (j = 0; j < bosluk; j++) {
         * System.out.print(" ");
         * }
         * for (j = 0; j < yildiz; j++) {
         * System.out.print("*");
         * }
         * 
         * System.out.println("");
         * yildiz = yildiz - 2;
         * bosluk++;
         * }
         */
        /*
         * Soru 5 *
         **
         ***
         */
        int i, j;
        int yildiz = 1;
        System.out.println("Satir gir: ");
        int satir = scan.nextInt();
        int bosluk = satir - 1;
        for (i = 0; i < satir; i++) {
            for (j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < yildiz; j++) {
                System.out.print("*");
            }
            System.out.println("");
            yildiz++;
            bosluk--;
        }
    }
}
