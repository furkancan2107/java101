// !dizilerdeki sayilarin ortalamasini hesaplayan program;

public class App {
    public static void main(String[] args) throws Exception {
        double[] dizi = { 10, 27, 38, 44, 57 };
        double toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam = toplam + dizi[i];
        }
        double ortalama = toplam / dizi.length;
        System.out.println("Ortalama: " + ortalama);
        
    }

}
