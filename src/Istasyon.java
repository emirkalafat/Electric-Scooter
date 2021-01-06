public class Istasyon {
    private String il , ilçe ;
    private int aracSayısı;



    public Istasyon(String il , String ilçe){
        this.il=il;
        this.ilçe= ilçe;
    }

    public String aracınKonumu(){
        return "Aracın konumu : "+getIl()+" "+getIlçe();
    }

    public int getAracSayısı() {
        return aracSayısı;
    }

    public void setAracSayısı(int aracSayısı) {
        this.aracSayısı = aracSayısı;
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
