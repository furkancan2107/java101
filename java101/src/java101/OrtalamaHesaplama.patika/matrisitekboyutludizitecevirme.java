import java.util.Arrays;
import java.util.Scanner;

public class soru {
    // iki boyutu diziyi tek boyutlu diziye çeviren program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] dizi = new int[3][2];
        int[] tekboyutlu = new int[6];
        int i, j;
        int t = 0;
        int sayac = 0;
        for (i = 0; i < dizi.length; i++) {
            for (j = 0; j < dizi[i].length; j++) {
                // System.out.print("[" + i + "][" + j + "]: ");
                dizi[i][j] = sayac++;
                tekboyutlu[t] = dizi[i][j];
                t++;
            }

        }

        System.out.println(Arrays.toString(tekboyutlu));
        for (int[] a : dizi) {
            for (int b : a) {
                System.out.print(b + " ");
            }

            System.out.println();
        }

        scan.close();

    }

}
