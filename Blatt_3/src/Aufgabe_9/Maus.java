package Aufgabe_9;

public class Maus extends Tier {

    Maus(int posx, int posy, double gewicht, int luft, int keafig) {
        this.posx = posx;
        this.posy = posy;
        this.gewicht = gewicht;
        temp = luft;
        this.keafig = keafig;
    }

    @Override
    void paint(int b, int h, String file) {
        // TODO Auto-generated method stub
        super.paint(b, h, file);
    }

    @Override
    void fortbewegung() {
        // TODO Auto-generated method stub
        super.fortbewegung();
    }

    @Override
    void versteandigung() {
        // TODO Auto-generated method stub
        super.versteandigung();
    }

    @Override
    void liebligsbeutetier() {
        // TODO Auto-generated method stub
        super.liebligsbeutetier();
    }
}
