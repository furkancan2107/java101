import java.util.Scanner;

public class soru {
    // klavyeden girilen bir kelimenin yüzde kaçının sesli harf olduğunu bulan
    // program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] sesli = { 'a', 'e', 'i', 'ı', 'o', 'ö', 'u', 'ü' };
        System.out.print("Kelime giriniz: ");
        String kelime = scan.nextLine();
        int sayac = 0;
        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 0; j < 8; j++) {
                if (kelime.charAt(i) == sesli[j]) {
                    sayac++;
                }
            }
        }
        System.out.println(sayac);
        double sonuc = (sayac * 100) / kelime.length();
        System.out.println("girdiğiniz kelimenin % " + sonuc + " si sesli harftir. : )");

        scan.close();

    }

}
