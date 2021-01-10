package scooter;

import java.util.ArrayList;

/**
 * @author emirklft
 */
public class Kullanıcılar {
    private String adi, soyadi, kullaniciAdi, kullaniciTuru, kullanıcıSirfesi;
    private int bakiye;
    private boolean aracEklemeYetkisi, aracKaldırmaYetkisi;

    public Kullanıcılar(String adi, String soyadi, String kullaniciAdi, String kullanıcıSirfesi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.kullaniciAdi = kullaniciAdi;
        this.kullanıcıSirfesi = kullanıcıSirfesi;
        this.kullaniciTuru = "şöför";
        this.aracEklemeYetkisi = false;
        this.aracKaldırmaYetkisi = false;
    }

    void bakiyeYukle(int paraTL) {
        if (this.kullaniciTuru == "şöför")
            this.bakiye = this.bakiye + paraTL;
        else System.out.println("Admin hesbı bakiye yüklemeye uygun değildir. Lütfen şöför hesabı ile giriş yapınız.");
    }

    @Override
    public String toString() {
        return "Kullanıcılar{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", kullaniciTuru='" + kullaniciTuru + '\'' +
                ", bakiye=" + bakiye +
                '}';
    }

    public String getKullanıcıSirfesi() {
        return kullanıcıSirfesi;
    }

    public void setKullanıcıSirfesi(String kullanıcıSirfesi) {
        this.kullanıcıSirfesi = kullanıcıSirfesi;
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