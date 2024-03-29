/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import javax.swing.JOptionPane;

/**
 *
 * @author Jwilliams96
 */
public class Startup extends javax.swing.JFrame {

    private NumberManager thisGuess;

    /**
     * Creates new form Startup
     */
    public Startup() {
        initComponents();
        thisGuess = new NumberManager();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGuess = new javax.swing.JLabel();
        txtGuess = new javax.swing.JTextField();
        btnGuess = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGuess.setText("Guess:");

        txtGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuessActionPerformed(evt);
            }
        });

        btnGuess.setText("Guess");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });

        lblOutput.setText("Guess A Number From 1 To 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnGuess))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblGuess)
                        .addGap(18, 18, 18)
                        .addComponent(txtGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblOutput)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGuess))
                .addGap(30, 30, 30)
                .addComponent(btnGuess)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed

        String correctValue = "Congradulations, that's correct";
        String toHighValue = "I'm sorry that's too high";
        String toLowValue = "I'm sorry that's too low";
        String invalidInput = "Not a valid input";


        try {

            int valueToCheck = Integer.valueOf(txtGuess.getText());

            switch (thisGuess.checkValue(valueToCheck)) {
                
                case TOO_HIGH:
                    
                    JOptionPane.showMessageDialog(null, toHighValue);
                    break;
                    
                case TOO_LOW:
                    
                    JOptionPane.showMessageDialog(null, toLowValue);
                    break;
                    
                default:
                    
                    JOptionPane.showMessageDialog(null, correctValue);
                    break;
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, invalidInput);
        }

        txtGuess.setText("");
        txtGuess.requestFocus();
    }//GEN-LAST:event_btnGuessActionPerformed

    private void txtGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuessActionPerformed
        btnGuess.doClick();
    }//GEN-LAST:event_txtGuessActionPerformed

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
            java.util.logging.Logger.getLogger(Startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Startup().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuess;
    private javax.swing.JLabel lblGuess;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JTextField txtGuess;
    // End of variables declaration//GEN-END:variables
}
