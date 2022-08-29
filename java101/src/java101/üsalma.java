import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (
                Scanner scan = new Scanner(System.in)) {
            System.out.println("taban gir: ");
            int n = scan.nextInt();
            System.out.println("üs gir");
            int k = scan.nextInt();
            int total = 1;
            for (int i = 1; i <= k; i++) {
                total = total * n;

            }
            System.out.println(total);
        }
    }
}
