package Aufgabe_11;

import static jsTools.Graph.*;

public class OffenerGueterwagen extends Zuladungwagon {

    @Override
    void paint(int posx, int posy) {
        addRectBorder(posx, posy - h, lge, h, col, "" + wgNr);
        addCircleBorder(posx + 3, posy, 8, "black");
        addCircleBorder(posx + lge - 3 - 8, posy, 8, "black");
        addText("" + getClass().getSimpleName(), posx + 3, posy - h / 2, 8, "yellow");

        if (next != null)
            next.paint(posx + lge + dist, posy);
    }
}
