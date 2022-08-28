import java.util.Scanner;

/*
 * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Sayi girin: ");
            int s = scan.nextInt();
            System.out.println("*************4'un Kuvvetleri*************");
            for (int i = 1; i < s; i *= 4) {

                System.out.println(i);
            }
            System.out.println("*************5'in Kuvvetleri*************");
            for (int j = 1; j < s; j *= 5) {

                System.out.println(j);
            }

        }
    }
}
