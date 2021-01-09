package scooter;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Istasyon istasyon1 = new Istasyon("İstanbul","Bayrampaşa");
        Istasyon istasyon2 =new Istasyon("İstanbul","Eyüp");
        Araclar arac1 =new Araclar("mavi",35);
        Araclar arac2 =new Araclar("yeşil",20);
        Araclar arac3 =new Araclar("kırmızı",20);
        Araclar arac4 =new Araclar("mavi",20);
        Araclar arac5 =new Araclar("yeşil",35);
        Suruculer surucu1 =new Suruculer("Ahmet", "Kalafat","garlicman","123ahmet");
        istasyon1.aracEkle(arac1);
        istasyon1.aracEkle(arac2);
        istasyon1.aracEkle(arac3);
        istasyon2.aracEkle(arac4);
        istasyon1.araclarıListele();
        surucu1.bakiyeYukle(10);
        surucu1.aracıTeslimAl(istasyon1,arac1);


        System.out.println(arac1.getSofor());
        System.out.println(arac1.toString());
        System.out.println("**********");
        System.out.println(arac1.getIstasyon());
        System.out.println(arac4.getIstasyon());
        System.out.println("*************");
        istasyon1.araclarıListele();
        istasyon2.araclarıListele();

        System.out.println(surucu1.getBakiye());

        System.out.println(surucu1.getBakiye());
        String foto = scan.next();
        surucu1.aracıTeslimEt(arac1,istasyon2,78,foto);

        System.out.println(surucu1.getBakiye());
        surucu1.aracıTeslimEt(arac1,istasyon2,78, foto);
        istasyon2.araclarıListele();
        istasyon1.araclarıListele();
        System.out.println(arac2.toString());

    }
}