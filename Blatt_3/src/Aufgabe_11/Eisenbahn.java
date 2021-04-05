package Aufgabe_11;

import static jsTools.Graph.*;
import java.util.Random.*;

class Lok {
  final int lge = 50, dist = 3, h = 18;
  int posx, posy;
  Wagon wagons;

  Lok(int x, int y) {
    posx = x;
    posy = y;
  }

  void appWagon(Wagon w) {
    if (wagons == null)
      wagons = w;
    else
      wagons.app(w);
  }

  void paint() {
    addRectBorder(posx, posy - h, lge, h, "black");
    addRectBorder(posx + lge / 10, posy - 7 * h / 4, lge / 10, h + h / 2, "black");
    addRectBorder(posx + 3 * lge / 4, posy - 7 * h / 4, lge - 3 * lge / 4, h + h / 2, "black");
    addRectBorder(posx + 3 * lge / 4 + 2, posy - 7 * h / 4 + 2, lge - 3 * lge / 4 - 5, h / 2, "white");
    addCircleBorder(posx + 3, posy, 8, "black");
    addCircleBorder(posx + 15, posy, 8, "black");
    addCircleBorder(posx + lge - 3 - 16, posy - 8, 16, "black");
    if (wagons != null)
      wagons.paint(posx + lge + dist, posy);
  }

  void swap(int a, int b) {
    if(a == b) return;

    Wagon findA = null, aPointer = wagons;
    while(aPointer != null && aPointer.wgNr != a) {
      findA = aPointer;
      aPointer = aPointer.next;
    }

    Wagon findB = null, bPointer = wagons;
    while(bPointer != null && bPointer.wgNr != b) {
      findB = bPointer;
      bPointer = bPointer.next;
    }

    if(aPointer == null && bPointer == null) return;

    if(findA != null) {
      findA.next = bPointer;
    } else {
      wagons = bPointer;
    }

    if(findB != null) {
      findB.next = aPointer;
    } else {
      wagons = aPointer;
    }

    Wagon temp = aPointer.next;
    aPointer.next = bPointer.next;
    bPointer.next = temp;
  }

  void swapInhhalt(int a, int b) {
  }
}

class Wagon {
  final int dist = 3, h = 15;

  int lge = (int) (Math.random() * (110 - 20) + 20);

  static int lfdNr = 1; // Nummer des naechsten Wagons

  Wagon next;
  String col; // farbe, damit der Zug bunt wird.
  int wgNr;

  Wagon() {
    wgNr = lfdNr++;
    int h = (int) (java.lang.Math.random() * 7.9);
    switch (h) {
    case 0:
      col = "red";
      break;
    case 1:
      col = "green";
      break;
    case 2:
      col = "blue";
      break;
    case 3:
      col = "yellow";
      break;
    case 4:
      col = "gray";
      break;
    case 5:
      col = "brown";
      break;
    case 6:
      col = "cyan";
      break;
    case 7:
      col = "pink";
      break;
    }
  }

  void app(Wagon w) {
    if (next == null)
      next = w;
    else
      next.app(w);
  }

  void paint(int posx, int posy) {
    addRectBorder(posx, posy - h, lge, h, col, "" + wgNr);
    addCircleBorder(posx + 3, posy, 8, "black");
    addCircleBorder(posx + lge - 3 - 8, posy, 8, "black");
    // addText(""+wgNr, posx+3, posy-h/2, 8,"yellow");
    if (next != null)
      next.paint(posx + lge + dist, posy);
  }
}

public class Eisenbahn {

  public static void main(String a[]) {
    initWindow();
    Lok l = new Lok(10, 50);
    l.appWagon(new Wagon());
    l.appWagon(new Wagon());
    l.appWagon(new Wagon());
    l.appWagon(new Wagon());
    l.appWagon(new Wagon());
    l.appWagon(new Wagon());
    l.appWagon(new Wagon());
    l.paint();
    initWindow();
    l.swap(2, 5);
    l.paint();
    initWindow();
    l.swapInhhalt(4, 1);
    l.paint();
  }
}
