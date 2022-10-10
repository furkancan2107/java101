
public class App {

    /*
     * ilk on rakamın toplamının birler basmağı 11. rakamı veriyor.
     * 1,3,5,7 ve 9. rakamın toplamının 7 katı ile 2,4,6 ve 8. rakamın toplamının 
     *  farkının birler basamağı 10. rakamı veriyor.
     *  ilk hane 0 olamaz
     */
    public static void main(String[] args) {
        String tcNo = "21574521838";
        int[] sayi = new int[11];
        // tc yi parcalıyoruz
        for (int i = 0; i < 11; i++) {
            sayi[i] = Integer.parseInt(tcNo.substring(i, (i + 1)));
        }

        /* CİFT */int cToplam = 0;
        /* TEK */int tToplam = 0;
        for (int j = 0; j < 9; j++) {
            if (j % 2 == 0) {
                // index 0 dan başladığı için 1,3,5,7,9. hanelerin toplami
                tToplam += sayi[j];
            } else {
                // 2,4,6,8. hanelerin toplami
                cToplam += sayi[j];
            }

        }

        int c = (tToplam * 7 - cToplam) % 10;

        // System.out.println(c);
        System.out.println(dogruMu(sayi, cToplam, tToplam, c));
    }

    private static boolean dogruMu(int[] tcDizi, int tekToplam, int ciftToplam, int a) {

        if (tcDizi != null) {
            // Şartlar
            boolean s1 = tcDizi[0] != 0;
            boolean s2 = a == tcDizi[9];
            boolean s3 = (ciftToplam + tekToplam + tcDizi[9]) % 10 == tcDizi[10];

            return s1 && s2 && s3;

        }
        return false;

    }
}
