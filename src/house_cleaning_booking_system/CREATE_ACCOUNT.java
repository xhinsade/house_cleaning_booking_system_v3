package house_cleaning_booking_system;


public class CREATE_ACCOUNT extends javax.swing.JFrame {

   
    public CREATE_ACCOUNT() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ca_txtfullname = new javax.swing.JLabel();
        ca_txtusername = new javax.swing.JLabel();
        ca_txtpassword = new javax.swing.JLabel();
        ca_fullname = new javax.swing.JTextField();
        ca_username = new javax.swing.JTextField();
        ca_paasword = new javax.swing.JPasswordField();
        ca_createbutton = new javax.swing.JButton();
        ca_backbutton = new javax.swing.JButton();
        ca_txtemail = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        ca_txtemail1 = new javax.swing.JLabel();
        ca_phonenumber = new javax.swing.JTextField();
        ca_txtemail2 = new javax.swing.JLabel();
        ca_birthdate = new javax.swing.JTextField();
        ca_txtaddress = new javax.swing.JLabel();
        ca_address = new javax.swing.JPasswordField();
        ca_txtemail3 = new javax.swing.JLabel();
        ca_age = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE ACCOUNT");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "HOUSE CLEANING BOOKING SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 14))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 430, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        ca_txtfullname.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        ca_txtfullname.setText("FULLNAME:");

        ca_txtusername.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        ca_txtusername.setText("USERNAME:");

        ca_txtpassword.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        ca_txtpassword.setText("PASSWORD:");

        ca_createbutton.setBackground(new java.awt.Color(51, 102, 255));
        ca_createbutton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        ca_createbutton.setText("CREATE");
        ca_createbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ca_createbuttonActionPerformed(evt);
            }
        });

        ca_backbutton.setBackground(new java.awt.Color(51, 51, 255));
        ca_backbutton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        ca_backbutton.setText("BACK");
        ca_backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ca_backbuttonActionPerformed(evt);
            }
        });

        ca_txtemail.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        ca_txtemail.setText("EMAIL:");

        ca_txtemail1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        ca_txtemail1.setText("PHONE NO:");

        ca_txtemail2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        ca_txtemail2.setText("AGE:");

        ca_txtaddress.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        ca_txtaddress.setText("ADDRESS:");

        ca_txtemail3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        ca_txtemail3.setText("BIRTHDATE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(ca_txtfullname)
                            .addGap(18, 18, 18)
                            .addComponent(ca_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ca_txtusername)
                                .addComponent(ca_txtpassword)
                                .addComponent(ca_txtaddress))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ca_paasword)
                                .addComponent(ca_username)
                                .addComponent(ca_address, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))))
                    .addComponent(ca_createbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ca_backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ca_txtemail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ca_txtemail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ca_txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ca_txtemail3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ca_age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(ca_phonenumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ca_birthdate))
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ca_txtfullname)
                    .addComponent(ca_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ca_txtemail)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ca_txtusername)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ca_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ca_txtemail1)
                        .addComponent(ca_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ca_txtpassword)
                    .addComponent(ca_paasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ca_txtemail2)
                    .addComponent(ca_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ca_txtaddress)
                    .addComponent(ca_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ca_txtemail3)
                    .addComponent(ca_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ca_createbutton)
                    .addComponent(ca_backbutton))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 670, 320));

        background.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ITLAB2-PC06-STUDENT\\Downloads\\b1.jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ca_createbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ca_createbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ca_createbuttonActionPerformed

    private void ca_backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ca_backbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ca_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(CREATE_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CREATE_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CREATE_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CREATE_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CREATE_ACCOUNT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPasswordField ca_address;
    private javax.swing.JTextField ca_age;
    private javax.swing.JButton ca_backbutton;
    private javax.swing.JTextField ca_birthdate;
    private javax.swing.JButton ca_createbutton;
    private javax.swing.JTextField ca_fullname;
    private javax.swing.JPasswordField ca_paasword;
    private javax.swing.JTextField ca_phonenumber;
    private javax.swing.JLabel ca_txtaddress;
    private javax.swing.JLabel ca_txtemail;
    private javax.swing.JLabel ca_txtemail1;
    private javax.swing.JLabel ca_txtemail2;
    private javax.swing.JLabel ca_txtemail3;
    private javax.swing.JLabel ca_txtfullname;
    private javax.swing.JLabel ca_txtpassword;
    private javax.swing.JLabel ca_txtusername;
    private javax.swing.JTextField ca_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
