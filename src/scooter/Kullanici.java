package scooter;

import java.util.Scanner;
/**
 * @author emirklft
 */
public class Kullanici {
    private String adi, soyadi, kullaniciAdi, kullaniciTuru, kullaniciSifresi;
    private int bakiye;

    public void sifreDenetimi(Istasyon istasyon, int i, String mesaj) {
        System.out.print("Şifrenizi giriniz: ");
        Scanner scan = new Scanner(System.in);
        String sifre = scan.next();
        if (this.getKullaniciSifresi().equals(sifre)) {
            System.out.println(mesaj);
            if (this.kullaniciTuru.equals("şöför")) {
                ((Surucu) this).setSurulenArac(istasyon.getAracListesi().get(i));
                istasyon.getAracListesi().get(i).setSofor((Surucu) this);
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
        if (this.getKullaniciSifresi().equals(sifre)) {
            System.out.println(mesaj);
            istasyon.aracKaldir(araclar);
        } else {
            System.out.println("Şifreniz Yanlış!!");
            sifreDenetimi(istasyon, araclar, mesaj);
        }
    }

    public Kullanici(String adi, String soyadi, String kullaniciAdi, String kullaniciSifresi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSifresi = kullaniciSifresi;
        this.kullaniciTuru = "şöför";
    }

    public void bakiyeYukle(int paraTL) {
        if (this.kullaniciTuru.equals("şöför"))
            this.bakiye = this.bakiye + paraTL;
        else System.out.println("Admin hesbı bakiye yüklemeye uygun değildir. Lütfen şöför hesabı ile giriş yapınız.");
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", kullaniciTuru='" + kullaniciTuru + '\'' +
                ", bakiye=" + bakiye +
                '}';
    }

    public String getKullaniciSifresi() {
        return kullaniciSifresi;
    }

    public void setKullaniciSifresi(String kullaniciSifresi) {
        this.kullaniciSifresi = kullaniciSifresi;
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


}