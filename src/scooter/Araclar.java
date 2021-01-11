package scooter;

/**
 * @author emirklft
 */
public class Araclar {
    private String renk;
    private int hiz;
    private Surucu sofor;
    private Istasyon istasyon;

    public Araclar(String renk, int hiz) {
        this.renk = renk;
        this.hiz = hiz;
        this.sofor = null;
        this.istasyon = null;
    }

    public String soforBilgileriYazdir() {
        if (this.getSofor() == null)
            if (this.getIstasyon() == null)
                return "Bu scooter depoda beklemektedir. Herhangi bir istasyonda bulunmadığı için kullanıcılar bu scooterı kullanamaz. ";
            else
                return "Bu scooterın sürücüsü bulunmamaktadır. " + this.getIstasyon().toString() + " istasyonunda bulunmaktadır.";
        else return this.toString() + " özelliklrine sahip scooterın mevcut sürücüsü : " + this.getSofor();
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "renk='" + renk + '\'' +
                ", hız=" + hiz +
                ", sofor=" + sofor +
                ", istasyon=" + istasyon +
                '}';
    }

    public String istasyondakiArac(){
        return "Scooter{" +
                "renk='" + renk + '\'' +
                ", hız=" + hiz +
                '}';
    }

    public Istasyon getIstasyon() {
        return istasyon;
    }

    public void setIstasyon(Istasyon istasyon) {
        this.istasyon = istasyon;
    }

    public Surucu getSofor() {
        return sofor;
    }

    public void setSofor(Surucu sofor) {
        this.sofor = sofor;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }
}