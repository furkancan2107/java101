
import java.util.Arrays;
import java.util.Scanner;

// dizilerde büyükten küçüğe sıralama
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double[] dizi = { 0.1, 1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0 };
        double[] sira = new double[dizi.length];
        Arrays.sort(dizi);
        int i = 0;
        int j = dizi.length - 1;
        while (i < 10) {
            sira[i] = dizi[j];
            i++;
            j--;
        }
        for (double d : sira) {
            System.out.print(d + " ");
        }

        scan.close();

    }
}
