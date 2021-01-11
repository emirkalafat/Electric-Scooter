package scooter;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Istasyon istasyon1 = new Istasyon("İstanbul", "Bayrampaşa");
        Istasyon istasyon2 = new Istasyon("İstanbul", "Eyüp");
        Istasyon istasyon3 = new Istasyon("İstanbul", "Kadıköy");
        Araclar arac1 = new Araclar("mavi", 35);
        Araclar arac2 = new Araclar("yeşil", 20);
        Araclar arac3 = new Araclar("kırmızı", 20);
        Araclar arac4 = new Araclar("mavi", 20);
        Araclar arac5 = new Araclar("yeşil", 35);
        Suruculer surucu1 = new Suruculer("Ahmet", "Kalafat", "garlicman", "123ahmet");
        Suruculer surucu2 = new Suruculer("Ayşe", "Yıldız", "ayşeyldz", "yıldız123");
        Yonetici yonetici = new Yonetici("Abuzer", "Abuzeroğlu", "abuzettin", "123admin");
        Suruculer surucu3 = new Suruculer("Zeynep", "Kalafat", "zbkalafat", "123123zeynep");

        istasyon1.aracEkle(arac1);
        istasyon1.aracEkle(arac2);
        istasyon2.aracEkle(arac3);
        istasyon1.aracEkle(arac4);
        //  istasyon1.aracEkle(arac3);

        surucu3.bakiyeYukle(20);
        System.out.println("***************************");
        istasyon1.araclarıListele();
        istasyon2.araclarıListele();
        istasyon3.araclarıListele();
        System.out.println("***************************");
        surucu3.aracıTeslimAl(istasyon1);
        System.out.println("***************************");
        istasyon1.araclarıListele();
        istasyon2.araclarıListele();
        istasyon3.araclarıListele();
        System.out.println("***************************");
        yonetici.kullanıcıBilgileriniGetir(surucu3);
        System.out.println("***************************");
        istasyon1.araclarıListele();
        istasyon2.araclarıListele();
        istasyon3.araclarıListele();
        System.out.println("***************************");
        yonetici.aracKaldır(istasyon1);
        System.out.println("***************************");
        istasyon1.araclarıListele();
        istasyon2.araclarıListele();
        istasyon3.araclarıListele();
        System.out.println("***************************");
        surucu3.aracıTeslimEt(istasyon3,120);
        System.out.println("***************************");
        istasyon1.araclarıListele();
        istasyon2.araclarıListele();
        istasyon3.araclarıListele();
        System.out.println("***************************");
    }
}