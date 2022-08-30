import java.util.Scanner;

/*Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889.... */
public class App {

    static void sonuc(int sayi) {
        int total = 0;
        int number = sayi;
        int rakam;
        while (sayi > 0) {
            rakam = sayi % 10;
            total = (total * 10) + rakam;
            sayi = sayi / 10;

        }
        System.out.println(total);
        if (number == total) {
            System.out.println(total + " bir palindrom sayidir");
        } else {
            System.out.println(total + " palindrom sayi degildir ");
        }
    }

    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Sayi gir : ");
            int sayi = scan.nextInt();
            sonuc(sayi);

        }
    }

}
