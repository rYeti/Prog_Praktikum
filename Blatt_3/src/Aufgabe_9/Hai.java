package Aufgabe_9;

public class Hai extends Tier {

    Hai(int posx, int posy, double gewicht, int luft, int aqua) {
        this.posx = posx;
        this.posy = posy;
        this.gewicht = gewicht;
        temp = luft;
        aqurium = aqua;
    }

    @Override
    void paint(int b, int h, String file) {
        
        super.paint(b, h, file);
    }

    @Override
    void fortbewegung() {
        
        System.out.println("Schwimmen");
    }

    @Override
    void versteandigung() {
        
        System.out.println("verseandigungmethode von " + getClass().getSimpleName());
    }

    @Override
    void liebligsbeutetier() {
        
        System.out.println("Lieblingsbeutetier von " + getClass().getSimpleName() + " sind Fische.");
    }
}
