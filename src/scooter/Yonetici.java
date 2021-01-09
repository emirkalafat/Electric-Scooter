package scooter;
/**
 *
 * @author emirklft
 */
public class Yonetici extends Kullanıcılar {
    public Yonetici(String adi, String soyadi, String kullaniciAdi, String kullanıcıSirfesi) {
        super(adi, soyadi, kullaniciAdi,kullanıcıSirfesi);
        this.setAracEklemeYetkisi(true);
        this.setAracKaldırmaYetkisi(true);
    }

    public void aracEkle(Istasyon istasyon, Araclar araclar){
        araclar.setIstasyon(istasyon);
        istasyon.aracEkle(araclar);
    }
    public void aracKaldır(Istasyon istasyon, Araclar araclar){
        if (istasyon.aracListesi.contains(araclar)){
            istasyon.aracKaldır(araclar);
        }else{
            System.out.println("Belirtilen scooter istasyonda bulunmamaktadır!");
        }
    }
}
