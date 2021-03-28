import static jsTools.Graph.*;
import java.lang.Math;

public class Aufgabe8 {
    
    public static void main(String[] args) {
        serpinskyDreieck(400, 300, 600);
    }

    public static void serpinskyDreieck(int x, int y, int a) {
        //initWindow();
        int h = (int)(a*Math.sqrt(3))/2;
        addTriangleBorder(x, y, a, h, 0, "white");
        a = a/2;
        if(a <= 15) return;
        serpinskyDreieck(x-a/2, y, a); // linkes Dreieck
        serpinskyDreieck(x+a/2, y, a); // rechtes Dreieck
        serpinskyDreieck(x, y-h/2, a); // oberes Dreieck
        
    }
}
