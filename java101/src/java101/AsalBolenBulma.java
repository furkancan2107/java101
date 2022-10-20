
import java.util.Scanner;
//Girilen sayinin asal bolenlerini bul örn 21 -3,7

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi gir: ");
        int sayi = scan.nextInt();
        int bolen = 2;
        int bolunen = sayi;
        while (bolen < sayi) {
            if (bolunen % bolen == 0) {
                System.out.println(bolen);
                bolunen /= bolen;
            } else {
                bolen++;
            }

        }

        scan.close();

    }
}
