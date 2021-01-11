package scooter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author emirklft
 */

public class Istasyon {
    private String il, ilçe;
    private ArrayList<Araclar> aracListesi = new ArrayList<>();

    public Istasyon(String il, String ilçe) {
        this.il = il;
        this.ilçe = ilçe;
    }

    void aracEkle(Araclar a) {
        if (a.getIstasyon() == null) {
            this.aracListesi.add(a);
            a.setIstasyon(this);
        }else {
            System.out.println("Belirtilen scooter zaten bir istasyonda mevcut.");
            /** !!!MANTIKSIZ İŞLEM!!!! scooter bi anda diğer istasyona ışınlanamaz */
            /* \n belirtilen scooterı " + this.toString() + " istasyona taşımak ister misiniz?");
            Scanner scan = new Scanner(System.in);
            Character girdi = scan.next().charAt(0);
            switch (girdi) {
                case 'E' | 'e':
                    a.getIstasyon().aracListesi.remove(a);
                    this.aracListesi.add(a);
                    a.setIstasyon(this);
                    break;
                case 'H' | 'h':
                    break;
                default:
                    System.out.println("Geçersiz işlem!");
                    break;
            }*/
        }
    }
    void aracKaldır(Araclar a){
        this.aracListesi.remove(a);
        a.setIstasyon(null);
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
        return " il='" + il + '\'' +
                ", ilçe='" + ilçe + '\'' ;


    }

    public ArrayList<Araclar> getAracListesi() {
        return aracListesi;
    }

    public void setAracListesi(ArrayList<Araclar> aracListesi) {
        this.aracListesi = aracListesi;
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