package Aufgabe_9;

public class Schmetterling extends Tier {

    Schmetterling(int posx, int posy, double gewicht, int luft, int aqua, int fluegelspannweite) {
        this.posx = posx;
        this.posy = posy;
        this.gewicht = gewicht;
        temp = luft;
        aqurium = aqua;
        this.fluegelspannweite = fluegelspannweite;
    }

    @Override
    void paint(int b, int h, String file) {
        
        super.paint(b, h, file);
    }

    @Override
    void fortbewegung() {
        
        System.out.println("Fliegen");
    }

    @Override
    void versteandigung() {
        
        System.out.println("verseandigungmethode von " + getClass().getSimpleName());
    }

    @Override
    void liebligsbeutetier() {
        
        System.out.println(getClass().getSimpleName() + " hat kein Beutetier");
    }
}
