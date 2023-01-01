package İnspimoDers;

import java.util.Random;

public class ornekler {
    public static void main(String[] args) {
        Random r = new Random();
        int omer = 0;
        int ahmet = 0;
        int sayac1 = 0;
        int sayac2 = 0;
        int zar1 = 0;
        int zar2 = 0;
        while (true) {
            zar1 = r.nextInt(6) + 1;
            zar2 = r.nextInt(6) + 1;
            ahmet = zar1 + zar2;
            System.out.println("ahmetin " + sayac1 + " .atisi: " + zar1);

            System.out.println("ahmetin " + sayac1 + 1 + " .atisinin toplami: " + ahmet);
            sayac1++;
            if (ahmet == 12) {
                break;
            }

        }
        while (true) {
            zar1 = r.nextInt(6) + 1;
            zar2 = r.nextInt(6) + 1;
            omer = zar1 + zar2;

            System.out.println("omerin " + sayac2 + 1 + " .atisinin toplami: " + omer);
            sayac2++;
            if (omer == 12) {
                break;
            }

        }
        if (sayac1 > sayac2) {
            System.out.println("omer kazandi");
        } else if (sayac1 == sayac2) {
            System.out.println("berabere");
        } else {
            System.out.println("ahmet kazandi");
        }

    }
}
