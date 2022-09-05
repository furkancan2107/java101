import java.util.Arrays;
import java.util.Scanner;

/*
 * Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. 
 * Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("dizi kaç elamanli: ");
        int eleman = scan.nextInt();
        int[] dizi = new int[eleman];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayi gir: ");
            dizi[i] = scan.nextInt();

        }
        for (int j = 0; j < dizi.length; j++) {
            System.out.println(j + 1 + ". elemani " + dizi[j]);
        }
        Arrays.sort(dizi);
        System.out.println("Sıralama: " + Arrays.toString(dizi));

        scan.close();
    }
}
