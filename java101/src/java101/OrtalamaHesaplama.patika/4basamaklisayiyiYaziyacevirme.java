public class sayiyiyaziyacevirme {
    // 4 basamaklı sayiyi yazıya çevirme
    public static void main(String[] a) {
        System.out.print("Sayi gir: ");
        int sayi = App.scan.nextInt();
        String[] birler = { "bir", "iki", "uç", "dort", "bes", "alti", "yedi", "sekiz", "dokuz" };
        String[] onlar = { "on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan" };
        int[] rakam = new int[4];
        int i = 0;
        while (true) {
            if (sayi > 9999 || sayi < 1000) {
                System.out.println("Lütfen dört basamakli sayi girin!!!");
                break;
            }
            while (sayi > 0) {
                rakam[i] = sayi % 10;
                sayi = sayi / 10;
                // System.out.println(birler[rakam[i] - 1]);
                i++;
            }
            // System.out.println(i);
            System.out
                    .println(birler[rakam[i - 1] - 1] + " bin " + birler[rakam[i - 2] - 1] + " yüz "
                            + onlar[rakam[i - 3] - 1] + " "
                            + birler[rakam[i - 4] - 1]);
            break;
        }

    }

}
