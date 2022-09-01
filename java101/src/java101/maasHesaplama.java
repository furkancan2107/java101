/*
 * Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

Sınıfın Nitelikleri

name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Sınıfın Metotları

Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Maas m = new Maas("Ahmet veren", 2000, 45, 2002);
        m.info();
        Maas n = new Maas("Yavuz Sisko", 600, 80, 1975);
        n.info();
    }
}

class Maas {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Maas(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }

    double tax() {
        double vergi;
        if (salary > 1000) {
            vergi = salary * 0.03;

        } else {
            vergi = 0;
        }
        return vergi;
    }

    double bonus() {
        double bonus;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        } else {
            bonus = 0;
        }
        return bonus;

    }

    double raiseSalary() {
        double artısMiktari = 0;
        double kacYil = 2022 - hireYear;
        if (kacYil < 10) {
            artısMiktari = salary * 0.05;
        }
        if (kacYil >= 10 && kacYil < 20) {
            artısMiktari = salary * 0.10;
        }
        if (kacYil >= 20) {
            artısMiktari = salary * 0.15;
        }
        return artısMiktari;
    }

    void info() {
        double toplam = salary - tax() + bonus() + raiseSalary();
        System.out.println("------------------------------------");
        System.out.println("İsim Soyisim: " + this.name);
        System.out.println("Hangi Yil Başladi: " + this.hireYear);
        System.out.println("Haftada kaç ssat calisiyor: " + this.workHours);
        System.out.println("vergisiz bonussuz maasi: " + this.salary);
        System.out.println("vergi: " + tax());
        System.out.println("bonus: " + bonus());
        System.out.println("Artis Miktari: " + raiseSalary());
        System.out.println("Toplam Maas: " + toplam);
    }
}
