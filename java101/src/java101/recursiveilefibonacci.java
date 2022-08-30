import java.util.Scanner;



public class App {

    static int sonuc(int sayi) {
        if (sayi == 1)
            return 1;
        if (sayi == 2)
            return 1;
        return sonuc(sayi - 1) + sonuc(sayi - 2);
    }

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi gir: ");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            System.out.println(sonuc(i));
        }

        scan.close();

    }
}
