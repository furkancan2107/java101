import java.util.Scanner;

public class soru {
    // klavyeden girilen matrisin transpozunu bulan
    // program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] dizi = new int[3][2];
        int[][] transpoz = new int[2][3];
        int i, j;
        for (i = 0; i < dizi.length; i++) {
            for (j = 0; j < dizi[i].length; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                dizi[i][j] = scan.nextInt();
                transpoz[j][i] = dizi[i][j];
            }

        }
        for (int[] a : transpoz) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        scan.close();

    }

}
