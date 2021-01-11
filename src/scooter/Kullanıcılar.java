package scooter;

import java.util.Scanner;

/**
 * @author emirklft
 */
public class Kullanıcılar {
    private String adi, soyadi, kullaniciAdi, kullaniciTuru, kullanıcıSifresi;
    private int bakiye;
    private boolean aracEklemeYetkisi, aracKaldırmaYetkisi;

    public void sifreDenetimi(Istasyon istasyon, int i, String mesaj) {
        System.out.print("Şifrenizi giriniz: ");
        Scanner scan = new Scanner(System.in);
        String sifre = scan.next();
        if (this.getKullanıcıSifresi().equals(sifre)) {
            System.out.println(mesaj);
            if (this.kullaniciTuru.equals("şöför")) {
                ((Suruculer) this).setAraclar(istasyon.getAracListesi().get(i));
                istasyon.getAracListesi().get(i).setSofor((Suruculer) this);
            }
            istasyon.getAracListesi().remove(i);
        } else {
            System.out.println("Şifreniz Yanlış!!");
            sifreDenetimi(istasyon, i, mesaj);
        }
    }

    public void sifreDenetimi(Istasyon istasyon, Araclar araclar, String mesaj) {
        System.out.print("Şifrenizi giriniz: ");
        Scanner scan = new Scanner(System.in);
        String sifre = scan.next();
        if (this.getKullanıcıSifresi().equals(sifre)) {
            System.out.println(mesaj);
            istasyon.aracKaldır(araclar);
        } else {
            System.out.println("Şifreniz Yanlış!!");
            sifreDenetimi(istasyon, araclar, mesaj);
        }
    }

    public Kullanıcılar(String adi, String soyadi, String kullaniciAdi, String kullanıcıSifresi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.kullaniciAdi = kullaniciAdi;
        this.kullanıcıSifresi = kullanıcıSifresi;
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

    public String getKullanıcıSifresi() {
        return kullanıcıSifresi;
    }

    public void setKullanıcıSifresi(String kullanıcıSifresi) {
        this.kullanıcıSifresi = kullanıcıSifresi;
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