package Aufgabe_9;

public class Loewe extends Tier {

    Loewe(int posx, int posy, double gewicht, int luft, int keafig) {
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
        System.out.println("Vierbeiner: " + getClass().getSimpleName());
    }

    @Override
    void versteandigung() {
        // TODO Auto-generated method stub
        System.out.println("Brüllen");
    }

    @Override
    void liebligsbeutetier() {
        // TODO Auto-generated method stub
        System.out.println("Lieblingsbeute Tier von " + getClass().getSimpleName() + "ist.");
    }

    public static void main(String[] args) {
        Loewe l = new Loewe(23, 34, 54, 5, 7);
        l.fortbewegung();
    }
}