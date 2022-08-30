import java.util.Scanner;

/*Java ile girilen sayının harmonik serisini bulan program yazacağız. */
public class App {
    /*
     * Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak
     * yazınız.
     örn 6 ve 8 in ebob ekokunu bulun :
     Ebob: 6'ının bolenleri                         Ekok: 6'ının kat
     1,2,3,6;             ebob(8,6)=2;                   6,12,18,24
     8:'in bolenleri;                                    8'in katlari; 8,16,24,32
     1,2,4,8;                                        ekok(8,6)=24;
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("1. sayiyi girin :");
            int sayi1 = scan.nextInt();
            System.out.print("2.sayiyi girin: ");
            int sayi2 = scan.nextInt();
            int i, j;

            int ebob = 0;
            int ekok = 0;
            int max = sayi1 * sayi2;

            while (true) {
                if (sayi1 < sayi2) {
                    System.out.println("Sayi 1 sayi 2'den büyük girin");
                    break;
                }

                i = 1;
                while (i < sayi1) {
                    if (sayi1 % i == 0 && sayi2 % i == 0) {
                        ebob = i;
                    }
                    i++;
                }
                j = max;
                while (j > 0) {
                    if (j % sayi1 == 0 && j % sayi2 == 0) {
                        ekok = j;
                    }
                    j--;
                }
                System.out.println("Ebob: " + ebob);
                System.out.println("Ekok: " + ekok);
                break;

            }
        }

    }
}
