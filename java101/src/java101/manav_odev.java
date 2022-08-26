import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Manav Kasa Programı
         * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
         * değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
         * 
         * Meyveler ve KG Fiyatları
         * 
         * Armut : 2,14 TL
         * Elma : 3,67 TL
         * Domates : 1,11 TL
         * Muz: 0,95 TL
         * Patlıcan : 5,00 TL
         */

        try (Scanner scan = new Scanner(System.in)) {
            scan.useLocale(Locale.US);
            System.out.println("Kaç kilo armut aldın ? : ");
            double armut = scan.nextDouble();

            System.out.println("Kaç kilo elma aldın ? : ");
            double elma = scan.nextDouble();

            System.out.println("Kaç kilo dometes aldın ? : ");
            double dometes = scan.nextDouble();

            System.out.println("Kaç kilo muz aldın ? : ");
            double muz = scan.nextDouble();

            System.out.println("Kaç kilo patlican aldın ? : ");
            double patlican = scan.nextDouble();

            double armutFiyat = armut * 2.14;
            System.out.println(armut + "kilo armut: " + armutFiyat + "tl");

            double elmaFiyat = elma * 3.67;
            System.out.println(elma + "kilo elma: " + elmaFiyat + "tl");

            double dometesFiyat = dometes * 1.11;
            System.out.println(dometes + "kilo dometes: " + dometesFiyat + "tl");

            double muzFiyat = muz * 0.95;
            System.out.println(muz + "kilo muz: " + muzFiyat + "tl");

            double patlicanFiyat = patlican * 5;
            System.out.println(patlican + "kilo patlican: " + patlicanFiyat + "tl");

            double total = patlicanFiyat + dometesFiyat + muzFiyat + elmaFiyat + armutFiyat;
            System.out.println("toplam borcunuz: " + total);

        }

    }
}
