/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aidan
 */
public class MainMenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuGUI
     * @throws javax.sound.sampled.UnsupportedAudioFileException
     * @throws java.io.IOException
     * @throws javax.sound.sampled.LineUnavailableException
     */
    
   static Clip clip=null; 
    public MainMenuGUI()  {
        initComponents();
        
        
      // set icon image to penguin character
       this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/windowIcon.png")));
        
        
        //throws UnsupportedAudioFileException, IOException, LineUnavailableException
        //C:\Users\Aidan\Documents\SummativeProjectNewestVersion\FinalSummativeICS4U\FinalProject\dist\FinalProject.zip\finalproject
        
        try{
        // File f = new File("/finalproject/naruto.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getResourceAsStream("/finalproject/naruto.wav")));

        clip = AudioSystem.getClip();
        
        clip.open(audioStream);
        
        clip.start();
        
        clip.loop(javax.sound.sampled.Clip.LOOP_CONTINUOUSLY);
      
            
            
        }catch(LineUnavailableException | IOException | UnsupportedAudioFileException e){
            JOptionPane.showMessageDialog(null, "The following Error occured:" + e); 
        }
        
        
        

    }

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        btnInstructions = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnCredits = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animal Jitsu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/StartButton1.png"))); // NOI18N
        btnStart.setText("jButton1");
        btnStart.setBorderPainted(false);
        btnStart.setContentAreaFilled(false);
        btnStart.setFocusPainted(false);
        btnStart.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/StartButton2.png"))); // NOI18N
        btnStart.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/StartButton3.png"))); // NOI18N
        btnStart.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/StartButton2.png"))); // NOI18N
        btnStart.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/StartButton2.png"))); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 278, -1));

        btnInstructions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/InstructionsButton1.png"))); // NOI18N
        btnInstructions.setBorderPainted(false);
        btnInstructions.setContentAreaFilled(false);
        btnInstructions.setFocusPainted(false);
        btnInstructions.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/InstructionsButton2.png"))); // NOI18N
        btnInstructions.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/InstructionsButton3.png"))); // NOI18N
        btnInstructions.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/InstructionsButton2.png"))); // NOI18N
        btnInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionsActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/volumeON.png"))); // NOI18N
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/volumeOFF.png"))); // NOI18N
        jToggleButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/volumeOFF.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        btnCredits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/CreditsButton1.png"))); // NOI18N
        btnCredits.setBorderPainted(false);
        btnCredits.setContentAreaFilled(false);
        btnCredits.setFocusPainted(false);
        btnCredits.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/CreditsButton2.png"))); // NOI18N
        btnCredits.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/CreditsButton3.png"))); // NOI18N
        btnCredits.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/CreditsButton2.png"))); // NOI18N
        btnCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditsActionPerformed(evt);
            }
        });
        getContentPane().add(btnCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/header.png"))); // NOI18N
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/chunin.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
      
        CharacterSelectMenu characterSelect = new CharacterSelectMenu(this); 
        
       characterSelect.setVisible(true);
        this.setVisible(false);
        
        
        
        
        
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionsActionPerformed
    AnimalJitsuInstructions instructions = new AnimalJitsuInstructions(this); 
    instructions.setVisible(true);
       this.setVisible(false); 
       
    }//GEN-LAST:event_btnInstructionsActionPerformed

    private void btnCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditsActionPerformed
        Credits credits = new Credits(this);

        credits.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCreditsActionPerformed

    boolean music=true; 
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        if(music){
            music= false; 
            clip.stop();
        }else{
            music=true;
            clip.start();
        }
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenuGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCredits;
    private javax.swing.JButton btnInstructions;
    private javax.swing.JButton btnStart;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
