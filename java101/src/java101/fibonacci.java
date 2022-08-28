
/*
    *Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. 
    *Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

    *Fibonacci dizisi, 0'dan başlar ve sonsuza kadar.
    *Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

    *10 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34 */
public class App {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < 8; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.println(c);
        }

    }
}
