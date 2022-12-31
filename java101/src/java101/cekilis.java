package İnspimoDers;

import java.util.Random;
import neetCode.App;

public class cekilis {
    public static boolean isFind(int[] arr) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (i != j && arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] dizi = new int[12];
        int sayi;
        while (true) {
            for (int i = 0; i < 12; i++) {

                sayi = r.nextInt(120) + 1;
                dizi[i] = sayi;
            }
            int index = 1;
            if (isFind(dizi)) {
                for (int i = 0; i < dizi.length; i++) {
                    System.out.print(index + ".cekilis için klavyeden herhangi bir tuşa bas: ");
                    String klavye = App.scan.nextLine();
                    index++;
                    System.out.println();
                    System.out.println(i + 1 + ".CEKİLİS " + dizi[i]);
                }
                /*
                 * for (int a : dizi) {
                 * System.out.println(index + ". hediye: " + a);
                 * index++;
                 * }
                 */
            } else {
                continue;
            }
            break;
        }
    }
}
