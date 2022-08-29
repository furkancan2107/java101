import java.util.Scanner;

/*Java ile girilen sayının harmonik serisini bulan program yazacağız. */
public class App {
    /*                                                 
                                                 *
                                                ***
                                               *****
                                              *******
                                             *********
                                              *******
                                               *****
                                                ***
                                                 *
     */
    public static void main(String[] args) throws Exception {
        int satir1 = 5;
        int bosluk1 = satir1 - 1;
        int yildiz = 1;
        int i, j;
        for (i = 0; i < satir1; i++) {
            for (j = 0; j < bosluk1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < yildiz; j++) {
                System.out.print("*");
            }
            System.out.println("");
            yildiz += 2;
            bosluk1--;
        }
        yildiz -= 4;
        bosluk1 = 1;

        for (i = 0; i < satir1; i++) {
            for (j = 0; j < bosluk1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < yildiz; j++) {
                System.out.print("*");
            }
            System.out.println("");
            yildiz -= 2;
            bosluk1++;
        }
      

    }
}
