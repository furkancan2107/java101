
import java.util.Scanner;

public class Main {
  //matrisin ilk indexinden başlayıp birleriin olduğu yoldan ilerleyerek 9 a ulaşmasını sağlayan oyun
    static Scanner scan = new Scanner(System.in);

    static void run(int col, int row, String[][] cozum, int[][] labirent1) {
        while (true) {

            if (labirent1[col][row] == 0) {
                System.out.println("Labirent çözülemedi ");
                break;
            }
            if (labirent1[col][row] == 1) {
                cozum[col][row] = "1";
            }
            if (labirent1[col][row] == 9) {
                cozum[col][row] = "9";
                System.out.println("Labirent çözüldü");
                break;
            }
            System.out.println("1-sagaGit \n2-Sola git \n3-Asagi in");
            System.out.println("Secim yapin: ");
            int secim = scan.nextInt();
            switch (secim) {

                case 1:
                    if (row < 19) {
                        row++;
                    }
                    break;
                case 2:
                    if (row > 0) {
                        row--;
                    }
                    break;
                case 3:
                    if (col < 19) {
                        col++;
                        break;
                    }
                default:
                    System.out.println("Lütfen 1 ile 3 arasinda secim yapin");
                    break;
            }
            System.out.println("col: " + col + "row: " + row);

        }
    }

    public static void main(String[] args) {
        int[][] labirent = {

                { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 9, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

        };

        System.out.print("Satir gir: ");
        int satir = scan.nextInt();
        System.out.print("Sütün gir: ");
        int sutun = scan.nextInt();
        if (satir != 0 && sutun != 0) {
            System.out.println("0 0 gir ilk degeri");

        }
        String[][] czm = new String[20][20];

        for (int[] s : labirent) {
            for (int z : s) {
                System.out.printf("%4d", z);
            }
            System.out.println();

        }
        run(satir, sutun, czm, labirent);
        for (String[] a : czm) {
            for (String b : a) {

                if (b == null) {
                    System.out.print(" ");
                } else {
                    System.out.printf(b);
                }

            }
            System.out.println();
        }

    }

}

