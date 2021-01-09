package scooter;

public class Test {

    public static void main(String[] args) {
        Istasyon istasyon1 = new Istasyon("İstanbul","Bayrampaşa");
        Istasyon istasyon2 =new Istasyon("İstanbul","Eyüp");
        Araclar arac1 =new Araclar("mavi",35,76);
        Araclar arac2 =new Araclar("yeşil",20,50);
        Araclar arac3 =new Araclar("kırmızı",20,50);
        Araclar arac4 =new Araclar("mavi",20,30);
        Araclar arac5 =new Araclar("yeşil",35,100);
        Suruculer surucu1 =new Suruculer("Ahmet", "Kalafat","garlicman");
        istasyon1.aracEkle(arac1);
        istasyon1.aracEkle(arac2);
        istasyon1.aracEkle(arac3);
        istasyon1.araclarıListele();
        surucu1.aracıTeslimAl(istasyon1,arac1);
        System.out.println(arac1.getSofor());
        System.out.println(arac1.toString());
        /*System.out.println("*************");
        istasyon1.araclarıListele();
        istasyon2.araclarıListele();

        System.out.println(surucu1.getBakiye());
        surucu1.bakiyeYukle(10);
        System.out.println(surucu1.getBakiye());
        surucu1.aracıTeslimEt(arac1,istasyon2,78);

        System.out.println(surucu1.getBakiye());
        surucu1.aracıTeslimEt(arac1,istasyon2,78);
        istasyon2.araclarıListele();
*/
    }
}