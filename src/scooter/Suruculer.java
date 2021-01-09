package scooter;

/**
 * @author emirklft
 */
public class Suruculer extends Kullanıcılar {

    public Suruculer(String adi, String soyadi, String kullaniciAdi) {
        super(adi, soyadi, kullaniciAdi);
    }


    public void aracıTeslimAl(Istasyon bulunduguYer, Araclar arac) {
        if (this.getBakiye() > 0) {
            if (bulunduguYer.aracListesi.size() != 0) {
                System.out.println("Lütfen kurallara uyunuz! Keyifli sürüşler. ");
                arac.setSofor(this);
                bulunduguYer.aracListesi.remove(arac);

            } else {
                System.out.println("Bulunduğunuz istasyonda scooter mevcut değildir!!");
            }
        } else System.out.println("Bakiyeniz sıfırın altındadır. Araç kiralamadan önce bakiye yükleyiniz.");

    }

    public void aracıTeslimEt(Araclar araclar, Istasyon gidecegiYer, int kullanımSüresiDAKİKA) {
       if (araclar.getSofor()!=null){
           Tarife fiyat = new Tarife();

           this.setBakiye(this.getBakiye() - fiyat.tarifeHesabı(kullanımSüresiDAKİKA));
           System.out.println("Scooter başarıyla teslim edildi!");
           if (this.getBakiye() < 0) {
               System.out.println("bakiyeniz eksiye düştü. En kısa zamanda para yükleyiniz.");
           }
           araclar.setIstasyon(gidecegiYer);
           gidecegiYer.aracListesi.add(araclar);
           araclar.setSofor(null);
       }else {
           System.out.println("HATALI İŞLEM. Herhangi bir scooter kiralamadınız!!");
       }

    }


}

