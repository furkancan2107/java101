import java.util.Scanner;

/*Java dilinde "Recursive" metot kullanarak,
 kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın. */
public class App {

    static void sonuc(int sayi) {
        int kontrol = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                kontrol = 1;
            }
        }
        if (kontrol == 0) {
            System.out.println("Asal");
        } else {
            System.out.println("Asal degil");
        }

    }

    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Taban gir : ");
            int sayi = scan.nextInt();
            sonuc(sayi);
        }
    }

}
