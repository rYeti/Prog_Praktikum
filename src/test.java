import static jsTools.Graph.*;
public class test {
    public static void main(String args[]){
        Mylist li=new Mylist();
        li.addBegin(10,50,"one");
        li.addBegin(10,50,"2od");
        li.addBegin(10,50,"3rd");
        li.paint();
    }
}

class Mylist{
    Knoten anfang;
    int posx, posy;

    final static int l=30;
    /**
     * vorne einen neuen Knoten einfuegen
     * @param txt
     */
    void addBegin(int x, int y, String txt){
        posx=x;
        posy=y;
        anfang=new Knoten(txt,anfang);
    }
    void paint(){
        addRectBorder(posx,posy,l,l,lightGray);
        // hier koennen wir den Knoten auch beliebig verschoenern
        // als Lock malen...
        if (anfang!= null){
            addArrow(posx+l/2,posy+l/2,posx+2*l,posy+l/2,black);
            anfang.paint(posx+2*l,posy);
        }

    }
}

class Knoten{
    String inhalt;
    Knoten next;

    final static int b=80, h=30;
    /**
     * Konstruktor - automatisch generiert - rechte Maustaste, generate...
     * @param inhalt
     * @param next
     */
    public Knoten(String inhalt, Knoten next) {
        this.inhalt = inhalt;
        this.next = next;
    }
    void paint(int x, int y) {
        addRectBorder(x,y,b,h,blue,inhalt);
        // und auch hier koennen wir beliebig verschoenern
        if (next != null) {
            addArrow(x+b-h/2,y+h/2,x+b+b/2,y+h/2,black);
            next.paint(x+b+b/2, y);
        } else {
            addLine(x + b - h / 2, y + h / 2, x + b + b / 2, y + h / 2, black);
            final int d=10;
            addCircle(x + b + b / 2, y + h / 2-d/2, d, black);
        }
    }
}
