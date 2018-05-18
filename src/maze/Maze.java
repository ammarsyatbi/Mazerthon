package maze;

import java.io.File;
import java.io.IOException;
import javafx.application.Platform;
import javax.swing.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Maze {
    JFrame f;
    public static void main(String [] args,int level) throws IOException {
        
        new Maze(level);
    }
    public Maze(int level) throws IOException {
        f = new JFrame();
        f.setTitle("Maze");
        
        if(level == 1)
        {
        f.add(new BoardEasy());
        }
        else if(level == 2)
        {
            f.add(new BoardNormal());
        }
        else if(level ==3)
        {
            f.add(new BoardHard());
        }
        else if(level ==4)
        {
            f.add(new BoardEasyAI());
        }
        f.setSize(464,485);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void closeMaze()
    {
        f.setVisible(false);
    }
}
