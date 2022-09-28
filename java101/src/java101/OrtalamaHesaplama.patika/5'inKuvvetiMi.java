import java.util.Scanner;

public class App {
    // girilen sayinin 5'in kuvveti olup olmadığını bulma
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = scan.nextInt();
        if (sayi % 5 == 0) {
            System.out.println("sayi 5 in kuvettidir");
        } else {
            System.out.println("Sayi 5 in kuvveti degil");
        }
        scan.close();
    }
}
