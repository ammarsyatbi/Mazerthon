package maze;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Map {
    private Scanner s;
    private String Map[] = new String[14];
    private Image matrix, chip, player, flag,winner;
    public Map(int level) throws IOException {
        
        ImageIcon img = new ImageIcon(new File(".").getCanonicalPath()+"/src/res/flag.png");
        flag = img.getImage();
        img = new ImageIcon(new File(".").getCanonicalPath()+"/src/res/matrixTile.png");
        matrix = img.getImage();
        img = new ImageIcon(new File(".").getCanonicalPath()+"/src/res/matrixTile.png");
        winner = img.getImage();
        img = new ImageIcon(new File(".").getCanonicalPath()+"/src/res/chip.png");
        chip = img.getImage();
        img = new ImageIcon(new File(".").getCanonicalPath()+"/src/res/player.png");
        player = img.getImage();
        openFile(level);
        readFile();
        closeFile();
    }
    public Image getMatrix() { return matrix; }
    public Image getChip() { return chip; }
    public Image getPlayer() { return player; }
    public Image getFlag() { return flag; }
    public Image getWinner(){return winner;}
    
    
    public String getMap(int x, int y) {
        String index = Map[y].substring(x, x + 1);
        return index;
    }
    public void openFile(int level) { 
        try {
            //System.out.println(new File(".").getCanonicalPath());
            if (level ==1)
        {
            s = new Scanner(new File(new File(".").getCanonicalPath()+"/src/res/MapEasy01.txt"));
        }
        else if (level == 2)
        {
            s = new Scanner(new File(new File(".").getCanonicalPath()+"/src/res/MapNormal.txt"));
        }
        else if (level == 3)
        {
            s = new Scanner(new File(new File(".").getCanonicalPath()+"/src/res/MapHard.txt"));
        }
            
            
        } catch(Exception e) {
            System.out.println("Error loading map.");
        }
    }
    public void readFile() {
        while(s.hasNext()) {
            for(int i=0; i<14; i++) {
                Map[i] = s.next();
            }
        }
    }
    public void closeFile() {
        s.close();
    }
}
