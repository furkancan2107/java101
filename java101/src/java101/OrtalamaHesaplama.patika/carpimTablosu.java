public class App {
    // çarpım tablosu 10 a kadar yazdir
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " =" + i * j);
            }
        }
    }
}
