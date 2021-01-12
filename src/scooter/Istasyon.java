package scooter;

import java.util.ArrayList;


/**
 * @author emirklft
 */

public class Istasyon {
    private String il, ilce;
    private ArrayList<Araclar> aracListesi = new ArrayList<>();

    public Istasyon(String il, String ilce) {
        this.il = il;
        this.ilce = ilce;
    }

    void aracEkle(Araclar a) {
        if (a.getIstasyon() == null) {
            this.aracListesi.add(a);
            a.setIstasyon(this);
        } else {
            System.out.println("Belirtilen scooter zaten bir istasyonda mevcut.");
            /* !!!MANTIKSIZ İŞLEM!!!! scooter bi anda diğer istasyona ışınlanamaz */
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

    void aracKaldir(Araclar a) {
        this.getAracListesi().remove(a);
        a.setIstasyon(null);
    }

    void araclariListele() {

        if (this.getAracListesi().size() != 0) {
            System.out.println(this.getIl() + " " + this.getIlce() + " istasyonundaki araçlar: ");
            for (int i = 0; i < this.getAracListesi().size(); i++) {
                System.out.println("[" + i + "] " + getAracListesi().get(i));
            }
        } else System.out.println(this.getIl() + " " + this.getIlce() + " istasyonda araç yoktur.");
    }

    @Override
    public String toString() {
        return " il='" + il + '\'' +
                ", ilçe='" + ilce + '\'';


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

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }
}