package Aufgabe_9;

public class Wolf extends Tier {

    Wolf(int posx, int posy, double gewicht, int luft, int keafig) {
        this.posx = posx;
        this.posy = posy;
        this.gewicht = gewicht;
        temp = luft;
        this.keafig = keafig;
    }

    @Override
    void paint(int b, int h, String file) {
        super.paint(b, h, file);
    }

    @Override
    void fortbewegung() {

        System.out.println("Vierbeiner: " + getClass().getSimpleName());
    }

    @Override
    void versteandigung() {

        System.out.println("verseandigungmethode von " + getClass().getSimpleName());
    }

    @Override
    void liebligsbeutetier() {

        System.out.println("Lieblingsbeutetier von " + getClass().getSimpleName() + " ist Hase.");
    }
}