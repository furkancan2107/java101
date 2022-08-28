import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Sayi girin: ");
            double s1 = scan.nextDouble();

            System.out.println("Sayi girin: ");
            double s2 = scan.nextDouble();

            System.out.println("1: toplama");
            System.out.println("2: çikarma");
            System.out.println("3: carpma");
            System.out.println("4: bolme");

            System.out.println("İşlem girin: ");
            int islem = scan.nextInt();

            switch (islem) {
                case 1:
                    System.out.println("sonuc:" + s1 + s2);
                    break;
                case 2:
                    System.out.println("sonuc: " + (s1 - s2));
                    break;
                case 3:
                    System.out.println("sonuc:" + s1 * s2);
                    break;
                case 4:
                    System.out.println("sonuc:" + (s1 / s2));
                    break;
                default:
                    System.out.println("Hatali sayi girdiniz lutfen 1-4 arasinda bir sayi girin");
            }
        }

    }
}
