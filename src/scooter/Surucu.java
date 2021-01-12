package scooter;

import java.util.Scanner;

/**
 * @author emirklft
 */
public class Surucu extends Kullanici {
    private Araclar surulenArac;

    public Surucu(String adi, String soyadi, String kullaniciAdi, String kullaniciSifresi) {
        super(adi, soyadi, kullaniciAdi, kullaniciSifresi);
        this.surulenArac = null;
    }

    public void araciTeslimAl(Istasyon bulunduguYer) {
        if (this.getBakiye() > 0) {
            if (bulunduguYer.getAracListesi().size() != 0) {
                System.out.println("İstasyonda bulunan araçlar : ");
                for (int i = 0; i < bulunduguYer.getAracListesi().size(); i++) {
                    System.out.println(i + 1 + ". " + bulunduguYer.getAracListesi().get(i).istasyondakiArac());
                }
                for (int i = 0; i < bulunduguYer.getAracListesi().size(); i++) {
                    System.out.println("\n" + (i + 1) + ". " + bulunduguYer.getAracListesi().get(i).istasyondakiArac());
                    System.out.println("Bu aracı almak ister misiniz? [Evet/Hayır]");
                    Scanner scan = new Scanner(System.in);
                    Character girdi = scan.next().charAt(0);
                    switch (girdi) {
                        case 'E' | 'e':
                            String mesaj = "******************************************************************************************" +
                                    "\n" + bulunduguYer.getAracListesi().get(i).istasyondakiArac() + " Özelliklerine sahip scooterı kiraladınız. " +
                                    "\nLütfen kurallara uyunuz! Keyifli sürüşler. Scooteri teslim ederken fotoğrafını çekip sisteme yüklemeyi unutmayın!";
                            sifreDenetimi(bulunduguYer, i, mesaj);
                            return;
                        case 'H' | 'h':
                            System.out.println("Araç alınmadı.");
                            break;
                        default:
                            System.out.println("Geçersiz işlem. Ana menüye dönülüyor!");
                            break;
                    }
                }


            } else {
                System.out.println("Bulunduğunuz istasyonda scooter mevcut değildir!!");
            }
        } else System.out.println("Bakiyeniz sıfırın altındadır. Araç kiralamadan önce bakiye yükleyiniz.");

    }

    public void araciTeslimEt(Istasyon gidecegiYer) {
        if (surulenArac != null) {
            Tarife fiyat = new Tarife();
            System.out.println("Scooterınızı teslim ediyorsunuz!");
            this.setBakiye(this.getBakiye() - fiyat.tarifeHesabi());
            System.out.println("Scooter başarıyla teslim edildi!" +
                    "\n yeni bakiyeniz : " + this.getBakiye());

            if (this.getBakiye() < 0) {
                System.out.println("bakiyeniz eksiye düştü. En kısa zamanda para yükleyiniz.");
            }

            this.getSurulenArac().setIstasyon(gidecegiYer);
            gidecegiYer.getAracListesi().add(surulenArac);
            this.getSurulenArac().setSofor(null);
        } else {
            System.out.println("HATALI İŞLEM. Herhangi bir scooter kiralamadınız!!");
        }

    }

    public Araclar getSurulenArac() {
        return surulenArac;
    }

    public void setSurulenArac(Araclar surulenArac) {
        this.surulenArac = surulenArac;
    }
}