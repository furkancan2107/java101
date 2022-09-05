import java.util.Arrays;
import java.util.Scanner;

/*Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi gir: ");
        int sayi = scan.nextInt();
        int[] dizi = { 10, 7, 32, 18, 31, 53 };
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        if (sayi <= dizi[0]) {
            System.out.println("sayidan büyük veya eşit en yakin sayi: " + dizi[0]);
        }
        if (sayi >= dizi[5]) {
            System.out.println("sayidan kücük veya eşit en yakin sayi: " + dizi[5]);
        }
        if (sayi > dizi[0] && sayi < dizi[5]) {
            if (sayi >= dizi[1] && sayi < dizi[2]) {
                System.out.println("sayidan kücük veya eşit en yakin sayi: " + dizi[1]);
                System.out.println("sayidan büyük  en yakin sayi: " + dizi[2]);
            }
            if (sayi >= dizi[2] && sayi < dizi[3]) {
                System.out.println("sayidan kücük veya eşit en yakin sayi: " + dizi[2]);
                System.out.println("sayidan büyük  en yakin sayi: " + dizi[3]);
            }
            if (sayi >= dizi[3] && sayi < dizi[4]) {
                System.out.println("sayidan kücük veya eşit en yakin sayi: " + dizi[3]);
                System.out.println("sayidan büyük  en yakin sayi: " + dizi[4]);
            }
            if (sayi >= dizi[4] && sayi < dizi[5]) {
                System.out.println("sayidan kücük veya eşit en yakin sayi: " + dizi[4]);
                System.out.println("sayidan büyük en yakin sayi: " + dizi[5]);
            }
        }

        scan.close();
    }
}
