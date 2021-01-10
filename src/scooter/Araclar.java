package scooter;
/**
 *
 * @author emirklft
 */
public class Araclar {
    private String renk;
    private int hız;
    private Suruculer sofor;
    private Istasyon istasyon;

    public Araclar(String renk, int hız) {
        this.renk = renk;
        this.hız = hız;
        this.sofor = null;
        this.istasyon = null;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", hız=" + hız +
                ", sofor=" + sofor +
                ", istasyon=" + istasyon +
                '}';
    }

    public Istasyon getIstasyon() {
        return istasyon;
    }

    public void setIstasyon(Istasyon istasyon) {
        this.istasyon = istasyon;
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
}