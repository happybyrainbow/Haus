package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Fence extends InteractiveGraphicalObject {

   public Fence(int x, int y){
       this.x = x;
       this.y = y;
   }

    public void draw(DrawTool drawTool) {
        for (int i = 1; i <= 5; i++) {
            drawTool.setCurrentColor(new Color(139, 69, 19));
            drawTool.drawFilledRectangle(x + (i - 1) * 65, y, 30, 120);
        }
        drawTool.drawFilledRectangle(x, y + 50, 270, 20);
        drawTool.setCurrentColor(new Color(1,1,1));
        drawTool.drawFilledRectangle(0, 700, 1000, 1000);
    }
}
