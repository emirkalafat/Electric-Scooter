public class Test {
    public static void main(String[] args) {
        Yonetici admin1 = new Yonetici("Ahmet", "123ahmet");
        Istasyon istasyon1 = new Istasyon("istanbul", "bayrampaşa");
        Istasyon istasyon2 = new Istasyon("istanbul", "kadıköy");
        Istasyon istasyon3= new Istasyon("istanbul","fatih");
        Istasyon istasyon4= new Istasyon("kastamonu","abana");
        Araclar arac1 = new Araclar(30, 85, "mavi", istasyon1);
        Araclar arac2 = new Araclar(20, 56, "mavi", istasyon1);
        Suruculer surucu1 = new Suruculer("Hasan", "123456");
        Kullanıcılar admin2 = new Yonetici("Zehra", "123sdf");

        System.out.println(surucu1.isAdminMi());
        System.out.println(arac1.getŞarjDurumu() + " " + arac1.getMaxHız() + " " + arac1.getIl());
        System.out.println(admin2.isAdminMi());
        System.out.println(arac1.getSeriNumarası());
        System.out.println(arac2.getSeriNumarası());
        System.out.println(arac1.aracınKonumu());
    }


}



