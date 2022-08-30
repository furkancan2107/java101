import java.util.Scanner;

//import java.util.Scanner;

/*Java ile girilen sayının harmonik serisini bulan program yazacağız. */
public class App {

    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Fibonacci dizisinin kaç elemanlı olacagini gir: ");
            int d = scan.nextInt();
            fibonnacci(d);
        }
    }

    static void fibonnacci(int d) {
        int a, b, c;
        a = 1;
        b = 1;
        System.out.println(a);
        System.out.println(b);
        int i = 0;

        while (i < d - 2) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            i++;

        }

    }

}
