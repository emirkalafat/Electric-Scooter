package scooter;


import java.util.Scanner;

public class Tarife {
    Scanner scanner = new Scanner(System.in);

    public boolean fotocekimi() {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Scooterın fotoğrafını çekiniz! [Çektim] ");
        char EH = scanner.next().charAt(0);
        return EH == 'ç' | EH == 'Ç';
    }

    public int sureHesabi() {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Aracı kaç dakika kullandınız? [dakika cinsinden değer] ");
        return scanner.nextInt();
    }

    public int tarifeHesabi() {
        if (fotocekimi()) {
            switch (sureHesabi() / 60) {
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
            switch (sureHesabi() / 60) {
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