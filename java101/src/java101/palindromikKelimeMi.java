import java.util.Scanner;

/*
 * Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.

Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

Örnek : abba , asa , kavak, kayak
 */
public class App {
    static boolean isPalindrom(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;

        }

        return true;
    }

    static boolean isPalindrom2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime gir: ");
        String kelime = scan.nextLine();
        scan.close();

        if (isPalindrom2(kelime) == true) {
            System.out.println(kelime + " palindromik bir kelimedir");
        } else {
            System.out.println(kelime + " palindromik bir kelime degildir");
        }

    }
}
