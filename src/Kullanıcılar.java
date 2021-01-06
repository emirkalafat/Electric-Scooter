public class Kullanıcılar {
    private String kullanıcıAdı, kullanıcıSifresi;
    private boolean adminMi;

    public Kullanıcılar(String kullanıcıAdı, String kullanıcıSifresi) {
        this.kullanıcıAdı = kullanıcıAdı;
        this.kullanıcıSifresi = kullanıcıSifresi;
        this.adminMi = false;
    }

    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    public boolean isAdminMi() {
        return adminMi;
    }

    public void setAdminMi(boolean adminMi) {
        this.adminMi = adminMi;
    }

    public String getKullanıcıSifresi() {
        return kullanıcıSifresi;
    }

    public void setKullanıcıSifresi(String kullanıcıSifresi) {
        this.kullanıcıSifresi = kullanıcıSifresi;
    }
}
