import java.util.Random;

class QuickSort {
    public static void main(String args[]) {
        Liste4Sort theList = new Liste4Sort();
        for (int i = 0; i < 1000; i++)
            theList.insert((int) (Math.random() * 10000));
        // zufaellige Zahlen erzeugen und in Liste einfuegen
        // um Sortierung zu testen
        theList.print("Unsortiert");
        System.out.println("−−−−−−−−Beginn des Sortierens−−−−−−−−−");
        quickSort(theList);
        // Aufruf des Algorithmus
        System.out.println("−−−−−−Fertig sortiert:−−−−−−−−−−−");
        theList.print("Ergebnis");
        theList.isSorted();
    }

    static void quickSort(Liste4Sort l) {
        // hier bitte Ihr Code
        // Liste kleiner gleich 1
        if (l.laenge <= 1)
            return;
        // pivot an erster stelle
        El pivot = l.head;
        // neue Listen
        Liste4Sort biggerOrEqual = new Liste4Sort();
        Liste4Sort smaller = new Liste4Sort();
        // durch die Liste laufen
        for (El curr = l.head.nf; curr != null; curr = curr.nf) {
            // wert groesser povot 
            if (curr.cont >= pivot.cont) {
                biggerOrEqual.insert(curr.cont);
            } else {
                // wert kleiner pivot
                smaller.insert(curr.cont);
            }
        }
        quickSort(smaller);
        quickSort(biggerOrEqual);
        // neachster Note von pivot ist groesser
        pivot.nf = biggerOrEqual.head;
        //kleiner am anfang der Liste einfuegen
        smaller.append(l);
        l.head = smaller.head;
        
    }
}

class Liste4Sort {
    El head;
    int laenge = 0;

    void insert(int c) {
        laenge++;
        head = new El(c, head);
    }

    void append(Liste4Sort li) {
        if (head != null) {
            laenge += li.laenge;
            head.append(li.head);
        } else {
            laenge = li.laenge;
            head = li.head;
        }
    }

    void print(String txt) {
        System.out.print("Liste " + txt + "der Laenge " + laenge + ": ");
        if (head != null)
            head.print();
        System.out.println("***");
    }

    boolean isSorted() {
        El curr = head;
        for (curr = head; curr != null; curr = curr.nf) {
            if (curr.nf != null) {
                if (curr.cont > curr.nf.cont) {
                    System.out.println("Liste wurde nicht richtig sortiert");
                    return false;
                }
            }
        }
        System.out.println("Liste ist sortiert");
        return true;
    }
}

class El {
    int cont;
    El nf;

    void append(El p) {
        if (nf == null) {
            nf = p;
        } else {
            nf.append(p);
        }
    }

    public El(int cont, El nf) {
        this.cont = cont;
        this.nf = nf;
    }

    void print() {
        System.out.print(cont + " ");
        if (nf != null)
            nf.print();
    }
}