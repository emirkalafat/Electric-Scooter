package scooter;
/**
 *
 * @author emirklft
 */
public class Kullanıcılar {
    private String adi, soyadi , kullaniciAdi,kullaniciTuru;
    private int bakiye;
    private boolean aracEklemeYetkisi , aracKaldırmaYetkisi;



    public Kullanıcılar(String adi, String soyadi, String kullaniciAdi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciTuru = "söför";
        this.aracEklemeYetkisi=false;
        this.aracKaldırmaYetkisi=false;

    }
    void bakiyeYukle(int paraTL){
        this.bakiye = this.bakiye + paraTL;
    }


    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciTuru() {
        return kullaniciTuru;
    }

    public void setKullaniciTuru(String kullaniciTuru) {
        this.kullaniciTuru = kullaniciTuru;
    }

    public boolean isAracEklemeYetkisi() {
        return aracEklemeYetkisi;
    }

    public void setAracEklemeYetkisi(boolean aracEklemeYetkisi) {
        this.aracEklemeYetkisi = aracEklemeYetkisi;
    }

    public boolean isAracKaldırmaYetkisi() {
        return aracKaldırmaYetkisi;
    }

    public void setAracKaldırmaYetkisi(boolean aracKaldırmaYetkisi) {
        this.aracKaldırmaYetkisi = aracKaldırmaYetkisi;
    }
}
