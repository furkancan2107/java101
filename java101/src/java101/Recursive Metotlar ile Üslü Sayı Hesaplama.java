import java.util.Scanner;

/*Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini 
"Recursive" metot kullanarak yapan programı yazınız. */
public class App {

    static void sonuc(int taban, int us) {
        int üst = 1;
        for (int i = 1; i <= us; i++) {
            üst = üst * taban;
        }
        System.out.println("sonuc: " + üst);

    }

    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Taban gir : ");
            int taban = scan.nextInt();
            System.out.print("Us gir: ");
            int us = scan.nextInt();
            sonuc(taban, us);

        }
    }

}
