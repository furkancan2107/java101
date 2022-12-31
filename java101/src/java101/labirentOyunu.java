
public class finalSoru {
  // oyun matrisin[0][0] indexinden başlayıp birlerin olduğu yerlerden giderek 9 a ulaşması
    public static void run(int col, int row, String[][] cozum, int[][] labirent1) {
        while (true) {
            if (col < 0 || row < 0 || col > 19 || row > 19) {
                break;
            }
            cozum[col][row] = "1";
            if (labirent1[col][row] == 0) {
                System.out.println("labirent cozülemedi");
                break;
            }

            if (labirent1[col][row] == 9) {
                cozum[col][row] = "9";
                System.out.println("Labirent cozüldü");
                break;
            }
            if (labirent1[col][row] == 1) {
                // asagısi sagi ve solunu kontrol edecek
                if (row > 0 && col < 19 && labirent1[col + 1][row] == 1) {

                    col++;
                } else if (row > 0 && row < 19 && labirent1[col][row + 1] == 1) {

                    row++;
                } else if (row > 0 && labirent1[col][row - 1] == 1) {

                    row--;
                } else {
                    continue;
                }

                // asağısi ile sağını kontrol edecek
                if (row == 0 && labirent1[col + 1][row] == 1) {
                    col++;

                } else if (row == 0 && labirent1[col][row + 1] == 1) {
                    row++;

                } else {
                    continue;
                }

            }
            // break;
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
        String[][] czm = new String[20][20];
        int i = 0;
        int j = 0;
        run(i, j, czm, labirent);

        for (String[] a : czm) {
            for (String b : a) {

                if (b == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(b);
                }

            }
            System.out.println();
        }
    }

}
