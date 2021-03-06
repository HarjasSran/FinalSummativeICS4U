/**
 * Caroline Widdecombe, Aidan Goodyer, Harjas Sran
 * Character Select Menu
 * April 10 2021
 */
package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aidan
 */
public class CharacterSelectMenu extends javax.swing.JFrame {

    /**
     * Creates new form CharacterSelectMenu
     */
    ArrayList<ImageIcon> icons = new ArrayList();

    int i = 0;
    /**
     *
     */

    //global variable storing animal
    static int animal;
    static String name;

    /**
     * accessor method to get the users name
     *
     * @return
     */
    public static String getUsername() {
        return name; //return the name 
    }

    /**
     *
     * @return integer denoting user animal choice
     */
    /**
     * accessor method to get the animal
     *
     * @return
     */
    public static String getAnimal() {

        String animals[] = {"gorilla", "giraffe", "tiger", "zebra"};
        return animals[animal]; //return array of animals
    }
    MainMenuGUI m;

    /**
     * menu to select the character
     *
     * @param mainMenu
     */
    static Font pixelFont;
    static Font largePixelFont;
    static Font gameFont;

    /**
     * method for the character select menu
     * @param mainMenu 
     */
    public CharacterSelectMenu(MainMenuGUI mainMenu) {
        m = mainMenu;
        
        //fonts
        try {
            pixelFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("fonts/pixelfont.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(pixelFont.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("fonts/pixelfont.ttf")));
        } catch (IOException | FontFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //different size of fonts
        largePixelFont = pixelFont.deriveFont(60.0f);
        gameFont = pixelFont.deriveFont(100.0f);

        //icon for animals, jar
        URL gorillaURL = CharacterSelectMenu.class.getResource("/icons/gorillaIcon.png");
        ImageIcon gorilla = new ImageIcon(gorillaURL);

        URL giraffeURL = CharacterSelectMenu.class.getResource("/icons/giraffeIcon.png");
        ImageIcon giraffe = new ImageIcon(giraffeURL);

        URL tigerURL = CharacterSelectMenu.class.getResource("/icons/tigerIcon.png");
        ImageIcon tiger = new ImageIcon(tigerURL);

        URL zebraURL = CharacterSelectMenu.class.getResource("/icons/zebraIcon.png");
        ImageIcon zebra = new ImageIcon(zebraURL);
        
        //add icons of animals to list
        icons.add(gorilla);
        icons.add(giraffe);
        icons.add(tiger);
        icons.add(zebra);

        initComponents();
        //set font where name is entered
        nameField.setFont(largePixelFont);
        warning.setVisible(false);
        
        warning.setFont(largePixelFont);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/windowIcon.png")));
        //set icon dependent on character of choice
        jLabel1.setIcon(icons.get(i));


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
        warning = new javax.swing.JLabel();
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

        nameField.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setToolTipText("Enter your Username");
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

        warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warning.setText("WARNING TEXT ");
        getContentPane().add(warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 670, 850, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/forest.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        //if the user presses the right button, show the user the next character
        if (i < icons.size() - 1) {//if i is less than incons size - 1
            
            i++;

        } else {//if i is greater or equal to the icons size-1
            i = 0;
        }
        jLabel1.setIcon(icons.get(i));//set the j label equal to the icons at i


    }//GEN-LAST:event_rightActionPerformed

    private void LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftActionPerformed
        //if the user presses th left button, show the user the previous character
        if (i > 0) {//if i is greater than 0
            //ImageIcon icon = new ImageIcon(icons.get(i + 1));
            System.out.println(i);
            i--;

            System.out.println(icons.get(i));//print the icon at i
        } else {//if i is less than 0
            i = icons.size() - 1;
        }
        jLabel1.setIcon(icons.get(i));//set the icon the the character at i


    }//GEN-LAST:event_LeftActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        //if the user presses hte start button, gether information and close this window and open the game window
        //get name from user input field
        name = nameField.getText();
        //get animal index from user input
        animal = i;

        if (name.length() > 0) {//if the length of the users name is greater than 0
            //Makes a new window when start is clicked

            JFrame game = new JFrame("Animal Jitsu");
            game.setSize(1280, 720);

            game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            GameScreen gameScreen = new GameScreen(game,m);
            game.add(gameScreen);
            game.setVisible(true);
            game.setLocationRelativeTo(null);
            game.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/windowIcon.png")));
            
            game.setResizable(false); 
            this.setVisible(false);

            //Makes a new window when start is clicked
        } else {//if the useer does not entr a name
            warning.setForeground(new Color(200, 0, 0));
            warning.setText("PICK A NAME BEFORE CONTINUING");//tell the user to entr their name before continuing
            warning.setVisible(true);
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        //if the user presses the return button, close this window and open the main menu 
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
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
