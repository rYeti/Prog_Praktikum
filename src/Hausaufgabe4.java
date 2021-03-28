import static jsTools.Graph.*;

public class Hausaufgabe4 {
    
    public static void main(String[] args) {
        smiley(250, 0, 400);
    }

    static void smiley(int x, int y, int d){
        if(d < 3) return;
        //Zeichnen des Gesichts
        addCircleBorder(x, y, d, yellow);
        //Zeichnen vom Mund
        addCircle(x+(int)(d/4),y+(int)(d/2.5), (int)(d/1.9), red);
        addCircle(x+(int)(d/4), y+(int)(d/3), (int)(d/1.9), yellow);
        //Zeichnen der Nase
        addCircle(x+(int)(d/2.7), y+(int)(d/2.3), d/4, red);
        //Zeichnen von den Augen
        //links
        smiley(x+d/8, y+d/9, d/3);
        //rechts
        smiley((int)(x+d/1.8), y+d/9, d/3);
    
        
    }
}