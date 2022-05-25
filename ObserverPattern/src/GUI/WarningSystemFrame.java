package GUI;

import javax.swing.JFrame;

/**
 *
 * @author elif
 */
public class WarningSystemFrame extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    WarningSystemObjects wso;

    public WarningSystemFrame() {

        wso = new WarningSystemObjects();
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

        cellPhoneButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TVButton = new javax.swing.JButton();
        WatchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cellPhoneButton.setText("Send Message for Cellphones");
        cellPhoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellPhoneButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Integrated Public Alert & Warning System");

        TVButton.setText("Send Message for TVs");
        TVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TVButtonActionPerformed(evt);
            }
        });

        WatchButton.setText("Send Message for Watches");
        WatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WatchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cellPhoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TVButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WatchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cellPhoneButton)
                .addGap(29, 29, 29)
                .addComponent(TVButton)
                .addGap(29, 29, 29)
                .addComponent(WatchButton)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cellPhoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellPhoneButtonActionPerformed
        // TODO add your handling code here:
        JFrame cellPhone = new CellPhoneJFrame();
        cellPhone.setVisible(true);
        cellPhone.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }//GEN-LAST:event_cellPhoneButtonActionPerformed

    private void TVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TVButtonActionPerformed
        // TODO add your handling code here:
        JFrame tv = new TVFrame();
        tv.setVisible(true);
        tv.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }//GEN-LAST:event_TVButtonActionPerformed

    private void WatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WatchButtonActionPerformed
        // TODO add your handling code here:
        JFrame watch = new WatchFrame();
        watch.setVisible(true);
        watch.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }//GEN-LAST:event_WatchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WarningSystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WarningSystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WarningSystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WarningSystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WarningSystemFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TVButton;
    private javax.swing.JButton WatchButton;
    private javax.swing.JButton cellPhoneButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}