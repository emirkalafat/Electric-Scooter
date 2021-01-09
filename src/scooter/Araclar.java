package scooter;
/**
 *
 * @author emirklft
 */
public class Araclar {
    private String renk;
    private int hız, sarj;
    private Suruculer sofor;
    private Istasyon istasyon;



    public Istasyon getIstasyon() {
        return istasyon;
    }

    public void setIstasyon(Istasyon istasyon) {
        this.istasyon = istasyon;
    }

    @Override
    public String toString() {
        return "Araclar{" +
                "renk='" + renk + '\'' +
                ", hız=" + hız +
                ", sarj=" + sarj +
                ", sofor=" + sofor +
                ", istasyon=" + istasyon +
                '}';
    }

    public Araclar(String renk, int hız, int sarj) {
        this.renk = renk;
        this.hız = hız;
        this.sarj = sarj;
        this.sofor = null;
        this.istasyon = null;
    }

    public Suruculer getSofor() {
        return sofor;
    }

    public void setSofor(Suruculer sofor) {
        this.sofor = sofor;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getHız() {
        return hız;
    }

    public void setHız(int hız) {
        this.hız = hız;
    }

    public int getSarj() {
        return sarj;
    }

    public void setSarj(int sarj) {
        this.sarj = sarj;
    }
}