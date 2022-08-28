import java.util.Scanner;

public class App {
    /*
     * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı
     * yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
     * bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
     * uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
     * aşağıdaki indirimleri uygulayın ;
     * 
     * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
     * yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
     * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
     * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
     * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
     * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
     * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20
     * indirim uygulanır.
     * İpucu
     * Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
     * Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
     * İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
     * Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
     * Toplam Tutar = (135-27)* 2 = 216 TL
     * Senaryolar
     * Senaryo 1
     * Mesafeyi km türünden giriniz : 1500
     * Yaşınızı giriniz : 20
     * Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
     * 
     * Toplam Tutar = 216 TL
     * Senaryo 2
     * Mesafeyi km türünden giriniz : -500
     * Yaşınızı giriniz : 1
     * Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77
     * 
     * Hatalı Veri Girdiniz !
     * Senaryo 3
     * Mesafeyi km türünden giriniz : 200
     * Yaşınızı giriniz : 35
     * Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1
     * 
     * Toplam Tutar = 20.0 TL
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Mesafeyi km cinsinden gir: ");
            double mesafe = scan.nextDouble();

            System.out.println("Yasinizi girin: ");
            double yas = scan.nextDouble();

            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            int tip = scan.nextInt();

            while (true) {
                if (tip != 1 && tip != 2) {
                    System.out.println("Lütfen 1 yada 2 girin");
                    break;
                }
                double sonFiyat;
                double normalFiyat = mesafe * 0.10;
                if (yas < 12) {
                    sonFiyat = normalFiyat / 2;
                    if (tip == 2) {
                        sonFiyat = (normalFiyat * 0.8) * 2;
                    }
                    System.out.println("toplam borcunuz: " + sonFiyat);
                }
                if (yas >= 12 && yas < 24) {
                    sonFiyat = normalFiyat * 0.9;
                    if (tip == 2) {
                        sonFiyat = (normalFiyat * 0.8) * 2;
                    }
                    System.out.println("toplam borcunuz: " + sonFiyat);
                }
                if (yas > 65) {
                    sonFiyat = normalFiyat * 0.7;
                    if (tip == 2) {
                        sonFiyat = (normalFiyat * 0.8) * 2;
                    }
                    System.out.println("toplam borcunuz: " + sonFiyat);
                } else {
                    System.out.println("toplam borcunuz: " + normalFiyat);
                }
                break;
            }
        }

    }
}
