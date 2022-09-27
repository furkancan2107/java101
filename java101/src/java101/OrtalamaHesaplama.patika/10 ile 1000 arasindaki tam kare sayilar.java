import java.util.Scanner;

public class App {
    // 10 ile 1000 arasindaki tam kare sayilari yazdiran program
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int sayac = 4;
        for (int i = 4; i < 1000; i++) {
            sayac = sayac * sayac;
            if (sayac < 1000 && sayac != 0) {
                System.out.println(sayac);
            }

        }

        scan.close();

    }
}
