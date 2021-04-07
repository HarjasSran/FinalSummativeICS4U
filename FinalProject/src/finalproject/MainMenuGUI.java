/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JFrame;

/**
 *
 * @author Aidan
 */
public class MainMenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuGUI
     */
    public MainMenuGUI() {
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

        btnStart = new javax.swing.JButton();
        btnInstructions = new javax.swing.JButton();
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

        btnCredits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/CreditsButton1.png"))); // NOI18N
        btnCredits.setBorderPainted(false);
        btnCredits.setContentAreaFilled(false);
        btnCredits.setFocusPainted(false);
        btnCredits.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/CreditsButton2.png"))); // NOI18N
        btnCredits.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/CreditsButton3.png"))); // NOI18N
        btnCredits.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/CreditsButton2.png"))); // NOI18N
        getContentPane().add(btnCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/header.png"))); // NOI18N
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/chunin.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
      
        
        //Makes a new window when start is clicked
        
          JFrame game = new JFrame("Game");
        game.setSize(800,800);
       
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GameScreen gameScreen =new GameScreen(); 
        game.add(gameScreen); 
        game.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionsActionPerformed
    AnimalJitsuInstructions instructions = new AnimalJitsuInstructions(); 
    instructions.setVisible(true);
       
       
    }//GEN-LAST:event_btnInstructionsActionPerformed

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
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
