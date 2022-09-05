import java.util.Arrays;
import java.util.Scanner;

/*
!Matrisin transpozunu bulma
 Senaryo
Matris : 
2    3    4    
5    6    4    
Transpoze : 
2    5    
3    6    
4    4   
 */
public class App {
    public static void main(String[] args) throws Exception {
        int[][] matris = new int[6][5];
        int[][] transpoz = new int[5][6];
        int i, j;
        int number = 1;
        for (i = 0; i < matris.length; i++) {
            for (j = 0; j < matris[i].length; j++) {
                matris[i][j] = number++;
                transpoz[j][i] = matris[i][j];
            }

        }
        for (int[] a : transpoz) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }
}
