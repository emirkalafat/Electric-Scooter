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
}
