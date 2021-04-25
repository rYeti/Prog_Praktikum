package Aufgabe_22;

interface Tab {
  double x00 = 0.0;
  double x0d = 0.5;
  double x10 = 1.0;
  double x1d = 0.5;

  void printTab(double x1, double x2);

}

public class Additionstabelle implements Tab {

  @Override
  public void printTab(double x1, double x2) {
    System.out.println();
    System.out.print("\t||");
    for (double x = x10; x <= x1; x += x1d)
      System.out.print(x + "\t|");
    System.out.println("|");
    System.out.print("==========||");
    for (double x = x10; x <= x1; x += x1d)
      System.out.print("=========+");
    System.out.println();
    for (double i = x00; i <= x2; i += x0d) {
      System.out.print(i + "\t||");
      for (double j = x10; j <= x1; j += x1d)
        System.out.print((i + j) + "\t|");
      System.out.println();
    }

  }
}

class Multipakationstabelle implements Tab {

  @Override
  public void printTab(double x1, double x2) {
    System.out.println();
    System.out.print("\t||");
    for (double x = x10; x <= x1; x += x1d)
      System.out.print(x + "\t|");
    System.out.println("|");
    System.out.print("==========||");
    for (double x = x10; x <= x1; x += x1d)
      System.out.print("=========+");
    System.out.println();
    for (double i = x00; i <= x2; i += x0d) {
      System.out.print(i + "\t||");
      for (double j = x10; j <= x1; j += x1d)
        System.out.print((i * j) + "\t|");
      System.out.println();
    }

  }

}

class Div implements Tab{

  @Override
  public void printTab(double x1, double x2) {
    System.out.println();
    System.out.print("\t||");
    for (double x = x10; x <= x1; x += x1d)
      System.out.print(x + "\t|");
    System.out.println("|");
    System.out.print("==========||");
    for (double x = x10; x <= x1; x += x1d)
      System.out.print("=========+");
    System.out.println();
    for (double i = x00; i <= x2; i += x0d) {
      System.out.print(i + "\t||");
      for (double j = x10; j <= x1; j += x1d)
        System.out.print((i / j) + "\t|");
      System.out.println();
    }
    
  }
  
}


class TabellenTest {
  public static void main(String[] args) {
    Tab one = new Additionstabelle();
    table(one, 5, 5);
    Tab two = new Multipakationstabelle();
    table(two, 5, 5);
    Tab three = new Div();
    table(three, 5, 5);
  }

  public static void table(Tab t, int x1, int x2) {
    t.printTab(x1, x2);
  }
}
