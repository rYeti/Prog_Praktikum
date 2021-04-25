package Aufgabe_21;

import static jsTools.Graph.*;

class Abs {

  final int x0 = 300;
  final int y0 = 400;
  final int scale = 30;

  void paintFunc(double xmin, double xmax) {
    int xEnd = (int)(xmax);
    int yEnd = (int) (xmax * xmax);
    addArrow(x0 , x0, x0, yEnd, blue);
    addArrow(x0, x0, xEnd, x0, blue);
    myAddLine(10, 10, 10, 10);
  }

  void myAddLine(double xa, double ya, double xe, double ye){
    addLine(x0+(int)(xa * scale), y0 + (int)(ya + scale), (int)(xe + scale), (int)(ye * scale), green);
  }
}

class quad {

  public static void main(String args[]) {
    Abs funktionsKlassenInstanz=new Abs();
    //bspFktAsPar(funktionsKlassenInstanz);
    funktionsKlassenInstanz.paintFunc(59, 13);
  }

}
