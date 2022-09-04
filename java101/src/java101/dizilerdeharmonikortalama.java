// !dizilerdeki sayilarin harmonik ortalamasini hesaplayan program;

public class App {
    public static void main(String[] args) throws Exception {
        double[] dizi = { 1, 2, 3, 4, 5 };
        double toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam = toplam + 1 / dizi[i];
        }
        double ortalama = dizi.length / toplam;
        System.out.println("Ortalama: " + ortalama);
    }
}
