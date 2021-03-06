/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import maze.Maze;

/**
 *
 * @author 53iky0
 */
public class Bot_Stage extends javax.swing.JFrame {

    /**
     * Creates new form botFrame
     */
    public Bot_Stage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        subTitle = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        contentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        topPanel.setBackground(new java.awt.Color(153, 153, 153));
        topPanel.setMaximumSize(new java.awt.Dimension(400, 50));
        topPanel.setMinimumSize(new java.awt.Dimension(400, 50));
        topPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        subTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        subTitle.setText("STAGES");

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back.png"))); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backButton.setMaximumSize(new java.awt.Dimension(30, 30));
        backButton.setMinimumSize(new java.awt.Dimension(30, 30));
        backButton.setPreferredSize(new java.awt.Dimension(30, 30));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(subTitle)
                .addGap(200, 200, 200))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subTitle))
                .addGap(10, 10, 10))
        );

        getContentPane().add(topPanel);
        topPanel.setBounds(0, 0, 400, 50);

        jButton1.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        jButton1.setText("Easy");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1newgame(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 150, 90, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        jButton2.setText("Normal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 150, 100, 30);

        jButton3.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        jButton3.setText("Hard");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 150, 90, 30);

        contentLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        contentLabel.setForeground(new java.awt.Color(0, 51, 204));
        contentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/botlevel.jpg"))); // NOI18N
        contentLabel.setText("BOT LEVEL");
        contentLabel.setMaximumSize(new java.awt.Dimension(400, 300));
        contentLabel.setMinimumSize(new java.awt.Dimension(400, 300));
        contentLabel.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(contentLabel);
        contentLabel.setBounds(-10, -70, 410, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Mazerthon m = new Mazerthon();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1newgame(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1newgame
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Maze maze = new Maze(4);
        } catch (IOException ex) {
            Logger.getLogger(Solo_Stage.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        //maze.setVisible(true);
    }//GEN-LAST:event_jButton1newgame

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Maze maze = new Maze(4);
        } catch (IOException ex) {
            Logger.getLogger(Solo_Stage.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        //maze.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Maze maze = new Maze(4);
        } catch (IOException ex) {
            Logger.getLogger(Solo_Stage.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        //maze.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bot_Stage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bot_Stage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bot_Stage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bot_Stage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bot_Stage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel contentLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel subTitle;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
