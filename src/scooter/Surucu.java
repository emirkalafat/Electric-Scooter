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
       if (this.getSurulenArac() == null) {
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
                       char girdi = scan.next().charAt(0);
                       switch (girdi) {
                           case 'E' | 'e':
                               String mesaj = "******************************************************************************************" +
                                       "\n" + bulunduguYer.getAracListesi().get(i).istasyondakiArac() + " Özelliklerine sahip scooterı kiraladınız. " +
                                       "\nLütfen kurallara uyunuz! Keyifli sürüşler. Scooteri teslim ederken fotoğrafını çekip sisteme yüklemeyi unutmayın!" +
                                       "\n**************************************************************************************************";
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
               } else System.out.println("Bulunduğunuz istasyonda scooter mevcut değildir!!");
           } else System.out.println("Bakiyeniz sıfırın altındadır. Araç kiralamadan önce bakiye yükleyiniz.");
       }else System.out.println("Zaten bir araç kiraladınız. Yeni bir araç kiralamadan önce sürmekte olduğunuz aracı teslim ediniz.");
    }

    public void araciTeslimEt(Istasyon gidecegiYer) {
        if (surulenArac != null) {
            Tarife fiyat = new Tarife();
            System.out.println("Scooterınızı teslim ediyorsunuz!");
            this.setBakiye(this.getBakiye() - fiyat.tarifeHesabi());
            System.out.println("Scooter başarıyla teslim edildi!" +
                    "\nYeni bakiyeniz : " + this.getBakiye()+ " TL'dir.");

            if (this.getBakiye() < 0) {
                System.out.println("Bakiyeniz eksiye düştü. En kısa zamanda para yükleyiniz.");
            }

            this.getSurulenArac().setIstasyon(gidecegiYer);
            gidecegiYer.getAracListesi().add(surulenArac);
            this.getSurulenArac().setSofor(null);
        } else {
            System.out.println("HATALI İŞLEM. Herhangi bir scooter kiralamadınız!!");
        }

    }

    @Override
    public String toString() {
        return "Surucu{" +
                "adi='" + this.getKullaniciAdi()+ '\'' +
                ", soyadi='" + this.getSoyadi() + '\'' +
                ", kullaniciAdi='" + this.getKullaniciAdi() + '\'' +
                ", kullaniciTuru='" + this.getKullaniciTuru() + '\'' +
                ", bakiye=" + this.getBakiye() + '\'' +
                ", sürdüğü araç=" + this.getSurulenArac().istasyondakiArac()+
                '}';
    }

    public Araclar getSurulenArac() {
        return surulenArac;
    }

    public void setSurulenArac(Araclar surulenArac) {
        this.surulenArac = surulenArac;
    }
}