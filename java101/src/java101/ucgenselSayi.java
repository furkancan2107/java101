public class ucgenselSayi {
  // kendi indeksi le kendinden önceki sayinin toplamı olarak ilerleyen dizi
    public static void main(String[] a) {
        // 1,3,6,10,15,21,28....
        int x = 1;
        // x+=(i+2)
        // 1,3,6
        for (int i = 0; i < 10; i++) {
            System.out.println(x);
            x += (i + 2);
        }
    }

}
