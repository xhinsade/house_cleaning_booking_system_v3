package house_cleaning_booking_system;

import javax.swing.*;

public class LOGIN1 extends javax.swing.JFrame {
       
    private javax.swing.JLabel LBPASS;
    private javax.swing.JLabel LBTXT;
    private javax.swing.JLabel LBUSER;
    private javax.swing.JButton LOGINButton;
    private javax.swing.JLabel LORTXT;
    private javax.swing.JPasswordField LPassword;
    private javax.swing.JTextField LUsername;
    private javax.swing.JPanel jPanel1;
    private JButton CREATEButton;
    private JLabel l_forgotpass;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LBPASS = new javax.swing.JLabel();
        LBUSER = new javax.swing.JLabel();
        LUsername = new javax.swing.JTextField();
        LPassword = new javax.swing.JPasswordField();
        LOGINButton = new javax.swing.JButton();
        CREATEButton = new javax.swing.JButton();
        LORTXT = new javax.swing.JLabel();
        l_forgotpass = new javax.swing.JLabel();
        LBTXT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBPASS.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LBPASS.setText("PASSWORD:");
        jPanel1.add(LBPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        LBUSER.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LBUSER.setText("USERNAME:");
        jPanel1.add(LBUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel1.add(LUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 190, -1));
        jPanel1.add(LPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 190, -1));

        LOGINButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LOGINButton.setText("LOGIN");
        LOGINButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LOGINButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 153, 120, 30));

        CREATEButton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        CREATEButton.setText("CREATE ACCOUNT");
        CREATEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREATEButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CREATEButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 153, -1, 30));

        LORTXT.setText("OR");
        jPanel1.add(LORTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, 20));

        l_forgotpass.setText("forgot password");
        l_forgotpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_forgotpassMouseClicked(evt);
            }
        });
        jPanel1.add(l_forgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 410, 250));

        LBTXT.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LBTXT.setText("HOUSE CLEANING BOOKING SYSTEM");
        LBTXT.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "WELCOME TO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18))); // NOI18N
        getContentPane().add(LBTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 480, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINButtonActionPerformed
    
        String username = LUsername.getText();
        String password = new String(LPassword.getPassword());
        
    if (username.equals("xhinsade") && password.equals("xhinsade123")) {
            JOptionPane.showMessageDialog(this, "YOU HAVE SUCCESSFULLY LOGGED IN.");
            JFrame HOMEPAGE; 
            HOMEPAGE = new HOMEPAGE();
            HOMEPAGE.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
        }
    
    }//GEN-LAST:event_LOGINButtonActionPerformed

    private void CREATEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEButtonActionPerformed
       JFrame CREATE_ACCOUNT = new CREATE_ACCOUNT();
       CREATE_ACCOUNT.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CREATEButtonActionPerformed

    private void l_forgotpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_forgotpassMouseClicked
        JFrame RESET_PASSWORD = new RESET_PASSWORD();
        RESET_PASSWORD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l_forgotpassMouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LOGIN1().setVisible(true);
           
            
         }
        
    
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CREATEButton;
    private javax.swing.JLabel LBPASS;
    private javax.swing.JLabel LBTXT;
    private javax.swing.JLabel LBUSER;
    private javax.swing.JButton LOGINButton;
    private javax.swing.JLabel LORTXT;
    private javax.swing.JPasswordField LPassword;
    private javax.swing.JTextField LUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_forgotpass;
    // End of variables declaration//GEN-END:variables
        
                
        
