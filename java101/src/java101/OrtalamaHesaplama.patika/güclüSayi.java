import java.util.Scanner;

public class App {
    // güclü sayi gücsüz sayi bul
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi gir: ");
        int sayi = scan.nextInt();
        int toplam = 0;
        int sonDeger = sayi;
        while (sayi > 0) {
            sayi = sayi / 2;
            toplam = toplam + sayi;

        }
        System.out.println(toplam);
        if (toplam > sonDeger) {
            System.out.println(sonDeger + " güclü Sayidir");
        } else {
            System.out.println(sonDeger + " Güclü sayi degildir");
        }

        scan.close();

    }
}
