
/**
 * KullanciGiris
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("S1 GİR: ");
            int s1 = scan.nextInt();
            System.out.println("S2 GİR: ");
            int s2 = scan.nextInt();
            System.out.println("S3 GİR: ");
            int s3 = scan.nextInt();
            if (s1 > s2 && s1 > s3) {
                if (s2 > s3) {
                    System.out.println("s1>s2>s3");
                } else {
                    System.out.println("s1>s3>s2");
                }

            } else if (s2 > s1 && s2 > s3) {
                if (s1 > s3) {
                    System.out.println("s2>s1>s3");
                } else {
                    System.out.println("s2>s3>s1");
                }
            } else if (s3 > s1 && s3 > s2) {
                if (s1 > s2) {
                    System.out.println("s3>s1>s2");
                } else {
                    System.out.println("s3>s2>s1");
                }

            } else if (s1 >= s2 && s1 >= s3) {
                if (s1 == s2 && s1 > s3) {
                    System.out.println("s1=s2>s3");
                } else if (s1 == s2 && s1 == s3) {
                    System.out.println("s1=s2=s3");
                } else if (s1 == s3 && s1 > s2) {
                    System.out.println("s1=s3>s2");
                }

            } else if (s2 == s3 && s2 > s1) {
                System.out.println("s2=s3>s1");
            }
        }

    }
}