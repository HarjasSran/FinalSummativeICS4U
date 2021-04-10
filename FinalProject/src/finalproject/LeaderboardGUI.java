//Caroline Widdecombe, Aidan Goodyr, Harjas Sran
//April 10 2021
//
package finalproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileWriter;

public class LeaderboardGUI extends javax.swing.JFrame {
MainMenuGUI m;
static String output = "Name\tRank\n\n";

    /**
     * Creates new form LeaderboardGUI
     */
    public LeaderboardGUI(MainMenuGUI mainMenu) {
        m = mainMenu;
        initComponents();
        String data[] = new String[2];
        data[0]="john";
        data[1] = "2";
        File f = new File("src/finalproject/save.txt");//get file
        ArrayList<String> list = new ArrayList();
        try {
            Scanner s = new Scanner(f); //if file is not found
            
            while (s.hasNextLine()){
                String newData[] = new String[2];
                newData[0] = (s.nextLine());
                newData[1] = (s.nextLine());
                list.add(newData[0]);
                list.add(newData[1]);
                
            }

            //descendingQuickSort(level, 5, 4);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Highscores.class.getName()).log(Level.SEVERE, null, ex);
        }
        list.add(data[0]);
        list.add(data[1]);
        
        //save win counters to data file
        try {
            FileWriter myWriter = new FileWriter("src/finalproject/save.txt");
            for (int i = 0; i < list.size(); i++) {
                myWriter.write(list.get(i)+"\n");
            }
            myWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error:" + e);
        } catch (IOException ex) {
            Logger.getLogger(Highscores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //int level[] = new int[list.size()];
        //String name[] = new String[list.size()];
        System.out.println(list);
        int halfList = list.size()/2;
        String name[] = new String[list.size()/2];
        User users[] = new User[halfList];
        int level[] = new int[list.size()/2];
        for (int i = 0; i < halfList; i++) {
            name[i] = list.get(i*2);
            level[i] = Integer.parseInt(list.get((i*2)+1));
            users[i] = new User(name[i], level[i]);
            
        }
        User userList[]=descendingQuickSort(users, level[0], level[halfList-1]);
        
        for (int i = 0; i < halfList; i++) {
            output = output + userList[i].getName() + "\t" + userList[i].getRank() + "\n";
        }
        textList.setText(output);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLeaderboard = new javax.swing.JLabel();
        txtList = new javax.swing.JScrollPane();
        textList = new javax.swing.JTextArea();
        btnMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLeaderboard.setFont(new java.awt.Font("Krungthep", 0, 24)); // NOI18N
        lblLeaderboard.setText("Leaderboard");
        getContentPane().add(lblLeaderboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        textList.setEditable(false);
        textList.setColumns(20);
        textList.setRows(5);
        txtList.setViewportView(textList);

        getContentPane().add(txtList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 190));

        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        //if the user presses the back button, close this window and open the main menu window
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(LeaderboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaderboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaderboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaderboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
        
        
    }
    public static User[] descendingQuickSort(User[] users, int l, int r) {

        // sort is complete when the left bounds of the array are equal or greater than the right bound
        if (l >= r) {

            return users;

        }

        int left = l;
        int right = r;

        //pivot at the midpoint between left and right boundary, partitioning two side of array
        int pivot = users[(l + r) / 2].getRank();

        //repeat until the left and the right touch
        while (left < right) {

            //increment left until it finds a value less than the pivot (flipped operator from ascending) 
            while (users[left].getRank() > pivot) {
              
                left++;
            }

            //decrement the right until it finds a value greater than pivot (flipped operator from ascending) 
            while (users[right].getRank() < pivot) {
                
                right--;

            }

            if (left <= right) {
                //swap the number at the left and right iterators
                User temp = users[left];
                users[left] = users[right];
                users[right] = temp;
                left++;
                right--;

            }

        }

        //quicksort both partitions of the array
        descendingQuickSort(users, l, right);
        descendingQuickSort(users, left, r);
        return users;
    }

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JLabel lblLeaderboard;
    private javax.swing.JTextArea textList;
    private javax.swing.JScrollPane txtList;
    // End of variables declaration//GEN-END:variables
}
