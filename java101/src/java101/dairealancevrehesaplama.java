import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Dairenin Alanını ve Çevresini Hesaplayan Program
         * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini
         * hesaplayan programı yazın.
         * 
         * Alan Formülü : π * r * r;
         * 
         * Çevre Formülü : 2 * π * r;
         * 
         * Ödev
         * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan
         * programı yazınız.
         * 
         * 𝜋 sayısını = 3.14 alınız.
         * 
         * Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        try (Scanner scan = new Scanner(System.in)) {
            double p = 3.14;
            double r;
            double merkezaci;
            System.out.println("dairenin yaricapini girin: ");
            r = scan.nextInt();
            System.out.println("dairenin merkez acisini gir");
            merkezaci = scan.nextDouble();
            double alan = (r * r * p * merkezaci) / 360;
            double çevre = (2 * p * r * merkezaci) / 360;
            System.out.println("dairenin alani: " + alan);
            System.out.println("dairenin çevresi: " + çevre);

        }

    }
}
