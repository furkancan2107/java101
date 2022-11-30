import java.util.Arrays;
import java.util.Scanner;

public class soru {
    // iki 3*3 matrisin toplamı olarak yeni bir matris programla
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] dizi1 = { { 1, 2, 3, }, { 4, 5, 6, }, { 7, 8, 9 } };
        int[][] dizi2 = { { 3, 2, 7, }, { 8, 2, 9, }, { 4, 5, 6 } };

        int[][] dizi3 = new int[3][3];
        for (int i = 0; i < dizi3.length; i++) {
            for (int j = 0; j < dizi3[i].length; j++) {
                dizi3[i][j] = dizi1[i][j] + dizi2[i][j];

            }
        }
        for (int[] a : dizi3) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        scan.close();

    }

}
