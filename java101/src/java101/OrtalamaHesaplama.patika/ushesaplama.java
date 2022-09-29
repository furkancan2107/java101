import java.util.Scanner;

public class App {
    // us bulan program
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi gir: ");
        int sayi = scan.nextInt();
        System.out.print("us gir: ");
        int us = scan.nextInt();
        int toplam = 1;
        for (int i = 0; i < us; i++) {
            toplam = toplam * sayi;
        }
        System.out.println(toplam);

        scan.close();

    }
}
