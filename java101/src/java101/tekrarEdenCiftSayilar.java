
/*Tekrar Eden Cift Sayilari Yazdirma */
public class App {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        int[] dizi = { 2, 0, 4, 3, 5, 7, 2, 8, 3, 4, 5, 6, 7, 6, 8 };
        int[] tekrar = new int[dizi.length];
        int index = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] % 2 == 0) {
                    if (i != j && dizi[i] == dizi[j]) {
                        if (isFind(tekrar, dizi[i])) {
                            tekrar[index++] = dizi[i];
                        }

                    }
                }

            }
        }
        for (int a : tekrar) {
            if (a != 0) {
                System.out.println(a);

            }

        }
    }
}
