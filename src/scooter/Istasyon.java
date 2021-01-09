package scooter;

import java.util.ArrayList;

/**
 * @author emirklft
 */

public class Istasyon {
    private String il, ilçe;

    ArrayList<Araclar> aracListesi = new ArrayList<>();

    void aracEkle(Araclar a) {
        this.aracListesi.add(a);
        a.setIstasyon(this);

    }

    void araclarıListele() {

        if (this.aracListesi.size() != 0) {
            System.out.println(this.getIl() + " " + this.getIlçe() + " istasyonundaki araçlar: ");
            for (int i = 0; i < this.aracListesi.size(); i++) {
                System.out.println("[" + i + "] " + aracListesi.get(i));
            }
        } else System.out.println(this.getIl() + " " + this.getIlçe() + " istasyonda araç yoktur.");
    }

    @Override
    public String toString() {
        return "il='" + il + '\'' +
                ", ilçe='" + ilçe + '\'' +
                '}';

    }

    public Istasyon(String il, String ilçe) {
        this.il = il;
        this.ilçe = ilçe;

    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlçe() {
        return ilçe;
    }

    public void setIlçe(String ilçe) {
        this.ilçe = ilçe;
    }


}
