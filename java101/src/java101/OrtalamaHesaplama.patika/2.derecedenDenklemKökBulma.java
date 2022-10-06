import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("a gir: ");
        double a = scan.nextInt();
        System.out.print("b gir: ");
        double b = scan.nextInt();
        System.out.print("c gir: ");
        double c = scan.nextInt();
        double delta = b * b - 4 * a * c;
        double kok1;
        double kok2;
        if (delta == 0) {
            kok1 = (-b + Math.sqrt(delta)) / 2 * a;
            kok2 = kok1;
            System.out.println("kok1: " + kok1);
            System.out.println("kok2: " + kok2);
        }
        if (delta > 0) {
            kok1 = (-b + Math.sqrt(delta)) / 2 * a;
            kok2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("kok1: " + kok1);
            System.out.println("kok2: " + kok2);
        }
        if (delta < 0) {
            System.out.println(" denkleminin koku yoktur");
        }

        scan.close();
    }
}
