package scooter;


public class Tarife {

    public int tarifeHesabı(int kullanımSüresi, boolean fotoCekildiMi) {
        if (fotoCekildiMi) {
            switch (kullanımSüresi / 60) {
                case 0:
                    return 4;
                case 1:
                    return 6;
                case 2:
                    return 8;
                case 3:
                    return 13;
                case 4:
                    return 17;
                case 5:
                    return 22;
                default:
                    return 30;
            }
        } else {
            switch (kullanımSüresi / 60) {
                case 0:
                    return 10;
                case 1:
                    return 20;
                case 2:
                    return 30;
                case 3:
                    return 40;
                case 4:
                    return 50;
                case 5:
                    return 60;
                default:
                    return 70;
            }
        }
    }
}