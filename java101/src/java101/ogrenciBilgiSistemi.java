/*
 * Course Sınıfı Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()

Teacher Sınıfı Özellikleri :

Nitelikler : name,mpno,branch
Metotlar : Teacher()

Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */
class Teacher {
    String ad;
    String brans;

    public Teacher(String ad, String brans) {
        this.ad = ad;
        this.brans = brans;
    }
}

class Course {
    Teacher dersHocasi;
    String ad;
    String kisaAd;
    int not;

    public Course(String kisaAd, String ad) {
        this.ad = ad;
        this.kisaAd = kisaAd;
        this.not = 0;

    }

    public void dersKaydi(Teacher a) {

        if (this.kisaAd.equals(a.brans)) {
            this.dersHocasi = a;
            System.out.println(a.brans + " dersinize giren hoca " + a.ad);
        } else {
            System.out.println(a.ad + a.brans + "Dersinize girmemektedir");
        }
    }

}

class Ogrenci {
    String ad;
    String no;
    Course mat;
    Course fiz;
    Course biy;
    Course matSozlu;
    Course fizSozlu;
    Course biySozlu;
    double ortalama;

    Ogrenci(String ad, String no, Course mat, Course fiz, Course biy, Course matSozlu,
            Course fizSozlu,
            Course biySozlu) {
        this.ad = ad;
        this.no = no;
        this.mat = mat;
        this.fiz = fiz;
        this.biy = biy;
        this.matSozlu = matSozlu;
        this.fizSozlu = fizSozlu;
        this.biySozlu = biySozlu;

    }

    public void not(int mat, int fiz, int biy, int matSozlu, int fizSozlu, int biySozlu) {
        if (mat >= 0 && mat <= 100) {
            this.mat.not = mat;
        }
        if (fiz >= 0 && fiz <= 100) {
            this.fiz.not = fiz;
        }
        if (biy >= 0 && biy <= 100) {
            this.biy.not = biy;
        }
        this.matSozlu.not = matSozlu;
        this.biySozlu.not = biySozlu;
        this.fizSozlu.not = fizSozlu;
        this.ortalama = (mat + fiz + biy) * 0.8 / 3 + (matSozlu + biySozlu + fizSozlu) * 0.2 / 3;
    }

    public void issPass() {
        if (this.mat.not == 0 || this.fiz.not == 0 || this.biy.not == 0) {
            System.out.println("Ders Notlarini Tam Gir");
        } else if (this.ortalama > 55) {
            printNote();
            System.out.println(this.ad + " Sinifi Geçti");

        } else {

            printNote();
            System.out.println(this.ad + " Kaldi");
        }

    }

    public void printNote() {
        System.out.println("***************************");
        System.out.println("");
        System.out.println("");
        System.out.println("Ogrencinin adi: " + this.ad);
        System.out.println("Ogrencinin numarasi: " + this.no);
        System.out.println("Ogrencinin ortalamasi: " + this.ortalama);
        System.out.println("Ogrencinin matematik notu: " + this.mat.not);
        System.out.println("Ogrencinin Fizik notu: " + this.fiz.not);
        System.out.println("Ogrencinin Biyoloji notu: " + this.biy.not);
    }

}

public class App {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Hayrullah", "Mat");
        Teacher t2 = new Teacher("Okan", "Fiz");
        Teacher t3 = new Teacher("Durmus", "Biy");

        Course c1 = new Course("Mat", "Matematik");
        c1.dersKaydi(t1);
        Course c2 = new Course("Fiz", "Fizik");
        c2.dersKaydi(t2);
        Course c3 = new Course("Biy", "Biyoloji");
        c3.dersKaydi(t3);
        Course matS = new Course("ms", "");
        Course fizS = new Course("fs", "");
        Course biyS = new Course("bs", "");

        Ogrenci o1 = new Ogrenci("Hayri", "123", c1, c2, c3, matS, fizS, biyS);
        o1.not(30, 80, 100, 100, 50, 70);
        o1.issPass();
        Ogrenci o2 = new Ogrenci("nuri", "656565", c1, c2, c3, matS, fizS, biyS);
        o2.not(10, 50, 82, 70, 20, 100);
        o2.issPass();
        Ogrenci o3 = new Ogrenci("Selami", "5251", c1, c2, c3, matS, fizS, biyS);
        o3.not(100, 100, 100, 100, 100, 100);
        o3.issPass();

    }
}
