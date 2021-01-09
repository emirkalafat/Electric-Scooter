package scooter;

import java.util.Scanner;

public class Main {


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
        Yonetici yonetici = new Yonetici("Abuzer","Abuzeroğlu","abuzettin","123admin");


    }
}
