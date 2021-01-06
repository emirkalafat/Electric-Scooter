
public class Araclar extends Istasyon {
    private int maxHız, şarjDurumu, seriNumarası;
    private String renk;
    private int numara = 1;

    public void butunAraclar() {

    }

    public Araclar(String il, String ilçe, int maxHız, int şarjDurumu, int seriNumarası, Istasyon istasyon) {
        super(istasyon.getIl(), istasyon.getIlçe());
        this.maxHız = maxHız;
        this.şarjDurumu = şarjDurumu;
        this.seriNumarası = seriNumarası;
        this.renk = "siyah";
    }

    public Araclar(int maxHız, int şarjDurumu, String renk, Istasyon istasyon) {
        super(istasyon.getIl(), istasyon.getIlçe());
        this.maxHız = maxHız;
        this.şarjDurumu = şarjDurumu;
        this.renk = renk;
        this.seriNumarası = numara;
        numara++;
    }

    public int getSeriNumarası() {
        return seriNumarası;
    }


    public int getMaxHız() {
        return maxHız;
    }

    public void setMaxHız(int maxHız) {
        this.maxHız = maxHız;
    }

    public int getŞarjDurumu() {
        return şarjDurumu;
    }

    public void setŞarjDurumu(int şarjDurumu) {
        this.şarjDurumu = şarjDurumu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }


}
