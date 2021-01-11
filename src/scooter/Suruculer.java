package scooter;

/**
 * @author emirklft
 */
public class Suruculer extends Kullanıcılar {

    public Suruculer(String adi, String soyadi, String kullaniciAdi, String kullanıcıSifresi) {
        super(adi, soyadi, kullaniciAdi, kullanıcıSifresi);

    }

    public void aracıTeslimAl(Istasyon bulunduguYer, Araclar arac) {
        if (this.getBakiye() > 0) {
            if (bulunduguYer.getAracListesi().size() != 0) {
                System.out.println(arac.toString()+" Özelliklerine sahip scooterı kiraladınız. Lütfen kurallara uyunuz! Keyifli sürüşler. Scooteri teslim ederken fotoğrafını çekip sisteme yüklemeyi unutmayın!");
                arac.setSofor(this);
                bulunduguYer.getAracListesi().remove(arac);

            } else {
                System.out.println("Bulunduğunuz istasyonda scooter mevcut değildir!!");
            }
        } else System.out.println("Bakiyeniz sıfırın altındadır. Araç kiralamadan önce bakiye yükleyiniz.");

    }

    public void aracıTeslimEt(Araclar araclar, Istasyon gidecegiYer, int kullanımSüresiDAKİKA, boolean fotoCekimi) {
        if (araclar.getSofor() != null) {
            Tarife fiyat = new Tarife();

            this.setBakiye(this.getBakiye() - fiyat.tarifeHesabı(kullanımSüresiDAKİKA,fotoCekimi));
            System.out.println("Scooter başarıyla teslim edildi!");
            if (this.getBakiye() < 0) {
                System.out.println("bakiyeniz eksiye düştü. En kısa zamanda para yükleyiniz.");
            }
            araclar.setIstasyon(gidecegiYer);
            gidecegiYer.getAracListesi().add(araclar);
            araclar.setSofor(null);
        } else {
            System.out.println("HATALI İŞLEM. Herhangi bir scooter kiralamadınız!!");
        }

    }


}