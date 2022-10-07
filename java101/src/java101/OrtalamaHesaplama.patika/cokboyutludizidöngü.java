import java.util.Scanner;
/*   Çıktısı 10 8 6 4
 *           20 17 14 11
 *           30 26 22 18
 *           40 35 30 25     olan diziyi yaz 
 *           .
 *           .
 *           .
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Satir gir: ");
        int satir = scan.nextInt();
        int ilk = 10;
        int fark = 2;
        int dizi[][] = new int[satir][4];
        for (int i = 0; i < dizi.length; i++) {
            int a = ilk;
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = a;
                a = a - fark;

            }
            fark++;
            ilk = ilk + 10;
        }
        for (int[] a : dizi) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
