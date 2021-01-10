package scooter;


public class Tarife{

    public int tarifeHesabı(int kullanımSüresi){
        switch (kullanımSüresi/60){
            case 0 : return 4;
            case 1 : return 6;
            case 2 : return 8;
            case 3 : return 13;
            case 4 : return 17;
            case 5 : return 22;
            default: return 30;
        }
    }
}