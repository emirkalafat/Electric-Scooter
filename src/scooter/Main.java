package scooter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    static boolean fotoCekimi(char EH){
        if (EH == 'E' | EH == 'e'){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean bitir = false;


        /**  Önceden Eklenen Değerler   */
        Istasyon istasyon1 = new Istasyon("İstanbul", "Bayrampaşa");
        Istasyon istasyon2 = new Istasyon("İstanbul", "Eyüp");
        Araclar arac1 = new Araclar("mavi", 35);
        Araclar arac2 = new Araclar("yeşil", 20);
        Araclar arac3 = new Araclar("kırmızı", 20);
        Araclar arac4 = new Araclar("mavi", 20);
        Araclar arac5 = new Araclar("yeşil", 35);
        Suruculer surucu1 = new Suruculer("Ahmet", "Kalafat", "garlicman", "123ahmet");
        Yonetici yonetici = new Yonetici("Abuzer", "Abuzeroğlu", "abuzettin", "123admin");



        /** Kullanıcı İşlemleri */

        while (!bitir) {
            System.out.println("Scooter Kiralama Programına Hoş Geldiniz");
            System.out.println("Lütfen kullanıcı adınızı ve şifrenizi giriniz.");
            System.out.print("Kullanıcı Adı: ");
            String kAdı = scan.next();


            if (kAdı.equals(yonetici.getKullaniciAdi())){
                System.out.print("Şifre: ");
                String kSifre = scan.next();
                if  (kSifre.equals(yonetici.getKullanıcıSirfesi())){

                }
            }else if(kAdı.equals(surucu1.getKullaniciAdi())){
                System.out.print("Şifre: ");
                String kSifre = scan.next();
                if (kSifre.equals(surucu1.getKullaniciAdi())){

                }
            }




            /** Son İşlem */
            System.out.println("Ana menüye dönmek ister misiniz? [Evet/Hayır]");
            Character girdi = scan.next().charAt(0);
            switch (girdi) {
                case 'E' | 'e':
                    bitir = false;
                    break;
                case 'H' | 'h':
                    bitir = true;
                    break;
                default:
                    System.out.println("Geçersiz işlem. Ana menüye dönülüyor!");
                    bitir = false;
                    break;
            }
        }
    }
}
