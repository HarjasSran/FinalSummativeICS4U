/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Aidan
 */
public class CharacterSelectMenu extends javax.swing.JFrame {

    /**
     * Creates new form CharacterSelectMenu
     */
    
    ArrayList <ImageIcon> icons = new ArrayList(); 
    
    int i = 0;
    /**
     * 
     */
    
    
    //global variable storing animal
    static int animal; 
    static String name; 
    
    
    public static String getUsername(){
       return name;  
    }
    
    
    
    /**
     * 
     * @return integer denoting user animal choice
     */
    
    
    public static String getAnimal(){
        
        String animals[] = {"gorilla", "giraffe", "tiger", "zebra"}; 
        
        
        
        
        return animals[animal]; 
    }
    MainMenuGUI m; 
    public CharacterSelectMenu(MainMenuGUI mainMenu) {
        m = mainMenu; 
        

        ImageIcon gorilla = new ImageIcon("src/icons/gorillaIcon.png");
        ImageIcon giraffe = new ImageIcon("src/icons/giraffeIcon.png");
        ImageIcon tiger = new ImageIcon("src/icons/tigerIcon.png");
         ImageIcon zebra = new ImageIcon("src/icons/zebraIcon.png");
        icons.add(gorilla);
        icons.add(giraffe);
        icons.add(tiger);
        icons.add(zebra);
       
        initComponents();
        // set icon image to penguin character
       this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/windowIcon.png")));
        
        //ImageIcon icon = new ImageIcon(icons.get(i));
        jLabel1.setIcon(icons.get(i));
         System.out.println(jLabel1.getIcon());
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Left = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        right = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/arrowButtonLeft1.png"))); // NOI18N
        Left.setBorderPainted(false);
        Left.setContentAreaFilled(false);
        Left.setFocusPainted(false);
        Left.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/arrowButtonLeft2.png"))); // NOI18N
        Left.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/arrowButtonLeft3.png"))); // NOI18N
        Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftActionPerformed(evt);
            }
        });
        getContentPane().add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 70, -1));

        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 450, 450));

        right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/arrowButton1.png"))); // NOI18N
        right.setBorderPainted(false);
        right.setContentAreaFilled(false);
        right.setFocusPainted(false);
        right.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/arrowButton2.png"))); // NOI18N
        right.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/arrowButton3.png"))); // NOI18N
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });
        getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 60, -1));

        nameField.setFont(new java.awt.Font("8-bit Arcade In", 1, 36)); // NOI18N
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setText("NAME");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 430, 40));

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/StartButton1.png"))); // NOI18N
        btnStart.setBorderPainted(false);
        btnStart.setContentAreaFilled(false);
        btnStart.setFocusPainted(false);
        btnStart.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/StartButton2.png"))); // NOI18N
        btnStart.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/StartButton3.png"))); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 240, -1));

        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/arrowButtonLeft1.png"))); // NOI18N
        returnButton.setBorderPainted(false);
        returnButton.setContentAreaFilled(false);
        returnButton.setFocusPainted(false);
        returnButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/arrowButtonLeft2.png"))); // NOI18N
        returnButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/arrowButtonLeft3.png"))); // NOI18N
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/forest.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        if (i < icons.size()-1) {
            //ImageIcon icon = new ImageIcon(icons.get(i + 1));
            System.out.println(i);
             i++;
           
           
            System.out.println(icons.get(i));
        }else{
            i=0;  
        }
        jLabel1.setIcon(icons.get(i));
        
        
    }//GEN-LAST:event_rightActionPerformed

    private void LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftActionPerformed
  if (i > 0) {
            //ImageIcon icon = new ImageIcon(icons.get(i + 1));
            System.out.println(i);
             i--;
           
           
            System.out.println(icons.get(i));
        }else{
            i=icons.size()-1;  
        }
        jLabel1.setIcon(icons.get(i));
        
        
    }//GEN-LAST:event_LeftActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

        //save user using User class
    }//GEN-LAST:event_nameFieldActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
      
        //get name from user input field
        name = nameField.getText(); 
        //get animal index from user input
        animal = i; 
        //Makes a new window when start is clicked
        
          JFrame game = new JFrame("Game");
        game.setSize(1920,1080);
       
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GameScreen gameScreen =new GameScreen(); 
        game.add(gameScreen); 
        game.setVisible(true);
        game.setLocationRelativeTo(null);
        
        
            //Makes a new window when start is clicked
        
          
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.setVisible(false); 
        m.setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(CharacterSelectMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CharacterSelectMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CharacterSelectMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CharacterSelectMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CharacterSelectMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Left;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton right;
    // End of variables declaration//GEN-END:variables
}
