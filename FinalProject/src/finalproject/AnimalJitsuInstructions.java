/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author carolinewiddecombe
 */
public class AnimalJitsuInstructions extends javax.swing.JFrame {

    /**
     * Creates new form AnimalJitsuInstructions
     */
    public AnimalJitsuInstructions() {
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

        lblInstructions = new javax.swing.JLabel();
        lblBows = new javax.swing.JLabel();
        lblRules = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInstructions.setFont(new java.awt.Font("Krungthep", 0, 24)); // NOI18N
        lblInstructions.setForeground(new java.awt.Color(255, 0, 0));
        lblInstructions.setText("Instructions");

        lblBows.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        lblBows.setForeground(new java.awt.Color(0, 153, 0));
        lblBows.setText("Earn Your Bows");

        lblRules.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        lblRules.setForeground(new java.awt.Color(51, 153, 0));
        lblRules.setText("How to Play");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1. When the game begins, you and Sensei Penguin each \nreceive 5 cards, each with an element and a number.\n\n2. Snow cards defeat Water cards. Water cards beat \nFire cards Fire cards beat Snow cards.\n\n3. If both you and Sensei Penguin choose the same element,\nthe winner of the round will be the card with the highest \nnumber.\n\n4. If you and Sensei Penguin choose a card of the same \nelement and number, nobody wins the round.\n\n5. You will have 15 seconds to choose a card that will\n win help you win the game.\n\n6. The game ends when you or Sensei Penguin have won at \nleast 1 round with each element OR won 3 rounds with \nthe same element.\n");
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Challenge Sensei Penguin to gain experience\nand level up. When you win a match, you will \nadvance to the next bow level.\n");
        jScrollPane1.setViewportView(jTextArea2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/legend.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(lblInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBows)
                            .addComponent(lblRules)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBows)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblRules)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblBows;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblRules;
    // End of variables declaration//GEN-END:variables
}
