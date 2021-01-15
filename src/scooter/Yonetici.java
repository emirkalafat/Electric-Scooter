package scooter;

import java.util.Scanner;
/**
 * @author emirklft
 */
public class Yonetici extends Kullanici {
    public Yonetici(String adi, String soyadi, String kullaniciAdi, String kullaniciSifresi) {
        super(adi, soyadi, kullaniciAdi, kullaniciSifresi);
        this.setKullaniciTuru("admin");
    }


    public void aracEkle(Istasyon istasyon, Araclar araclar) {
        araclar.setIstasyon(istasyon);
        istasyon.aracEkle(araclar);
        System.out.println(araclar + " " + istasyon + " istasyonuna başarıyla eklendi.");
    }

    public void aracKaldir(Istasyon istasyon, Araclar araclar) {
        if (istasyon.getAracListesi().contains(araclar)) {
            String mesaj = "******************************************************************************************" +
                    "\n" + istasyon.getAracListesi().get(istasyon.getAracListesi().indexOf(araclar)) + " Özelliklerine sahip scooterı kaldırdınız. ";
            sifreDenetimi(istasyon, araclar, mesaj);
            istasyon.aracKaldir(araclar);
            System.out.println(araclar + " " + istasyon + " istasyonundan başarıyla kaldırıldı.");
        } else {
            System.out.println("Belirtilen scooter istasyonda bulunmamaktadır!");
        }
    }

    public void aracKaldir(Istasyon istasyon) {
        if (istasyon.getAracListesi().size() != 0) {
            System.out.println("İstasyonda bulunan araçlar : ");
            for (int i = 0; i < istasyon.getAracListesi().size(); i++) {
                System.out.println(i + 1 + ". " + istasyon.getAracListesi().get(i).istasyondakiArac());
            }
            for (int i = 0; i < istasyon.getAracListesi().size(); i++) {
                System.out.println("\n" + (i + 1) + ". " + istasyon.getAracListesi().get(i).istasyondakiArac());
                System.out.println("Bu aracı istasyondan gerçekten kaldırmak istiyor musunuz? [Evet/Hayır]");
                Scanner scan = new Scanner(System.in);
                char girdi = scan.next().charAt(0);
                switch (girdi) {
                    case 'E' | 'e':
                        String mesaj = "******************************************************************************************" +
                                "\n" + istasyon.getAracListesi().get(i).istasyondakiArac() + " Özelliklerine sahip scooterı kaldırdınız. ";
                        sifreDenetimi(istasyon, i, mesaj);
                        return;
                    case 'H' | 'h':
                        System.out.println("Araç kaldırılmadı.");
                        break;
                    default:
                        System.out.println("Geçersiz işlem. Ana menüye dönülüyor!");
                        break;
                }
            }
        }
    }

    public void kullaniciBilgileriniGetir(Kullanici kullanici) {
        System.out.println(kullanici.toString());
    }
    public void aracBilgileriniGetir(Araclar araclar){
        System.out.println(araclar.toString());
    }
}