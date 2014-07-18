/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JDialogLevel.java
 *
 * Created on Nov 14, 2011, 4:27:06 PM
 */
package client.View;

import javax.swing.JOptionPane;

/**
 *
 * @author Trung Hoang
 */
public class JDialogLevel extends javax.swing.JDialog {

    /** Creates new form JDialogLevel */

    public JDialogLevel(java.awt.Frame parent, boolean modal, int level) {
        super(parent, modal);
        initComponents();
        if (level == 0) {
            jRadioButtonTraining.setSelected(true);
            jRadioButtonEasy.setEnabled(false);
            jRadioButtonMedium.setEnabled(false);
            jRadioButtonHard.setEnabled(false);
            jRadioButtonHardest.setEnabled(false);
        } else {
            jRadioButtonCompletion.setSelected(true);
        }
        switch (level) {
            case 1:
                jRadioButtonEasy.setSelected(true);
                break;
            case 2:
                jRadioButtonMedium.setSelected(true);
                break;
            case 3:
                jRadioButtonHard.setSelected(true);
                break;
            case 4:
                jRadioButtonHardest.setSelected(true);
                break;

        }
   
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOption = new javax.swing.ButtonGroup();
        buttonGroupLevel = new javax.swing.ButtonGroup();
        jRadioButtonTraining = new javax.swing.JRadioButton();
        jRadioButtonCompletion = new javax.swing.JRadioButton();
        jRadioButtonHardest = new javax.swing.JRadioButton();
        jRadioButtonHard = new javax.swing.JRadioButton();
        jRadioButtonEasy = new javax.swing.JRadioButton();
        jRadioButtonMedium = new javax.swing.JRadioButton();
        jButtonOK = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButtonOK1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Choose Difficulty");
        setBounds(new java.awt.Rectangle(350, 200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        buttonGroupOption.add(jRadioButtonTraining);
        jRadioButtonTraining.setText("Training");
        jRadioButtonTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTrainingActionPerformed(evt);
            }
        });

        buttonGroupOption.add(jRadioButtonCompletion);
        jRadioButtonCompletion.setText("Competion");
        jRadioButtonCompletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCompletionActionPerformed(evt);
            }
        });

        buttonGroupLevel.add(jRadioButtonHardest);
        jRadioButtonHardest.setText("Hardest");

        buttonGroupLevel.add(jRadioButtonHard);
        jRadioButtonHard.setText("Hard");

        buttonGroupLevel.add(jRadioButtonEasy);
        jRadioButtonEasy.setText("Easy");
        jRadioButtonEasy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonGroupLevel.add(jRadioButtonMedium);
        jRadioButtonMedium.setText("Medium");

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose Difficulty");

        jButtonOK1.setText("Cancel");
        jButtonOK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOK1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jRadioButtonTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButtonCompletion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jRadioButtonMedium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonHard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonHardest)
                                .addComponent(jRadioButtonEasy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addGap(36, 36, 36)))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButtonOK1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonTraining)
                    .addComponent(jRadioButtonCompletion))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonEasy)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonMedium)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonHard)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonHardest)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOK1)
                    .addComponent(jButtonOK))
                .addGap(67, 67, 67))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-264)/2, (screenSize.height-400)/2, 264, 400);
    }// </editor-fold>//GEN-END:initComponents

private void jRadioButtonCompletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCompletionActionPerformed
// TODO add your handling code here:
    jRadioButtonEasy.setEnabled(true);
    jRadioButtonMedium.setEnabled(true);
    jRadioButtonHard.setEnabled(true);
    jRadioButtonHardest.setEnabled(true);

}//GEN-LAST:event_jRadioButtonCompletionActionPerformed

private void jRadioButtonTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTrainingActionPerformed
// TODO add your handling code here:    
    jRadioButtonEasy.setEnabled(false);
    jRadioButtonMedium.setEnabled(false);
    jRadioButtonHard.setEnabled(false);
    jRadioButtonHardest.setEnabled(false);
    buttonGroupLevel.clearSelection();
}//GEN-LAST:event_jRadioButtonTrainingActionPerformed

private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
// TODO add your handling code here:
    if (jRadioButtonTraining.isSelected()) {
       
        this.setVisible(false);
        return;
    }
    if (jRadioButtonCompletion.isSelected()) {
        if (jRadioButtonEasy.isSelected()) {
           
            this.setVisible(false);
            return;
        }
        if (jRadioButtonMedium.isSelected()) {
          
            this.setVisible(false);
            return;
        }
        if (jRadioButtonHard.isSelected()) {
         
            this.setVisible(false);
            return;
        }
        if (jRadioButtonHardest.isSelected()) {
            
            this.setVisible(false);
            return;
        }
        JOptionPane.showMessageDialog(rootPane, "Please Choose level!");
    }
}//GEN-LAST:event_jButtonOKActionPerformed

private void jButtonOK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOK1ActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
}//GEN-LAST:event_jButtonOK1ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                JDialogLevel dialog = new JDialogLevel(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupLevel;
    private javax.swing.ButtonGroup buttonGroupOption;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonOK1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonCompletion;
    private javax.swing.JRadioButton jRadioButtonEasy;
    private javax.swing.JRadioButton jRadioButtonHard;
    private javax.swing.JRadioButton jRadioButtonHardest;
    private javax.swing.JRadioButton jRadioButtonMedium;
    private javax.swing.JRadioButton jRadioButtonTraining;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
