package scooter;

import java.util.Scanner;

public class Test2 {

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
        Kullanici kullanici = new Kullanici("Ali","Veli","aliveli","ali123");

        istasyon1.aracEkle(arac1);
        istasyon1.aracEkle(arac2);
        istasyon2.aracEkle(arac3);
        istasyon1.aracEkle(arac4);

        yonetici.kullaniciBilgileriniGetir(yonetici);

        yonetici.bakiyeYukle(10);

        yonetici.kullaniciBilgileriniGetir(yonetici);

        surucu1.bakiyeYukle(30);
        surucu2.bakiyeYukle(30);

        surucu1.araciTeslimAl(istasyon1);


        System.out.println("");

        yonetici.aracBilgileriniGetir(arac1);

        System.out.println("");

        yonetici.kullaniciBilgileriniGetir(surucu1);

        //surucu1.araciTeslimEt(istasyon3);

        System.out.println(kullanici.toString());







    }
}