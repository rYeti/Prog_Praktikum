import static jsTools.Graph.*;

class KettenTest {
    public static void main(String[] args) {
        Lok lok = new Lok(35, 40, 100, 50, "black");
        Wagon d = new Wagon(100, 50, "green");
        Wagon p = new Wagon(100, 50, "green");
        lok.appWagon(p);
        lok.appWagon(d);
        lok.paint();
    }
}

class Lok {

    int posx;
    int posy;
    String color;
    int lenght;
    int hight;
    Wagon wagon;

    Lok(int posx, int posy, int lenght, int hight, String color) {
        this.posx = posx;
        this.posy = posy;
        this.lenght = lenght;
        this.hight = hight;
        this.color = color;

    }

    void appWagon(Wagon w) {
        w.next = wagon;
        wagon = w;

    }

    void paint() {
        addRect(posx, posy, lenght, hight, color);
        addLine(posx + lenght / 2, posy + hight / 2, posx + lenght * 2, posy + hight / 2, blue);
        wagon.paint(posx + lenght * 2, posy, green);
    }
    /*
     * 1. Eine Methode, die bei einem Zug den ersten Wagon entnimmt und als R
     * ̈uckgabewert zur ̈uckliefert if(wagon.nr == 1) wagon.paint(posx+lenght*2,
     * posy, green); 2. Eine Methode, die bei einem Zug den letzten Wagon abkoppelt
     * und als R ̈uckgabewert zur ̈uckliefert. if(wagon.next == null)d
     * 
     */
}

class Wagon {
    int lenght;
    int hight;
    String color;
    Wagon next;
    static Integer nr = 0;

    Wagon(int lenght, int hight, String color) {
        this.lenght = lenght;
        this.hight = hight;
        this.color = color;
        nr++;
    }

    void paint(int posx, int posy, String color) {
        addRectBorder(posx, posy, lenght, hight, color);
        if (next != null) {
            addLine(posx + lenght / 2, posy + hight / 2, posx + lenght * 2, posy + hight / 2, blue);
            next.paint(posx + lenght * 2, posy, color);
        }
        addLine(posx + lenght / 2, posy + hight / 2, posx + lenght * 2, posy + hight / 2, blue);
    }
}