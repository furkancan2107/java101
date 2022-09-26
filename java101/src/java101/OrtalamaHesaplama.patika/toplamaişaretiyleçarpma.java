import java.util.Scanner;

public class App {
    // toplama işlemi kullanarak çarpma islemi yapma
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2;
        System.out.print("sayi1: ");
        sayi1 = scan.nextInt();
        System.out.print("sayi2: ");
        sayi2 = scan.nextInt();
        int sayac = 0;
        while (sayi2 > 0) {
            sayac = sayac + sayi1;
            sayi2--;
        }
        System.out.println("çarpım: " + sayac);

        scan.close();
    }
}
