package house_cleaning_booking_system;


public class RESET_CONFIRM extends javax.swing.JFrame {

    
    public RESET_CONFIRM() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rc_txtusername = new javax.swing.JLabel();
        rc_txtnewpassword = new javax.swing.JLabel();
        rc_txtverificationcode = new javax.swing.JLabel();
        rc_txtphonenumber = new javax.swing.JLabel();
        rc_username = new javax.swing.JTextField();
        rc_newpassword = new javax.swing.JTextField();
        rc_verificationcode = new javax.swing.JTextField();
        rc_phonenumber = new javax.swing.JTextField();
        rc_sendcodebutton = new javax.swing.JButton();
        rc_resetpasswordbutton = new javax.swing.JButton();
        rc_cancelbutton = new javax.swing.JButton();
        rc_txt = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("HOUSE CLEANING BOOKING SYSTEM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 462, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rc_txtusername.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        rc_txtusername.setText("USERNAME:");
        jPanel2.add(rc_txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 113, -1));

        rc_txtnewpassword.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        rc_txtnewpassword.setText("NEW PASSWORD:");
        jPanel2.add(rc_txtnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 99, 110, -1));

        rc_txtverificationcode.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        rc_txtverificationcode.setText("VERIFICATION CODE:");
        jPanel2.add(rc_txtverificationcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 139, -1, -1));

        rc_txtphonenumber.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        rc_txtphonenumber.setText("PHONE NUMBER:");
        jPanel2.add(rc_txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 172, -1, -1));

        rc_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc_usernameActionPerformed(evt);
            }
        });
        jPanel2.add(rc_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 66, 237, -1));

        rc_newpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc_newpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(rc_newpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 97, 237, -1));
        jPanel2.add(rc_verificationcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 137, 237, -1));
        jPanel2.add(rc_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 237, -1));

        rc_sendcodebutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rc_sendcodebutton.setText("SEND CODE");
        jPanel2.add(rc_sendcodebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 196, -1, -1));

        rc_resetpasswordbutton.setBackground(new java.awt.Color(102, 102, 255));
        rc_resetpasswordbutton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        rc_resetpasswordbutton.setText("RESET PASSWORD");
        rc_resetpasswordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc_resetpasswordbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(rc_resetpasswordbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 237, -1, -1));

        rc_cancelbutton.setBackground(new java.awt.Color(102, 102, 255));
        rc_cancelbutton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        rc_cancelbutton.setText("CANCEL");
        rc_cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc_cancelbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(rc_cancelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 237, 154, -1));

        rc_txt.setText("FILL IN THE FOLLOWING:");
        jPanel2.add(rc_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 28, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 560, 290));

        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ITLAB2-PC06-STUDENT\\Downloads\\b1.jpg")); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rc_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rc_usernameActionPerformed

    private void rc_resetpasswordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc_resetpasswordbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rc_resetpasswordbuttonActionPerformed

    private void rc_newpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc_newpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rc_newpasswordActionPerformed

    private void rc_cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc_cancelbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rc_cancelbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(RESET_CONFIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RESET_CONFIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RESET_CONFIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RESET_CONFIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RESET_CONFIRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton rc_cancelbutton;
    private javax.swing.JTextField rc_newpassword;
    private javax.swing.JTextField rc_phonenumber;
    private javax.swing.JButton rc_resetpasswordbutton;
    private javax.swing.JButton rc_sendcodebutton;
    private javax.swing.JLabel rc_txt;
    private javax.swing.JLabel rc_txtnewpassword;
    private javax.swing.JLabel rc_txtphonenumber;
    private javax.swing.JLabel rc_txtusername;
    private javax.swing.JLabel rc_txtverificationcode;
    private javax.swing.JTextField rc_username;
    private javax.swing.JTextField rc_verificationcode;
    // End of variables declaration//GEN-END:variables
}
