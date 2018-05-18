package maze;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class Player {
    private int tileX, tileY;
    private Image player;
    public Player() throws IOException {
        ImageIcon img = new ImageIcon(new File(".").getCanonicalPath()+"/src/res/player.png");
        player = img.getImage();
        tileX = 1;
        tileY = 12;
    }
    public Image getPlayer() { return player; }
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
