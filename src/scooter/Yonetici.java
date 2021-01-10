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
        this.setKullaniciTuru("admin");
    }

    public void aracEkle(Istasyon istasyon, Araclar araclar){
        araclar.setIstasyon(istasyon);
        istasyon.aracEkle(araclar);
        System.out.println(araclar+" "+ istasyon+ " istasyonuna başarıyla eklendi.");
    }
    public void aracKaldır(Istasyon istasyon, Araclar araclar){
        if (istasyon.getAracListesi().contains(araclar)){
            istasyon.aracKaldır(araclar);
            System.out.println(araclar+" "+ istasyon+ " istasyonundan başarıyla kaldırıldı.");
        }else{
            System.out.println("Belirtilen scooter istasyonda bulunmamaktadır!");
        }
    }
}
