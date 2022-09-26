import java.util.Scanner;

public class App {
    // girilen 3 basamakli sayinin basamaklarının küpleri toplami
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.print("sayi gir: ");
        sayi = scan.nextInt();
        int i = 0;

        int toplam = 0;
        int basamakdegeri;
        while (true) {
            if (sayi > 999) {
                System.out.println("3 basamakli sayi girin");
                break;
            }
            while (sayi > 0) {

                basamakdegeri = sayi % 10;
                sayi = sayi / 10;
                toplam = toplam + basamakdegeri * basamakdegeri * basamakdegeri;
                i++;
            }
            System.out.println("basamak degeri: " + i);
            System.out.println("basamaklar toplami: " + toplam);
            scan.close();
            break;

        }

    }
}
