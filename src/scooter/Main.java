package scooter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /** test */ /*static ArrayList<String> kullanıcıAdıArrayList = new ArrayList<>();
    static ArrayList<String> kullanıcıSifresiArrayList = new ArrayList<>();
    public static void kullanıcıEklendi(Kullanıcılar k) {
        kullanıcıAdıArrayList.add(k.getKullaniciAdi());
        kullanıcıSifresiArrayList.add(k.getKullanıcıSirfesi());
    }
    */
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
        kullanıcıEklendi(surucu1);
        kullanıcıEklendi(yonetici);
        for (int i = 0; i < kullanıcıAdıArrayList.size(); i++) {
            System.out.println(kullanıcıAdıArrayList.get(i).toString());
        }


        /** Kullanıcı İşlemleri */

        while (!bitir) {
            System.out.println("Scooter Kiralama Programına Hoş Geldiniz");
            System.out.println("Lütfen kullanıcı adınızı ve şifrenizi giriniz.");
            System.out.print("Kullanıcı Adı: ");
            String kAdı = scan.next();
            System.out.print("Şifre: ");
            String kSifre = scan.next();





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
