package scooter;
/**
 *
 * @author emirklft
 */
public class Yonetici extends Kullanıcılar {
    public Yonetici(String adi, String soyadi, String kullaniciAdi) {
        super(adi, soyadi, kullaniciAdi);
        this.setAracEklemeYetkisi(true);
        this.setAracKaldırmaYetkisi(true);
    }
}
