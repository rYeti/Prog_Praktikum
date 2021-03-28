import static jsTools.Graph.*;

class KettenTest {
    public static void main(String[] args) {
        Lok lok = new Lok(35, 40, 100, 50, "black");
        Wagon one = new Wagon(100, 50, "green");
        Wagon two = new Wagon(100, 50, "green");
        Wagon three = new Wagon(100, 50, "green");
        Wagon four = new Wagon(100, 50, "green");
        Wagon five = new Wagon(100, 50, "green");
        lok.appWagon(one);
        lok.appWagon(two);
        lok.appWagon(three);
        lok.appWagon(four);
        lok.appWagon(five);
        lok.paint();
        initWindow(1000, 1000, "getFistWagon");
        Lok lok2 = new Lok(35, 150, 100, 50, "black");
        lok2.appWagon(lok.getFirstWagon());
        lok.paint();
        lok2.paint();
        initWindow(1000, 1000, "Abkopeln Last");
        lok2.appWagon(lok.getLastWagon());
        lok.paint();
        lok2.paint();
        initWindow(1000, 1000, "Ankopeln");
        lok2.umkoppeln(lok);
        lok.paint();
        lok2.paint();
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
        if (wagon == null) {
            wagon = w;
            return;
        }
        w.next = null;
        Wagon last = wagon;
        while (last.next != null) {
            last = last.next;
        }
        last.next = w;
        return;
    }

    void addFist(Wagon w) {
        w.next = wagon;
        wagon = w;

    }

    void paint() {
        addRect(posx, posy, lenght, hight, color);
        addLine(posx + lenght / 2, posy + hight / 2, posx + lenght * 2, posy + hight / 2, blue);
        if(wagon == null) return;
        wagon.paint(posx + lenght * 2, posy, green);
    }

    Wagon getFirstWagon() {
        if (wagon == null)
            return null;
        Wagon w = wagon;
        wagon = w.next;
        w.next = null;
        return w;
    }

    Wagon getLastWagon() {
        if (wagon == null)
            return null;
        Wagon w = wagon;
        if (w.next == null) {
            wagon = null;
            return w;
        }
        while (w.next.next != null) {
            w = w.next;
        }
        Wagon w1 = w.next;
        w.next = null;
        return w1;
    }

    void umkoppeln(Lok n) {
        Wagon w = n.getLastWagon();
        while (w != null) {
            addFist(w);
            w = n.getLastWagon();
        }
    }

}

class Wagon {
    int lenght;
    int hight;
    String color;
    Wagon next;
    static int nr = 1;
    int wagNr = nr;

    Wagon(int lenght, int hight, String color) {
        this.lenght = lenght;
        this.hight = hight;
        this.color = color;
        nr++;
    }

    void paint(int posx, int posy, String color) {
        addRectBorder(posx, posy, lenght, hight, color, "" + wagNr);
        if (next != null) {
            addLine(posx + lenght / 2, posy + hight / 2, posx + lenght * 2, posy + hight / 2, blue);
            next.paint(posx + lenght * 2, posy, color);
        }
        addLine(posx + lenght / 2, posy + hight / 2, posx + lenght * 2, posy + hight / 2, blue);
    }
}