import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Sayi girin: ");
            int s = scan.nextInt();
            for (int i = 1; i <= s; i++) {
                if (i % 2 == 0) {
                    System.out.println("Cift sayilar: " + i);
                }
            }
        }
    }
}
