package maze;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class Bot_AI {
    private int tileX, tileY;
    private Image bot;
    public Bot_AI() throws IOException {
        ImageIcon img = new ImageIcon(new File(".").getCanonicalPath()+"/src/res/com.png");
        bot = img.getImage();
        tileX = 2;
        tileY = 12;
    }
    public Image getPlayer() { return bot; }
    public int getTileX() { return tileX; }
    public int getTileY() { return tileY; }

    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    public void setTileY(int tileY) {
        this.tileY = tileY;
    }
    
    
    public void move(int dx, int dy) {
        tileX += dx;
        tileY += dy;
    }
}
