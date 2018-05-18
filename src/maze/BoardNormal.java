package maze;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;



public class BoardNormal extends javax.swing.JPanel implements ActionListener {
    
    
    private Timer timer;
    private Map m;
    private Player p;
    private boolean win = false;
    private boolean answer = false;
    private String message = "";
    private String questionNormal = "";
    private String instruction = "Please use your keyboard to answer";
    private Font font = new Font(new File(".").getCanonicalPath()+"/src/res/JOKERMAN.TTF", Font.BOLD, 48);
    private Font fontQ = new Font(new File(".").getCanonicalPath()+"/src/res/JOKERMAN.TTF", Font.BOLD, 18);
    public BoardNormal() throws IOException {
        m = new Map(2);
        p = new Player();
        addKeyListener(new Al());
        setFocusable(true);
        timer = new Timer(25, this);
        timer.start();
    }
    public void actionPerformed(ActionEvent e) {
        if(m.getMap(p.getTileX(), p.getTileY()).equals("f")) {
            message = "Winner";
            
            questionNormal = "When someone steals another’s personal\ninformation to commit theft or fraud, it is called?\n\n"+
                    "A - Computer piracy\n" +
                    "B - Hacking\n" +
                    "C - Infringement\n" +
                    "D - Identity theft";
            win = true;
        }
        repaint();
    }
    public void paint(Graphics g) {
        super.paint(g);
        if(!win) {
            for(int y=0; y<14; y++) {
                for(int x=0; x<14; x++) {
                    if(m.getMap(x, y).equals("f")) {
                        g.drawImage(m.getFlag(), x*32, y*32, null);
                    }
                    if(m.getMap(x, y).equals("m")) {
                        g.drawImage(m.getMatrix(), x*32, y*32, null);
                    }
                    if(m.getMap(x, y).equals("c")) {
                        g.drawImage(m.getChip(), x*32, y*32, null);
                    }
                }
            }
            g.drawImage(p.getPlayer(), p.getTileX()*32, p.getTileY()*32, null);
        }
        if(win && !answer) {

            
            for(int y=0; y<14; y++) {
                for(int x=0; x<14; x++) {
                    g.drawImage(m.getWinner(), x*32, y*32, null);
                }
            }
            
            g.setColor(Color.yellow);
            g.setFont(fontQ);
            //g.drawString(questionEasy, 10, 10);
            drawString(g,questionNormal,10,10);
            
            g.setColor(Color.cyan);
            g.setFont(fontQ);
            g.drawString(instruction, 10, 300);
            
                    
        }
        if(win && answer)
            {
                 for(int y=0; y<14; y++) {
                for(int x=0; x<14; x++) {
                    g.drawImage(m.getWinner(), x*32, y*32, null);
                }
            }
                 
            g.setColor(Color.cyan);
            g.setFont(font);
            g.drawString(message, 150, 250);
            }
    }
    void drawString(Graphics g, String text, int x, int y) {
    for (String line : text.split("\n"))
        g.drawString(line, x, y += g.getFontMetrics().getHeight());
    }
    public class Al extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) {
                if(!m.getMap(p.getTileX(), p.getTileY()-1).equals("c")) {
                    p.move(0, -1);
                }
            }
            if(keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
                if(!m.getMap(p.getTileX(), p.getTileY()+1).equals("c")) {
                    p.move(0, 1);
                }
            }
            if(keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
                if(!m.getMap(p.getTileX()-1, p.getTileY()).equals("c")) {
                    p.move(-1, 0);
                }
            }
            if(keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
                if(!m.getMap(p.getTileX()+1, p.getTileY()).equals("c")){
                    p.move(1, 0);
                }
            }
            if(win)
            {
                if(keyCode == KeyEvent.VK_D )
                {
                    answer = true;
                }else
                {
                    
                    win = false;
                    answer = false;
                    p.setTileX(1);
                    p.setTileY(12);
                    repaint();
                    
                }
            }
        }
    }
}
