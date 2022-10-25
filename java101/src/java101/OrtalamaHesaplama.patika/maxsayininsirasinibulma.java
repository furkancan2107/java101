import java.util.Arrays;

public class Algoritma {
    // Dışardan girilen 10 sayıdan en büyüğünü bulup kaçıncı sırada olduğunu
    // yazdıran program
    public static void main(String[] args) {
        int max = 0;
        int sıra = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Sayi gir: ");
            int sayi = Oyun.scan.nextInt();
            if (max < sayi) {
                max = sayi;
                sıra = i;
            }

        }

        System.out.println("En büyük sayi: " + max + " Sırası: " + (sıra + 1));

    }

}
