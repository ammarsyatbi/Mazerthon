package maze;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import main.Mazerthon;
import main.Solo_Stage;



public class BoardEasyAI extends javax.swing.JPanel implements ActionListener {
    
    
    private Timer timer;
    private Map m;
    private Player p;
    private Bot_AI bot;
    private boolean win = false;
    private boolean lose = false;
    private boolean answer = false;
    private String message = "";
    private String questionEasy = "";
    private String instruction = "Please use your keyboard to answer";
    private Font font = new Font(new File(".").getCanonicalPath()+"/src/res/JOKERMAN.TTF", Font.BOLD, 48);
    private Font fontQ = new Font(new File(".").getCanonicalPath()+"/src/res/JOKERMAN.TTF", Font.BOLD, 18);
    private int seq = 0;
    public BoardEasyAI() throws IOException {
        m = new Map(1);
        p = new Player();
        bot = new Bot_AI();
        addKeyListener(new Al());
        setFocusable(true);
        
        timer = new Timer(25, this);
        timer.start();
        //MoveBot();
    }
    public void actionPerformed(ActionEvent e) {
        if(m.getMap(p.getTileX(), p.getTileY()).equals("f")) {
            message = "Winner";
            questionEasy = "Tony is breaking into Bruno’s computer to read \n private emails and other files.\n\nTony can be classified as?"+
                    "\n\n A - Hacking "+
                    "\n B - Infringment"+
                    "\n C - Identity theft"+
                    "\n D - Computer Piracy";
            win = true;
        }else if(m.getMap(bot.getTileX(), bot.getTileY()).equals("f")) {
            message = "LOSE";
            instruction = "Press x to exit";
            lose = true;
        }
        repaint();
        
        //start bot
        
    }
    public void paint(Graphics g) {
        super.paint(g);
        if(!win && !lose) {
            for(int y=0; y<14; y++) {
                for(int x=0; x<14; x++) {
                    //lukis player
                    if(m.getMap(x, y).equals("f")) {
                        g.drawImage(m.getFlag(), x*32, y*32, null);
                    }
                    if(m.getMap(x, y).equals("m")) {
                        g.drawImage(m.getMatrix(), x*32, y*32, null);
                    }
                    if(m.getMap(x, y).equals("c")) {
                        g.drawImage(m.getChip(), x*32, y*32, null);
                    }
                    
                    //lukis bot
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
            g.drawImage(bot.getPlayer(), bot.getTileX()*32, bot.getTileY()*32, null);
            g.drawImage(p.getPlayer(), p.getTileX()*32, p.getTileY()*32, null);
        }

        
        if(lose) {
            
            for(int y=0; y<14; y++) {
                for(int x=0; x<14; x++) {
                    g.drawImage(m.getWinner(), x*32, y*32, null);
                }
            }
            
            g.setColor(Color.red);
            g.setFont(font);
            g.drawString(message, 150, 250);
            
            g.setColor(Color.red);
            g.setFont(fontQ);
            g.drawString(instruction, 10, 400);                             
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
            drawString(g,questionEasy,10,10);
            
            g.setColor(Color.cyan);
            g.setFont(fontQ);
            g.drawString(instruction, 10, 300);
            
                    
        }
        else if(win && answer)
            {
                instruction = "Press x to exit";
                 for(int y=0; y<14; y++) {
                     for(int x=0; x<14; x++) {
                      g.drawImage(m.getWinner(), x*32, y*32, null);
                     } 
                }
                 
            g.setColor(Color.cyan);
            g.setFont(font);
            g.drawString(message, 150, 250);
            
            g.setColor(Color.cyan);
            g.setFont(fontQ);
            g.drawString(instruction, 10, 400);
            }
        
        
    }
    void drawString(Graphics g, String text, int x, int y) {
    for (String line : text.split("\n"))
        g.drawString(line, x, y += g.getFontMetrics().getHeight());
    }
    
    public void closeFrame(){
                
                    Mazerthon mz = new Mazerthon();
                    //this.setVisible(false);                    
                    mz.setVisible(true);
                    JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    topFrame.setVisible(false);
                    
    }
    public void MoveBot(int seq) 
    {
        //sequence
             if(seq == 1){bot.move(1, 0);}
             else if(seq == 2){bot.move(1, 0);}
             else if(seq == 4){bot.move(0, -1);}
             else if(seq == 5){bot.move(0, -1);}
             else if(seq == 6){bot.move(0, -1);}
             else if(seq == 7){bot.move(0, -1);}
             else if(seq == 8){bot.move(1, 0);}
             else if(seq == 9){bot.move(1, 0);}
             else if(seq == 10){bot.move(1, 0);}
             else if(seq == 11){bot.move(0, -1);}
             else if(seq == 12){bot.move(0, -1);}
             else if(seq == 14){bot.move(0, -1);}
             else if(seq == 15){bot.move(0, -1);}
             else if(seq == 16){bot.move(-1, 0);}
             else if(seq == 17){bot.move(-1, 0);}
             else if(seq == 18){bot.move(-1, 0);}
             else if(seq == 19){bot.move(-1, 0);}
             else if(seq == 20){bot.move(0, -1);}
             else if(seq == 21){bot.move(1, 0);}
             else if(seq == 22){bot.move(1, 0);}
             else if(seq == 23){bot.move(1, 0);}
             else if(seq == 25){bot.move(1, 0);}
             
              else if(seq == 26){bot.move(0, -1);}
              else if(seq == 27){bot.move(1, 0);}
              else if(seq == 28){bot.move(1, 0);}
             else if(seq == 29){bot.move(1, 0);}
             else if(seq == 30){bot.move(1, 0);}
             else if(seq == 30){bot.move(1, 0);}
             
    }
    
    public class Al extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            
            //AI nye
//             bot.move(0, -1);//atas
//             bot.move(0, 1);//bawah
//             bot.move(-1, 0);//kiri
//             bot.move(1, 0);//kanan
             
             
            //AI Nye
            if(!win && !lose)
            {
                seq +=1;
                MoveBot(seq);
            }
            
            int keyCode = e.getKeyCode();
            if(lose)
            {
                if(keyCode == KeyEvent.VK_X)
                {
                    closeFrame();
                }
            }
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
                if(keyCode == KeyEvent.VK_A )
                {
                    answer = true; 
                    repaint();
                }
                else if(keyCode == KeyEvent.VK_X)
                {
                    closeFrame();
                }
                else
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
