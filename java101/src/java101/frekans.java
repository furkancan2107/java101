
import java.util.Arrays;

/*Tekrar Eden Cift Sayilari Yazdirma */
public class App {

    public static void main(String[] args) throws Exception {
        int[] dizi = { 10, 2, 7, 5, 2, 10 };
        int[] tekrar = new int[dizi.length];
        int index = 0;
        int i, j;

        int[] kacKere = new int[dizi.length];
        for (i = 0; i < dizi.length; i++) {
            kacKere[i] = 1;
        }
        for (i = 0; i < dizi.length; i++) {

            for (j = 0; j < dizi.length; j++) {

                if (i != j && dizi[i] == dizi[j]) {

                    tekrar[index++] = dizi[i];
                    kacKere[i]++;
                }

            }
            if (kacKere[i] >= 1) {
                if (tekrar[i] != 0) {
                    System.out.println(tekrar[i] + " sayisi " + kacKere[i] + " kadar tekrar etmiştir.");
                }
            }

        }
        System.out.println(Arrays.toString(tekrar));

    }
}
