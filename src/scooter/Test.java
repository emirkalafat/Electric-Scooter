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
        Surucu surucu1 = new Surucu("Ahmet", "Kalafat", "garlicman", "123ahmet");
        Surucu surucu2 = new Surucu("Ayşe", "Yıldız", "ayşeyldz", "yıldız123");
        Yonetici yonetici = new Yonetici("Abuzer", "Abuzeroğlu", "abuzettin", "123admin");
        Surucu surucu3 = new Surucu("Zeynep", "Kalafat", "zbkalafat", "123123zeynep");

        istasyon1.aracEkle(arac1);
        istasyon1.aracEkle(arac2);
        istasyon2.aracEkle(arac3);
        istasyon1.aracEkle(arac4);
        //  istasyon1.aracEkle(arac3);

        surucu3.bakiyeYukle(20);
        System.out.println("***************************");
        istasyon1.araclariListele();
        istasyon2.araclariListele();
        istasyon3.araclariListele();
        System.out.println("***************************");
        surucu3.araciTeslimAl(istasyon1);
        System.out.println("***************************");
        istasyon1.araclariListele();
        istasyon2.araclariListele();
        istasyon3.araclariListele();
        System.out.println("***************************");
        yonetici.kullaniciBilgileriniGetir(surucu3);
        System.out.println("***************************");
        istasyon1.araclariListele();
        istasyon2.araclariListele();
        istasyon3.araclariListele();
        System.out.println("***************************");
        yonetici.aracKaldir(istasyon1);
        System.out.println("***************************");
        istasyon1.araclariListele();
        istasyon2.araclariListele();
        istasyon3.araclariListele();
        System.out.println("***************************");
        surucu3.araciTeslimEt(istasyon3);
        System.out.println("***************************");
        istasyon1.araclariListele();
        istasyon2.araclariListele();
        istasyon3.araclariListele();
        System.out.println("***************************");
    }
}